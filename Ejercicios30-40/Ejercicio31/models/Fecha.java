package models;

import java.time.*;

public class Fecha {

	LocalDate fecha;

	

	
	public void estableceFecha(int year,int month,int day) {
		
	fecha =	LocalDate.of(year, month, day);
	}

	@Override
	public String toString() {
		return "Fecha : " + fecha.getDayOfMonth() +"/"+ fecha.getMonthValue() + "/"+fecha.getYear();
	}
	
	
}
