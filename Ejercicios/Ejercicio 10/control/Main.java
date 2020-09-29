package control;

import Model.Edad;
import Util.Lector;

public class Main {

	public static void main(String[] args) {
		
		int x = Lector.leerNumero("Introduce tu edad");
		
		Edad edad = new Edad(x);
		
		edad.combrobarEdad();
		
		
		
		
	}

}
