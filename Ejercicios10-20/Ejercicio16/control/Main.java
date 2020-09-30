package control;

import Util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] tirada = new int[100];
		
		
		metodos.rellenaArrayDado6(tirada);
		
	int [] frecuencia = 	metodos.Frecuencia(tirada);
		
	System.out.println("El numero que mas sale es " +metodos.calculaMayor(frecuencia));
		
	}

	
}
