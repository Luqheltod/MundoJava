package models;

public class Asignatura {

	private String nombre;
	private String profesor;
	
	
	
	public Asignatura(String nombre, String profesor) {
		super();
		this.nombre = nombre;
		this.profesor = profesor;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getProfesor() {
		return profesor;
	}



	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}



	@Override
	public String toString() {
		return "Asignatura: " + nombre + ", Profesor: " + profesor;
	}

	
	
}
