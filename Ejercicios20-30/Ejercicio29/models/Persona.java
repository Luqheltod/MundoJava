package models;

public class Persona {

	private String nombre;
	private int edad;
	private int numeroDni;
	
	
	
	
	public Persona(String nombre, int edad, int numeroDni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.numeroDni = numeroDni;
	}







	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getEdad() {
		return edad;
	}




	public void setEdad(int edad) {
		this.edad = edad;
	}




	public int getNumeroDni() {
		return numeroDni;
	}




	public void setNumeroDni(int numeroDni) {
		this.numeroDni = numeroDni;
	}




	
	
	
	
}
