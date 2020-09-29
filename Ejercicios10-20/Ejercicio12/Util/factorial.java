package Util;

public class factorial {

	public static int calcularFactorial(int numero) {

		int factorial = 1;
		

		System.out.print("Calcularemos !" + numero + " ->");
		for (int i = 0; i < numero; i++) {

			if (i < numero - 1) {

				System.out.print(numero - i + " * ");
			} else {

				System.out.print(1);
			}
		}
			while (numero != 0) {
				factorial = factorial * numero;
				numero--;
			}
		

		return factorial;
	}

}
