package models;

public class Folio extends Rectangulo {

	private String calidad;
	private boolean reciclado;

	public Folio(String color, String calidad, boolean reciclado) {
		super(color);
		this.calidad = calidad;
		this.reciclado = reciclado;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	public boolean isReciclado() {
		return reciclado;
	}

	public void setReciclado(boolean reciclado) {
		this.reciclado = reciclado;
	}

	@Override
	public String toString() {
		return "Folio [calidad=" + calidad + ", reciclado=" + reciclado + ", LADOS=" + LADOS + ", color=" + color + "]";
	}

	
}
