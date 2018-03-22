package Utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionManager {

	private static final Logger logger = LoggerManager.getLogger();

	public static Connection getConnection() throws SQLException, ClassNotFoundException {


		// create String variables to hold url, user and password
		String url = null;
		String user = null;
		String password = null;

		// create variables for reading file
		BufferedReader br = null;
		File file = null;
		FileReader fileReader = null;

		try {

			if (file == null && fileReader == null && br == null) {
				file = new File("EvyDatabaseInfo.txt"); 	// create a file
				fileReader = new FileReader(file); 			// add a file in FileReader

				br = new BufferedReader(fileReader); 		// Always wrap FileReader in BufferedReader
														
			}
			// assign each line that being read to url, user and password
			url = br.readLine();
			user = br.readLine();
			password = br.readLine();

		} catch (FileNotFoundException e) {
			logger.info("File is not found");
		} catch (IOException e) {
			logger.info("Error reading file");
		}

		// Connect to a database
		Connection conn = DriverManager.getConnection(url, user, password);

		// close BufferedReader stream
		try {
			br.close();
		} catch (IOException e) {
			logger.info("Error closing reader stream");
		}

		return conn;
	}

}
