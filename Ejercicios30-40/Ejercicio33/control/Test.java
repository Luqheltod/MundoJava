package control;

import modelo.Calcular;
import utilidades.LecturaDatos;

public class Test {

	public Test() {
		
		int primerEntero = LecturaDatos.leerInt("Introduce el dividendo");
		
		int segundoEntero = LecturaDatos.leerInt("Introduce el divisor");
		
		Calcular.dividirNumero(primerEntero, segundoEntero);
	}
}
