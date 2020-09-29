package Models;
import Util.Lector;

public class Punto {

	int coordenadaY;
	int coordenadaX;

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	// distancia en caso de que fuesen dos coordenadas negativas?// RESUELTO, se resuelve igual.
	public Punto(int coordenadaY, int coordenadaX) {

		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public static double  distanciaEntreDos(Punto uno,Punto dos) {
		
		int distanciaX =0;
		int distanciaY = 0;
		double distanciaTotal=0;
		
		if(uno.coordenadaX>dos.coordenadaX) {
	distanciaX =	uno.coordenadaX - (dos.coordenadaX);
		}
		else {
			 distanciaX =	dos.coordenadaX - (uno.coordenadaX);
		}
		if(uno.coordenadaY > dos.coordenadaY){
			distanciaY = uno.coordenadaY - (dos.coordenadaY);	
		}else {
			distanciaY = dos.coordenadaY - (uno.coordenadaY);
		}
	 
	    distanciaTotal = Math.sqrt(Math.pow(distanciaY, 2)+Math.pow(distanciaX, 2));
	
		return distanciaTotal;
	}
	
	
	
	@Override
	public String toString() {
		return "Punto [Y=" + coordenadaY + ",X=" + coordenadaX + "]";
	}

	
}
