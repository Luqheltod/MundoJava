package util;

public class utilidades {

	public static void rellenaArray2d(int[][] array) {

		for (int j = 0; j < array.length; j++) {

			for (int i = 0; i < array[0].length; i++) {

				array[j][i] = i;
			}

		}
	}

	public static void mostrarArray2d(int[][] array) {

		for (int j = 0; j < array.length; j++) {
			System.out.print("\nMatriz " + j + "--> ");

		for (int i = 0; i < array[0].length; i++)

			System.out.print(" " + array[j][i]);

	}

}}
