package control;

import Util.metodosArray;

public class Main {

	public static void main(String[] args) {

		int[] elArray = { 1, 7, 3, 4, 8, 43 };

		metodosArray.imprimeNumeros(elArray);

		/*
		 * int x[] = metodosArray.crearArray(3);
		 * 
		 * metodosArray.imprimeNumeros(x);
		 * 
		 * }
		 */

		System.out.println(metodosArray.sumaNumeros(elArray));
        
	int[] arrayinvert =	metodosArray.arrayInverted(elArray);
		
	 metodosArray.imprimeNumeros(arrayinvert);
	
	} 
}
