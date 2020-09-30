package modelo;

public enum equipo {
	
	
	REALMADRID("Real Madrid CF"),
	BARCELONA("FC Barcelona"),
	VALENCIA("Valencia CF"),
	SEVILLA("Sevilla CF");
			
	private final String equipo1;
		
		
	private equipo(String equipo)
	{
		this.equipo1= equipo;
	}
	
	public String get_equipo()
	{
		return equipo1;
	}

}
