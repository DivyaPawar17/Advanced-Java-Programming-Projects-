package example.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import example.utils.JdbcUtils;

public class UserValidator {
	
	public static boolean isValid(User currentUserRef) {
		
		//code to interact with DB and return boolean value
		boolean success = false;
		String sqlQuery = "select * from app_users where user_id = ? and user_pwd = ?";
		try(
				Connection dbConnection = JdbcUtils.buildConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				){
			
			String currentUserName  = currentUserRef.getUserId();
			String currentUserpassword = currentUserRef.getPassword();
			
			pstmt.setString(1, currentUserName);
			pstmt.setString(2, currentUserpassword);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) //Check if user is valid
				
			success = true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return success;
	}

}
