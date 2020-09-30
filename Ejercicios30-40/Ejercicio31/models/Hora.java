package models;

import java.time.*;

public class Hora {

	LocalTime hora;

	
	
	public void establecerHora(int horas, int minutos) {
		
		hora = LocalTime.of(horas, minutos);
	}



	@Override
	public String toString() {
		return "Hora: " + hora.getHour() + ":" + hora.getMinute();
	}

	
	
}
