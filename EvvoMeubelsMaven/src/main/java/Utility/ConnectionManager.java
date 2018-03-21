package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionManager {
	
	private static final Logger LOGGER = 
			Logger.getLogger(ConnectionManager.class.getName()); 

	public  Connection getConnection() throws SQLException, ClassNotFoundException{
		
		// Load the JDBC Driver
		
			Class.forName("com.mysql.jdbc.Driver");
			LOGGER.log(Level.INFO,"Driver is loaded");
			
		// Connect to a database	
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workshop1","root","Pw19102528!");
			
			LOGGER.log(Level.INFO,"Database is connected");
			
			
		
		
		
			return conn;
	}
	
	
}
