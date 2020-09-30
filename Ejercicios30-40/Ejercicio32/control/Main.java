package control;
import models.*;
public class Main {

	
	public static void main(String[] args) {
		
		Folio blanco = new Folio ("blanco","alta",false);
		
		blanco.obtenerExtension();
		
		CampoFutbol bernabeu = new CampoFutbol(false);
		
		
		System.out.println(blanco);
		System.out.println(bernabeu);
		
		bernabeu.obtenerExtension();
	
		
		Sol nuevoSol = new Sol(300, 25000);
		
		nuevoSol.dibujar();
		System.out.println(nuevoSol);
	}
	
}
