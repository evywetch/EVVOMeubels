package Rsvier.evvo.medel;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Test {

	private static Logger LOGGER = Logger.getLogger("InfoLOgger");
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3};
		
		try {
			for(int i = 0 ; i < 4 ; i++){
				System.out.println(numbers[i]);
			} 
		}catch(IndexOutOfBoundsException ex){
			 LOGGER.log( Level.WARNING ," This is a warning" );
			// System.out.println(ex.toString());
			}
		
		LOGGER.info("Hello World");
		
	}

}



