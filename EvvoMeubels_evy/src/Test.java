import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userInfo","root","Pw19102528!");
			String query = "select email from users where id = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, 1);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				
				System.out.println( "Email = " + rs.getString(1));
				
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
