package models;

public class Circulo implements Dibujable{
	

	protected int radio;
	
	
	
	
	public Circulo(int radio) {
		super();
		this.radio = radio;
	}

	public void dibujar() {
		
		String haraAlgo = "Lo dibuja, el circulo";
		System.out.println(haraAlgo);
	};
	
	public void obtenerExtension() {
		
		String haraAlgo = "Obtendra extension del circulo";
		System.out.println(haraAlgo);
	}

}
