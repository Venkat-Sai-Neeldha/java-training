package jdbc2;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 * @author venkat
 * @apiNote transaction database
 * */
public class JDBCTransactionExample {

    public static void transferFunds(int fromAccountId, int toAccountId, double amount) {
        Connection conn = null;
        PreparedStatement stmt1 = null;
        PreparedStatement stmt2 = null;

        try {
            /*** Connecting to the database */
            String dbURL = "jdbc:postgresql://localhost:5432/db01"; 
            String username = "postgres";
            String password = "postgres"; 
            conn = DriverManager.getConnection(dbURL, username, password);

            /**  Starting a transaction*/
            conn.setAutoCommit(false); 

            /** Prepareing SQL statements*/
            String sql1 = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
            stmt1 = conn.prepareStatement(sql1);
            stmt1.setDouble(1, amount);
            stmt1.setInt(2, fromAccountId);
            stmt1.executeUpdate();

            String sql2 = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
            stmt2 = conn.prepareStatement(sql2);
            stmt2.setDouble(1, amount);
            stmt2.setInt(2, toAccountId);
            stmt2.executeUpdate();

            /** Commiting the transaction*/
            conn.commit();
            System.out.println("Transaction completed successfully!");

        } catch (Exception e) {
        
            try {
                if (conn != null) {
                    conn.rollback(); 
                    System.out.println("Transaction rolled back due to an error.");
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }

            e.printStackTrace();

        } finally {
           
            try {
                if (stmt1 != null) stmt1.close();
                if (stmt2 != null) stmt2.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /** Main method to test the transaction*/
    public static void main(String[] args) {
  
        transferFunds(1, 2, 1000.0);
    }
}
