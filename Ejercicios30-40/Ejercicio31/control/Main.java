package control;
import models.*;
import java.time.*;
public class Main {

	public static void main(String[] args) {
	
		
		//Este test deberia ir en test quiza.
		
		//Fecha
		Fecha fecha1 = new Fecha();
		fecha1.estableceFecha(2010, 9, 25);
		//Hora
		Hora hora1 = new Hora();
		hora1.establecerHora(15, 35);
        //Asignatura
		Asignatura asignatura1 = new Asignatura("Filosofia" , "Ortega y Gasset(LOS DOS xd)");
		
		//Examen completo
		Examen examen1 = new Examen (fecha1,hora1,asignatura1,257);
				
		
		System.out.println(examen1);
		
	}

}
