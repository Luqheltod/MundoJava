package models;

public class Profesor extends Persona {
	
	private String licenciatura;
	private int numeroDespacho;
	
	
	
	public Profesor(String nombre, int edad, int numeroDni,String licenciatura, int numeroDespacho) {
		super(nombre,edad,numeroDni);
		this.licenciatura = licenciatura;
		this.numeroDespacho = numeroDespacho;
	}
	public String getLicenciatura() {
		return licenciatura;
	}
	public void setLicenciatura(String licenciatura) {
		this.licenciatura = licenciatura;
	}
	public int getNumeroDespacho() {
		return numeroDespacho;
	}
	public void setNumeroDespacho(int numeroDespacho) {
		this.numeroDespacho = numeroDespacho;
	}
	@Override
	public String toString() {
		return "Profesor [licenciatura=" + licenciatura + ", numeroDespacho=" + numeroDespacho + ", getNombre()="
				+ getNombre() + ", getEdad()=" + getEdad() + ", getNumeroDni()=" + getNumeroDni() +   "]";
	}
	
	

}
