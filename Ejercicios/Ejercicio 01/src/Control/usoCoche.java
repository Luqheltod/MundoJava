package Control;

import model.Coche;
import model.tipo;

public class usoCoche {

	public static void main(String[] args) {

		Coche Seat = new Coche("Azul", "Seat 600", true, tipo.FAMILIAR, 1960, "Terceros");
		
		System.out.println(Seat);
		
		System.out.println(tipo.DEPORTIVO);

	}

}
