package control;

public enum Meses {
	
	ENERO("Enero",31),
	FEBRERO("Febrero",28),
	MARZO("Marzo",31),
	ABRIL("Abril",30),
	MAYO("Mayo",31),
	JUNIO("Junio",30),
	JULIO("Julio",31),
	AGOSTO("Agosto",31),
	SEPTIEMBRE("Septiembre",30),
	OCTUBRE("Octubre",31),
	NOVIEMBRE("Noviembre",30),
	DICIEMBRE("Diciembre",31);
	
	
	private String nombre;
	private int dias;
	
	private Meses(String nombre,int dias) {
		this.nombre = nombre;
		this.dias=dias;
		
	}

	public int getDias() {
		
		return dias;
	}
	public String getNombre() {
		return nombre;
	}
}
