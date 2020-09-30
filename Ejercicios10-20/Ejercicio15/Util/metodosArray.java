package Util;

import Util.*;

public class metodosArray {

	public static void imprimeNumeros(int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {

			if (i < numeros.length - 1) {
				System.out.print(numeros[i] + ",");
			} else {

				System.out.println(numeros[numeros.length - 1]);
			}

		}
	}

	public static int[] crearArray(int tamanio) {

		int[] array = new int[tamanio];

		for (int i = 0; i < array.length; i++) {

			array[i] = Lector.leerNumero("Introduce valor numero: " + (i + 1));
		}

		return array;
	}

	public static int sumaNumeros(int[] array) {

		int suma = 0;
		for (int i = 0; i < array.length; i++) {

			suma += array[i];
		}

		return suma;

	}
	
	public static int[] arrayInverted(int[] array) {
		
		int longitud = array.length;
		int[] inverted = new int[longitud];
		
		for (int i = 0; i < inverted.length; i++) {
			inverted[i] = array[longitud-(1+i)];
		}
		
		
		return inverted;
	}
	
}
