package models;
import models.Asignatura;


public class Curso {

	Asignatura asignatura1;
	Asignatura asignatura2;
	
	public Curso() {
		
		asignatura1= new Asignatura();
		asignatura2= new Asignatura();
	}

	@Override
	public String toString() {
		return " se da " + asignatura1 + ", y " + asignatura2 + "";
	}
	
	
}
