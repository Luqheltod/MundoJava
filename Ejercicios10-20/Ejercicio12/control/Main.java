package control;

import Util.*;

public class Main {

	//implementar o bien numeros cientificos o un metodo que informe de que el numero es demasiado grande.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce un numero para calcular su factorial");

	int x = factorial.calcularFactorial(Lector.leerNumero());
		System.out.println("\nEl resultado es " + x);
	}

}
