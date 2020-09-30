package models;

public class Sol  extends Circulo {

	
	private float temperatura;

	public Sol(int radio, float temperatura) {
		super(radio);
		this.temperatura = temperatura;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "Sol [temperatura=" + temperatura + "]";
	}
	
	
	
}
