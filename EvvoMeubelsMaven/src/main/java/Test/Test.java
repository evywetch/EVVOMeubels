package Test;


import java.util.logging.Level;
import java.util.logging.Logger;

import Utility.LoggerManager;

public class Test {

	private static final Logger logger = (Logger) LoggerManager.getLogger();

	public static void main(String[] args) {

		logger.log(Level.INFO, " This is a warning");

		logger.severe("Hello World");

	}

}
