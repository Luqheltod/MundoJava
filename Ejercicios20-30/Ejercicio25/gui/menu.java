package gui;
import java.util.*;

import utilidades.Lector;
public class menu {

	
	public int mostrarMenu() {
		
		
		
		int seleccion = 0;
		boolean correcto = false;
		
		do {
			System.out.println("Selecciona una opcion");
			System.out.println("1- Traducir al Aleman");
			System.out.println("2- Traducir al Bulgaro");
			System.out.println("3- Traducir al Catalan");
	try {
		seleccion =	Lector.leerNumero();
	   correcto = true;
	}catch(InputMismatchException e){
		
		System.out.println("Introduce un numero");
		correcto = false;
	}
	if (seleccion<1 || seleccion >3) {
		correcto = false;
		System.out.println("Introduce un numero correcto");
	}
	} while(!correcto);
		
	
		return seleccion;
	}
}
