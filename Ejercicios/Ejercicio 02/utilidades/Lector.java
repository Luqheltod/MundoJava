package utilidades;
import java.util.*;

public class Lector {

	
	public static String leerTexto() {
		
		Scanner entrada = new Scanner(System.in);
		String x= entrada.nextLine();
		entrada.close();
		return x;
	}
	
}
