import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;

public class ApacheDBCPExample {
    private static BasicDataSource dataSource;

    static {
        /**Configure Apache DBCP Connection Pool*/
        dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres"); 
        dataSource.setUsername("postgres");
        dataSource.setPassword("root"); 
        dataSource.setMinIdle(2); 
        dataSource.setMaxIdle(5);  
        dataSource.setMaxTotal(5); 
        dataSource.setMaxWait(Duration.ofMinutes(1)); 
        
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

   
    public static void insertData(String name, double balance) {
        String sql = "INSERT INTO accounts (name, balance) VALUES (?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setDouble(2, balance);
            stmt.executeUpdate();
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void fetchData() {
        String sql = "SELECT * FROM accounts";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Balance: " + rs.getDouble("balance"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void printConnectionStats() {
        System.out.println("Active Connections (Used): " + dataSource.getNumActive());
        System.out.println("Idle Connections (Available): " + dataSource.getNumIdle());
        System.out.println("-------------------------------------------------");
    }

    public static void closeDataSource() {
        try {
            dataSource.close();
            System.out.println("Connection pool closed.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** 
     * Main method to test connection pooling*/
    public static void main(String[] args) {
        try {
            System.out.println("Before getting connections:");
            printConnectionStats();

            Connection conn1 = getConnection();
            Connection conn2 = getConnection();
           System.out.println(conn1.hashCode());  
           System.out.println(conn2.hashCode());  

            System.out.println("After acquiring 2 connections:");
            printConnectionStats();

            conn1.close();
            conn2.close();

            System.out.println("After releasing 2 connections:");
            printConnectionStats();

            
            insertData("John Doe", 5000.0);
            insertData("Alice Smith", 7000.0);
            fetchData();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeDataSource();
        }
    }
}
