package models;

public class TableroAjedrez implements Dibujable {
	
	private int longitudLado;
	
	
	
	public int getLongitudLado() {
		return longitudLado;
	}

	public void setLongitudLado(int longitudLado) {
		this.longitudLado = longitudLado;
	}

	public void dibujar() {

		String haraAlgo = "Lo dibuja, el tablero";
		System.out.println(haraAlgo);
	};

	public void obtenerExtension() {

		String haraAlgo = "Obtendra extension del tablero";
		System.out.println(haraAlgo);
	}

	@Override
	public String toString() {
		return "TableroAjedrez [longitudLado=" + longitudLado + "]";
	}

	
}
