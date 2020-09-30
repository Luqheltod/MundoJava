package control;
import utilidades.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

 String resultado= (utilidades.esPalindromo(Lector.leerString("Introduza una palabra, determinaremos si es un palindromo" ))?"Es un palindromo":"No es un palindromo");	
		
		System.out.println(resultado);
	}

}
