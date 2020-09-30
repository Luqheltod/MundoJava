package utilidades;

public class traductor {

	
	
	public String aTraducir(String cadena, int idioma) {
		String resultado = "";
	int x	= cadena.length(); //la longitud de la cadena que nos pasan
		//dependiendo de que idioma, vamos a traducir a una cosa u otra.
		if (idioma ==1) {
			//comprobaremos siempre si la ultima letra es vocal o consonante.
			if("AEIOUaeiou".indexOf(cadena.charAt(x-1))>0) { //si es vocal
			
				cadena = cadena.substring(0,(cadena.length())-(1)) + "ujem";
						resultado = cadena;
		} else {
			cadena = cadena.substring(0,(cadena.length())-(2)) + "ujem";
			resultado = cadena;
		}}
		if (idioma == 2) {
			if("AEIOUaeiou".indexOf(cadena.charAt(x-1))>0) { //si es vocal
				
				cadena = cadena + "kov";
						resultado = cadena;
		} else {
			cadena = cadena.substring(0,(cadena.length())-(1)) + "kov";
			resultado = cadena;
			
		}}
		if (idioma == 3) {
			
			
				cadena = cadena.substring(0,(cadena.length())-(1)) ;
						resultado = cadena;
		
			
		}
		return resultado;	
	}
}
		
