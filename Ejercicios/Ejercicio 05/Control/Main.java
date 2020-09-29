package Control;

import Model.Punto;
import Model.Rectangulo;
import Util.Lector;

public class Main {

	public static void main(String[] args) {

		System.out.println("Introduce dos puntos opuestos del rectangulo:");

		//Habria que crear algunas condiciones, como que el usuario no de 2 puntos iguales o en el mismo eje.
		
		
		
		Punto p1 = new Punto(Lector.leerNumero("Punto1 X:"),Lector.leerNumero("Punto1 Y"));
		Punto p3 = new Punto(Lector.leerNumero("Punto Opuesto X:"),Lector.leerNumero("Punto Opuesto Y:"));
		
		

		
		
		Rectangulo prueba = new Rectangulo(p1,new Punto(),p3,new Punto());
		
		prueba.obtenerPuntos();
		
		System.out.println("Los puntos del rectangulo son:");
		
		System.out.println(prueba.getP1());
		System.out.println(prueba.getP2());
		System.out.println(prueba.getP3());
		System.out.println(prueba.getP4());
		
		System.out.println("El area del rectangulo es " + prueba.ObtenerArea());
		
	}

}
