package servicios;

public class servicios {

	public static String mezclaPalabras(String uno, String dos) {

		StringBuffer bueno = new StringBuffer("");

		for (int i = 0; i < uno.length(); i++) {

			bueno.append(uno.charAt(i));

			for (int l = 0; l < dos.length(); l++) {
				if (i == l)
					bueno.append(dos.charAt(l));

			}

		}

		if (uno.length() < dos.length()) {

			String suma = dos.substring(uno.length(), dos.length());
			bueno.append(suma);
		}
		
		return bueno.toString();
	}

}
