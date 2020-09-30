package models;

public class Rectangulo implements Dibujable, ElementoGeometrico {

	protected final int LADOS = 4;
	protected String color;

	public Rectangulo(String color) {
		super();

		this.color = color;
	}

	public void dibujar() {

		String haraAlgo = "Lo dibuja, el rectangulo";
		System.out.println(haraAlgo);
	};

	public void obtenerExtension() {

		String haraAlgo = "Obtendra extension del rectangulo";
		System.out.println(haraAlgo);
	}

	public int getLados() {
		return LADOS;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Rectangulo [LADOS=" + LADOS + ", color=" + color + "]";
	}

	

}
