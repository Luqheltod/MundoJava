package utilidades;

public class euros {

	public static void descomponerEuros(double cantidad) {
		// multiplicamos por 100 la cantidad inicial para un facil manejo
		int cantidad100 = (int) (cantidad * 100);
        //los tipos de monedas que puede haber, en este caso multiplicados por 100
		int[] monedas = { 200, 100, 50, 20, 10, 5, 2, 1 };
		//el numero de monedas de cada tipo, el [0] serian 2 euros el [1] seria 1 euro etc
		int[] numMonedas = new int[8];
		
		//ahora vamos dividiendo
		for (int i = 0; i < monedas.length; i++) {
			numMonedas[i] = cantidad100 / monedas[i];
            //el resto es lo que queda tras coger las monedas de cada tipo
			cantidad100= cantidad100 % monedas[i];
		}
		
		
		//ahora debemos leer los datos
		
		for (int i = 0; i < monedas.length; i++) {
			
			if(i==1 || i==0) {
				
			System.out.println ("Monedas de " + monedas[i]/100 +" euros : " + numMonedas[i]);	
			}
			
			else {
				System.out.println("Monedas de " +monedas[i] + " centimos : " + numMonedas[i]);
			}
			
		}
	
		
	}

}
