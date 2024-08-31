package example.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {

public static Connection buildConnection() throws Exception{
		
	    Class.forName("com.mysql.cj.jdbc.Driver");
		String URl = "jdbc:mysql://localhost:3306/cdac";
		String UID = "root";
		String PWD = "password";
		Connection dbConnection = DriverManager.getConnection(URl,UID,PWD);
		
		return dbConnection;
		
	}


}

