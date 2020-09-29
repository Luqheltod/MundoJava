package control;

import Util.CompruebaPar;
import Util.Lector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = Lector.leerNumero("Introduse numero nomas");

		System.out.println(CompruebaPar.compruebaNumero(x));

	}

}
