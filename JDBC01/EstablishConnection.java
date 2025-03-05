package com.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishConnection {
	
	 public static void main(String[] args) {
		 
		 	String url = "jdbc:postgresql://localhost:5432/db01";
	        String user = "postgres";
	        String password = "postgres";
	        
	        try (Connection conn = DriverManager.getConnection(url, user, password)) {
	        
	            if (conn != null) {
	                System.out.println("Connected to the PostgreSQL database!");
	            } else {
	                System.out.println("Failed to connect.");
	            }
	        } catch (SQLException e) {
	            System.out.println("Connection error: " + e.getMessage());
	        }
	        
	        try {
	        	
	        } catch (Exception e){
	        	
	        }
	    }

}