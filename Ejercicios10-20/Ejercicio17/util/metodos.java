package util;

public class metodos {

	public static int[] comprobarCadenas(String texto) {

		String[] partes = texto.split(" ");
		int[] cadenas = new int[partes.length];

		for (int i = 0; i < cadenas.length; i++) {
			
		cadenas[i] =	partes[i].length() ;
			
		}
		
		return cadenas;
	}

	public static void imprimeNumeros(int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {

			if (i < numeros.length - 1) {
				System.out.print(numeros[i] + ",");
			} else {

				System.out.println(numeros[numeros.length - 1]);
			}

		}
	}

}
