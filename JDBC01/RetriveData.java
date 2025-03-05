package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetriveData {

	public static void main(String[] args) {
		 String url = "jdbc:postgresql://localhost:5432/db01";
	        String user = "postgres";
	        String password = "postgres";

	        String sql = "SELECT * FROM employee";

	        try (Connection conn = DriverManager.getConnection(url, user, password);
	             PreparedStatement pstmt = conn.prepareStatement(sql);
	   
	             ResultSet rs = pstmt.executeQuery()) {
	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                double salary = rs.getDouble("salary");

	                System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
	            }
	        } catch (SQLException e) {
	            System.out.println("Error fetching data: " + e.getMessage());
	        }

	}

}
