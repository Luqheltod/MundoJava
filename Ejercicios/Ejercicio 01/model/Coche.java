package model;

public class Coche {

	private String color;
	private String modelo;
	private boolean metalizada;
	private tipo tipo;
	private int anio;
	private String modSeguro;
	
	//constructor estandar
	public Coche() {
		
	}
	
	//constructor propio 
	public Coche(String color, String modelo, boolean metalizada, model.tipo tipo, int anio, String modSeguro) {
		
		this.color = color;
		this.modelo = modelo;
		this.metalizada = metalizada;
		this.tipo = tipo;
		this.anio = anio;
		this.modSeguro = modSeguro;
	}


//setters & getters

	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public boolean isMetalizada() {
		return metalizada;
	}




	public void setMetalizada(boolean metalizada) {
		this.metalizada = metalizada;
	}




	public tipo getTipo() {
		return tipo;
	}




	public void setTipo(tipo tipo) {
		this.tipo = tipo;
	}




	public int getAnio() {
		return anio;
	}




	public void setAnio(int anio) {
		this.anio = anio;
	}




	public String getModSeguro() {
		return modSeguro;
	}




	public void setModSeguro(String modSeguro) {
		this.modSeguro = modSeguro;
	}

	//metodo toString 
	@Override
	public String toString() {
		return "Coche [color=" + color + ", modelo=" + modelo + ", metalizada=" + metalizada + ", tipo=" + tipo
				+ ", anio=" + anio + ", modSeguro=" + modSeguro + "]";
	}




	
	
	
}
