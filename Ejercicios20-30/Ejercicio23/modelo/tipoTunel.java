package modelo;

public enum tipoTunel {

	BASICO(3), 
	NORMAL(5),
	SUPER(7);

	private int minutos;

	private tipoTunel(int minutos) {
	       this.minutos = minutos;
		}

	public int getMinutos() {
		return minutos;
	}

}
