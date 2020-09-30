package modelo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calcular {
	
	private static Logger logger = LogManager.getLogger(Calcular.class);
	
		public static int dividirNumero (int dividendo,int divisor) {
				
			int resultado = 0;
			
		  try {
			  
			  resultado = dividendo/divisor;
			  
		  	 }catch (ArithmeticException e) {
		  		logger.error("Error , estas dividiendo por cero!");
		  	 }
		
		  return resultado;
		  
		}


}
