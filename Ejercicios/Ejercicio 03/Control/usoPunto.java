package Control;

import Models.Punto;
import Util.Lector;

public class usoPunto {

	public static void main(String[] args) {

		
		/*Punto p = new Punto(35,57);
		
		System.out.println(p);*/
		
		
		System.out.println("Medimos distancia entre dos puntos:");
		
		
		System.out.println("punto 1, introduce coordenada X e Y");
		Punto p1 = new Punto(Lector.leerNumero(),Lector.leerNumero());
		System.out.println("punto 2, introduce coordenada X e Y");
		Punto p2 = new Punto(Lector.leerNumero(),Lector.leerNumero());
		
		
		System.out.println("La distancia es de "+Punto.distanciaEntreDos(p1,p2)+" unidades entre ellos con precision desbordante"); 
		
		System.out.println("Medimos distancia al centro ");
		System.out.println("Introduce coordenadas de tu punto");
		
		Punto p3 = new Punto(Lector.leerNumero(),Lector.leerNumero());
		
		System.out.println("La distancia es de "+Punto.distanciaEntreDos(p1,new Punto(0,0))+" unidades hasta el centro con precision desbordante"); 

	}

}
