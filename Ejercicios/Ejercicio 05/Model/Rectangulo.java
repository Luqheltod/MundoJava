package Model;

public class Rectangulo {

	private Punto p1 ;
	private Punto p2 ;
	private Punto p3 ;
	private Punto p4 ;
	
	
	
	
	public Rectangulo() {
		
		
	}
	
	public Rectangulo(Punto p1,Punto p2, Punto p3,Punto p4) {
		
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
		this.p4=p4;
			
				
	}
	//obtiene los dos puntos restantes del rectangulo
	public void obtenerPuntos() {
		
		this.p2.setCoordenadaX(p3.getCoordenadaX());
		this.p2.setCoordenadaY(p1.getCoordenadaY());
		this.p4.setCoordenadaX(p1.getCoordenadaX());
		this.p4.setCoordenadaY(p3.getCoordenadaY());
		
	}
	
	//estos metodos devuelven un punto, que luego sera leido mediante el toString de la propia clase Punto. 
	public Punto getP1() {
		return p1;
	}
	public void setP1(Punto p1) {
		this.p1 = p1;
	}
	public Punto getP2() {
		return p2;
	}
	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	public Punto getP3() {
		return p3;
	}
	public void setP3(Punto p3) {
		this.p3 = p3;
	}
	public Punto getP4() {
		return p4;
	}
	public void setP4(Punto p4) {
		this.p4 = p4;
	}
	
	
	
	
}
