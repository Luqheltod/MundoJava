package control;
import utilidades.traductor;
import gui.menu;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que palabra quiere traducir?");
		String aTraducir = entrada.nextLine();
		

		
		
		
		
		
		
	 menu menu = new menu();	
		
        int opcion =	menu.mostrarMenu();

System.out.println("El resultado es");
System.out.println(new traductor().aTraducir(aTraducir, opcion));
		
	}

}
