package models;

import java.time.*;
import models.*;

public class Examen {

	private Fecha fecha;
	private Hora hora;
	private Asignatura asignatura;
	private int aula;

	public Examen() {

	}

	public Examen(Fecha fecha, Hora hora, Asignatura asignatura, int aula) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.asignatura = asignatura;
		this.aula = aula;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public int getAula() {
		return aula;
	}

	public void setAula(int aula) {
		this.aula = aula;
	}

	@Override
	public String toString() {
		return "Examen -->" + fecha + ", " + hora + ", " + asignatura + ", Aula: " + aula;
	}

	
}
