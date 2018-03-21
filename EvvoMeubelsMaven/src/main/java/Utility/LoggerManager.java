package Utility;

import java.io.IOException;
import java.util.logging.*;

public class LoggerManager {

	private static final Logger logger = Logger.getLogger(LoggerManager.class.getName());;
	private static FileHandler fileHandler;

	public LoggerManager() {

	}

	public static Logger getLogger() {

		try {
			if (fileHandler == null) {

				fileHandler = new FileHandler("log.xml");
				logger.info("log.xml is created");

			}

			fileHandler.setLevel(Level.ALL);
			logger.addHandler(fileHandler);

			logger.info("log config is done");

		} catch (SecurityException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Error occured in FileHandler ", e);
		}
		return logger;
	}
}
