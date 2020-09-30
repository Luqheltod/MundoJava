package control;
import servicios.servicios;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TEST DEL METODO
		String[] termino = new String[2];

		termino[0] = "Diablo";
		termino[1] = "Persona muy mala que vive en el infierno y dice jijijojo continuamente";

		String[] termino2 = new String[2];

		termino2[0] = "Espantapajaros";
		termino2[1] = " Espantajo que se pone en los sembrados y en los arboles para ahuyentar los pajaros ";

		
		servicios.comprobarPalabras(termino);
		
		System.out.println("");
		
		servicios.comprobarPalabras(termino2);
	}

}