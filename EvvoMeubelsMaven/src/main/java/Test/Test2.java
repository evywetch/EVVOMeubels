package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Utility.ConnectionManager;

public class Test2 {

	public static void main(String[] args) {

		Connection conn = null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");

			
				conn = ConnectionManager.getConnection();
			
			String query = "select email from users where id = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, 1);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				
				System.out.println( "Email = " + rs.getString(1));
				
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Can't get connection");
		
		} catch (SQLException e) {
			System.out.println("Can't connect database");
		}
		
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("Can't close connection");
		}

	}

}
