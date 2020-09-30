package Util;

public class metodos {

	public static void rellenaArrayDado6(int[] array) {

		for (int i = 0; i < array.length; i++) {

			array[i] = 1 + (int) Math.round(Math.random() * (6 - 1));

		}

	}

	public static int[] Frecuencia(int[] array) {

		int x1, x2, x3, x4, x5, x6;
		x1 = x2 = x3 = x4 = x5 = x6 = 0;
		int valor = 0;
		for (int i = 0; i < array.length; i++) {

			valor = array[i];

			switch (valor) {

			case 1:
				x1 += 1;
				break;

			case 2:
				x2 += 1;
				break;
			case 3:
				x3 += 1;
				break;

			case 4:
				x4 += 1;
				break;

			case 5:
				x5 += 1;
				break;

			case 6:
				x6 += 1;
				break;
			}

		}

		System.out.println("El numero de unos es : " + x1);
		System.out.println("El numero de doses es : " + x2);
		System.out.println("El numero de treses es : " + x3);
		System.out.println("El numero de cuatros es : " + x4);
		System.out.println("El numero de cincos es : " + x5);
		System.out.println("El numero de seises es : " + x6);
         
		int[ ] arrayFrequencia = new int [6];
		
		
		arrayFrequencia[0] = x1;
		arrayFrequencia[1] = x2;
		arrayFrequencia[2] = x3;
		arrayFrequencia[3] = x4;
		arrayFrequencia[4] = x5;
		arrayFrequencia[5] = x6;
	
		
		return arrayFrequencia;
	}

	public static int calculaMayor(int[] array) {

		int mayor = 0;
        int indice = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] > mayor) {
				mayor = array[i];
				indice = i+1;
			}
		}
		return indice;
	}

}
