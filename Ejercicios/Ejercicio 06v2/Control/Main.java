package Control;

import java.util.InputMismatchException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Util.Lector;

import Edad.Edad;

public class Main {

	private static Logger logger = LogManager.getLogger(Main.class);
	

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {

			try {

				int x = Lector.leerNumero("Dime 4 edades carambana");
				Edad c = new Edad(x);
				c.comprobarEdad();
				c.pedirEdad(x);
				if (c != null) {
                   logger.info("Se introdujo un valor valido");
				}
			} catch (InputMismatchException e) {

				logger.error("Error al introducir la edad");

			}

		}
		
	}
	// Edad.pedirEdad();
}
