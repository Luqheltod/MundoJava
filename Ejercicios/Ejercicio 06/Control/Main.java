package Control;


import Util.Lector;
import Edad.Edad;



public class Main {

	public static void main(String[] args) {
		
		
		
		int x = Lector.leerNumero("Dime tu edad carambana");
		Edad c = new Edad(x);
		c.comprobarEdad();
		c.pedirEdad(x);
		
		
	}
	//Edad.pedirEdad();
}
