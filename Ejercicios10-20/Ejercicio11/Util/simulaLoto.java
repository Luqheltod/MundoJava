package Util;

public class simulaLoto {

	
	public static void simular() {
		
		int [] numeros = new int[6];
		
		
		System.out.println("Sus numeros son: ");
		
		
		for (int i = 0; i<6;i++) {
			
			
			numeros[i] = 0 + (int) Math.round(Math.random() * (49 -0));
			
			
			System.out.print(numeros[i]+" ");
			
			
		}
		
	}
}
