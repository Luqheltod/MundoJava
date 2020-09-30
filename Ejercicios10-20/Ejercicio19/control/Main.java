package control;

import utilidades.ordenarArray;


public class Main {
//¿programa pasatiempo de desordenar frases y encontrar que frase forman.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String[] arrayStrings = new String[] {"La" ,"casa","es","muy","bonita","cuando","no","la","miro"};
		
		
		ordenarArray.ordenarArray(arrayStrings);
		
		for (String string : arrayStrings) {
			
			System.out.println(string);
			
		}
		
	}

}
