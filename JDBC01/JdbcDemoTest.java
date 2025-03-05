package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemoTest {

	public static void main(String[] args) {
		try {
			
			Class.forName("org.postgresql.Driver");
			System.out.println("PostgreSQL JDBC Driver Registered!");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found! " + e.getMessage());
		}
		
		
		String url = "jdbc:postgresql://localhost:5432/db01";
        String user = "postgres";
        String password = "postgres";
        
        
        String sql = "INSERT INTO employee (name, salary) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
   
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "John Doe");
            pstmt.setDouble(2, 50000);
            // is used for INSERT, UPDATE, DELETE operations.
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new employee was inserted successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error inserting data: " + e.getMessage());
        }
    }
}
	