package control;

import model.ElementoTablaPeriodica;
public class usoElemento {

	public static void main(String[] args) {


	ElementoTablaPeriodica Oro = new ElementoTablaPeriodica("Oro",79, "Au");
	
	ElementoTablaPeriodica Hierro = new ElementoTablaPeriodica("Hierro",26, "Fe");
	
	ElementoTablaPeriodica Hidrogeno = new ElementoTablaPeriodica("Hidrogeno",1, "H");

	System.out.println(Oro.getNombre());
	
	System.out.println(ElementoTablaPeriodica.numeroDeElementos());

	
	}

}
