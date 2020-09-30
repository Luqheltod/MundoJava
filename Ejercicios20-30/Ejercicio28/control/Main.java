package control;
import utilidades.Datos;
import servicios.servicios;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String uno="";
		String dos="";
		
		System.out.println("Vamos a mezclar tus palabras");
		try {
			
		
	uno =	Datos.recogeString("Introduce la primera palabra");
	dos = 	Datos.recogeString("Introduce la segunda palabra");
	
	
		} catch (Exception e) {
			e.getMessage();
		}
		
		System.out.println(servicios.mezclaPalabras(uno, dos));
		
		
	}

}
