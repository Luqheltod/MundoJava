package control;
import modelo.Helado;
import modelo.tipoHelado;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Helado chiqui = new Helado (tipoHelado.MINI);
		
		//creamos un helado
		System.out.println(chiqui);
		//le cambiamos el tamaño
		chiqui.setTipo(tipoHelado.NORMAL);
		
		System.out.println(chiqui);
		
		//creamos uno grande 
		
		Helado grande = new Helado (tipoHelado.SUPER);
		System.out.println(grande);
		
		
	}

}
