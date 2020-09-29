package control;

import models.Carrera;
import utilidades.Lector;
public class usoCarrera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Introduce la carrera que deseas cursar");
		
		String carreraElegida = Lector.leerTexto();
		Carrera ciencias = new Carrera(carreraElegida);
		
		
		System.out.println(ciencias);
	}

}
