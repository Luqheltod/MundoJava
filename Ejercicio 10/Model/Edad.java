package Model;



public class Edad {

	private int edad;

	public int getEdad() {
		return edad;
	}

	public Edad() {

	}

	public Edad(int edad) {

		this.edad = edad;
	}

	public void combrobarEdad() {

		if (edad > 0 && edad <4) {

			System.out.println(" eres peque�in");
		}
		if (edad > 4 && edad <10) {

			System.out.println(" eres ni�o");
		}
		if (edad > 10 && edad < 40) {

			System.out.println(" eres adolescente");
		}
		if (edad > 40) {

			System.out.println(" eres talludito");
		}
	}

}
