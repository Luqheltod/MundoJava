package servicios;

public class servicios {

	
	public static void comprobarPalabras(String[] termino) {
		int contadorPalabras = 0;
		System.out.println("Palabra a definir : " + termino[0] + " nº letras: " + termino[0].length());

		String[] separado = termino[1].split(" ");

		for (int i = 0; i < separado.length; i++) {

			System.out.print("Palabra: " + (i + 1) + "- " + separado[i] + ", nº letras = ");
			System.out.println(separado[i].length());
			contadorPalabras++;
		}
		System.out.println("Total Palabras en la definicion: " +contadorPalabras);
	}
}


