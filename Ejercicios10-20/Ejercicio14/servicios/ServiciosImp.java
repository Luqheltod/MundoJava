package servicios;

import java.util.InputMismatchException;

import utilidades.Lector;

public class ServiciosImp {

	public void pedirNumeros() {

		int limiteInferior = 0;
		int limiteSuperior = 0;
		boolean condicion = false;

		System.out.println("Introduce el limite inferior");

		limiteInferior = Lector.leerNumero();

		System.out.println("Introduce el limite superior");

		limiteSuperior = Lector.leerNumero();

		System.out.println(
				"Introduce numeros, si esta en los rangos se elevara al cubo(introduce cualquier letra para salir)");
		do {
			try {
				int numeroIntroducido = Lector.leerNumero();

				if (numeroIntroducido > limiteInferior && numeroIntroducido < limiteSuperior) {

					System.out.println(Math.pow(numeroIntroducido, 3));
				}

			} catch (InputMismatchException e) {

				System.out.println("Se saldra del programa");
				condicion = true;
			}

		} while (!condicion);

	}

}
