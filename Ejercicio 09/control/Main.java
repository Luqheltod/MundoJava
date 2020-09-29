package control;

import Util.Lector;

public class Main {

	//(*) Dado un numero n, realizar un programa que sume los primeros n numeros pares.
	
	
	public static void main(String[] args) {
		
		
		
		int x = Lector.leerNumero("Introduce un numero n, sumaremos los primeros n números pares");
		
		int suma = 0;
		
		
		//Se puede hacer con un if dentro del for
		//"Si es el ultimo valor del for , i<x-1
		for(int i= 1; i<x; i++ ) {
		
		System.out.print(i*2 +" + " );
		
		suma+= i*2;
		
		}
		
		System.out.println(x *2 +" = " +(suma+x*2));
		
		
	}
}
