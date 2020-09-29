package Edad;

import Util.Lector;

public class Edad {

	private int edad;
	private final int MAYOREDAD = 18;

	public int getEdad() {
		return edad;
	}

	public Edad() {

	}

	public Edad(int edad) {

		this.edad = edad;
	}

	public boolean comprobarEdad() {

		if (edad >= MAYOREDAD) {

			return true;
		} else {
			return false;
		}
	}

	public void pedirEdad(int x) {
		
if(comprobarEdad()) {
	System.out.println("Eres mayor de edad");
}else {
	System.out.println("No eres mayor de edad");
}

		
		
		
	}

}
