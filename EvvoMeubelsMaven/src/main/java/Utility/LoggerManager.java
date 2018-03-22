package Utility;

import java.io.IOException;
import java.util.logging.*;

public class LoggerManager {

	public LoggerManager() {

	}

	public static Logger getLogger() {

		Logger logger = Logger.getLogger(LoggerManager.class.getName());
		FileHandler fileHandler = null;
		try {
			if (fileHandler == null) {

				fileHandler = new FileHandler("log.xml", true);
				logger.info("log.xml is created");

			}

			fileHandler.setLevel(Level.ALL);
			fileHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(fileHandler);

			logger.info("log configuration is done");

		} catch (SecurityException e) {

			e.printStackTrace();
		} catch (IOException e) {
			logger.log(Level.WARNING, "Error occured in FileHandler ", e);
		}
		return logger;
	}
}
