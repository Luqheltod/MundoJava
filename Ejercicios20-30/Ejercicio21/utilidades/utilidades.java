package utilidades;

public class utilidades {

	
	
	
	public static boolean esPalindromo(String cadena) {
		boolean palindromo = false;
		//pasamos la cadena a stringbuilder, que es quien tiene el metodo que nos interesa.
		StringBuilder check  = new StringBuilder(cadena);
		String cadena2 = check.reverse().toString();
		
		if(cadena.equals(cadena2)) {
			palindromo = true;
		}
		
				return palindromo;
	}
}
