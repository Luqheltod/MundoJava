package modelo;

public class Futbolista {
	
	private posicionCampo posicion;
	private equipo equipo;
	private String nombre;
	
	
	
	
	public Futbolista() {
		
	}
	
	
	public Futbolista(posicionCampo posicion, modelo.equipo equipo, String nombre) {
		super();
		this.posicion = posicion;
		this.equipo = equipo;
		this.nombre = nombre;
	}
	public posicionCampo getPosicion() {
		return posicion;
	}
	public void setPosicion(posicionCampo posicion) {
		this.posicion = posicion;
	}
	public equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(equipo equipo) {
		this.equipo = equipo;
	}


	@Override
	public String toString() {
		return "Juega de " + posicion + ",en el " + equipo.get_equipo() + " y se llama  " + nombre ;
	}
	
	
	
	
 

}
