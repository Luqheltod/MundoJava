package models;

public class Punto {

	int coordenadaY;
	int coordenadaX;

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	
	public Punto(int coordenadaY, int coordenadaX) {

		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	@Override
	public String toString() {
		return "Punto [Y=" + coordenadaY + ",X=" + coordenadaX + "]";
	}

	
	
}
