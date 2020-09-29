package model;

public class ElementoTablaPeriodica {

	private String nombre; 
	private int numero;
	private String simbolo;
	
	private static int contador;
	
	
	
	
	
	public ElementoTablaPeriodica(String nombre, int numero, String simbolo) {
		
		this.nombre = nombre;
		this.numero = numero;
		this.simbolo = simbolo;
		contador++;
	}
	
	
	public static int numeroDeElementos() {
		
		return contador;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	
	
	
	
}
