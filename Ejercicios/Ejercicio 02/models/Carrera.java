package models;

public class Carrera {

	Curso curso1;
	Curso curso2;
	String nombre;

	public Carrera(String nombre) {

		this.nombre = nombre;
		crearCarrera();

	}

	public void crearCarrera() {

		curso1 = new Curso();
		curso2 = new Curso();
	}

	@Override
	public String toString() {
		return " Nombre: " + nombre +"\nPrimer Curso: " + curso1 + " \nSegundo Curso " + curso2 ;
	}

}
