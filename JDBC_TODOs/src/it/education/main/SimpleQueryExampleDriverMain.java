package it.education.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleQueryExampleDriverMain {

	public static void main(String[] args) {
		Connection dbConnection = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			String driverClassName ="com.mysql.cj.jdbc.Driver";
			Class.forName(driverClassName);   
			System.out.println("Driver Loaded");
			
			
			//Establish Connection
			String URL = "jdbc:mysql://localhost:3306/cdac";
			String UID="root";
			String PWD="root";
			 dbConnection = DriverManager.getConnection(URL, UID, PWD);
			
			System.out.println("Connected.");
			
			//obtain some statement
			 stmt = dbConnection.createStatement();
			
			//Execute Sql query
			String sqlQuery=" select course_id, course_name, course_provider, course_duration, course_fees from  Course_Master";
			
			 rs= stmt.executeQuery(sqlQuery);
			
			 //perform Navigation
			 while(rs.next()) {
				 int course_id = rs.getInt(1);
				 String course_name = rs.getString(2);
				String course_provider = rs.getString(3);
				int course_duration =rs.getInt(4);
				int course_fees=rs.getInt(5);
				 System.out.println(" Id, "+course_id+" Name , "+course_name+" Provider ,"+course_provider+" Duration, "+course_duration+" Fees "+course_fees);
			 }
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//closing all the resources
			try {
				rs.close();
				stmt.close();
				dbConnection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	
	}



	}


