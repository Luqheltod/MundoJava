package utilidades;

import java.util.Arrays;

public class ordenarArray {

	
	
	public static String[] ordenarArray(String [] aOrdenar ) {
		
		
		String [] ordenado = aOrdenar ;
		
		//pasamos las cadenas a mayuscula la primera letra para que no haya problemillas
		for (int i = 0; i < ordenado.length; i++) {
			
			
			aOrdenar[i] = mayusPrimera(aOrdenar[i]);
			
		}
		
		//y ahora lo ordenamos 
		
		Arrays.sort(aOrdenar);
		
		return aOrdenar;
	}
	
	public static String mayusPrimera(String cadena) {
		 
		    return cadena.substring(0, 1).toUpperCase() + cadena.substring(1); 
		  }
		}
	

