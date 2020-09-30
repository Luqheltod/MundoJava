package models;

public class Pixel {

	
	private Punto punto;
	private String color;
	
	
	
	
	
	public Pixel(Punto punto, String color) {
		super();
		this.punto = punto;
		this.color = color;
	}
	public Punto getPunto() {
		return punto;
	}
	public void setPunto(Punto punto) {
		this.punto = punto;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Pixel [punto=" + punto + ", color=" + color + "]";
	}
	
	
	
	
}
