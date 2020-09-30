package control;
import modelo.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Futbolista Benzema = new Futbolista(posicionCampo.DELANTERO,equipo.REALMADRID, "Benzema");
		Futbolista German = new Futbolista(posicionCampo.DELANTERO,equipo.BARCELONA,"Messi");
		
		System.out.println(Benzema);
		System.out.println(German);
	}

}
