package Util;

import java.util.*;

public class Lector {

	/*
	 * public static int leerNumero() { // preguntar porqu� esto es una mierda y
	 * solo vale para un uso?
	 * 
	 * Scanner entrada = new Scanner(System.in); int x= entrada.nextInt();
	 * 
	 * return x; }
	 */

	public static int leerNumero() {
		return new Scanner(System.in).nextInt();
	}

	public static int leerNumero(String msg) {
		System.out.println(msg);
		// Llama al metodo de arriba
		return leerNumero();
	}

}
