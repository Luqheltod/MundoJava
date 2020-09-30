package utilidades;

public class Endeluego {

	public static String endeLuego(String cadena) {

		String cadenaBusca = "endeluego";
		String cadenaReemplazo = "desde luego";

		String cadenaBuena = cadena.replace(cadenaBusca, cadenaReemplazo);// replaces all occurrences of is to was

		return cadenaBuena;

	}
}
