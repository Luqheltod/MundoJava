package models;

public class Estudiante extends Persona {

	private String carrera;
	private int notaMedia;

	
	

	public Estudiante(String nombre, int edad, int numeroDni, String carrera, int notaMedia) {
		super(nombre, edad, numeroDni);
		this.carrera = carrera;
		this.notaMedia = notaMedia;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(int notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Estudiante [carrera=" + carrera + ", notaMedia=" + notaMedia + ", getNombre()=" + getNombre()
				+ ", getEdad()=" + getEdad() + ", getNumeroDni()=" + getNumeroDni() + "]";
	}
	

}
