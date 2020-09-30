package control;

import models.Estudiante;
import models.Profesor;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Estudiante German = new Estudiante("German",32,52002955,"Filosofia", 12);
		Profesor Antonio = new Profesor ("Antonio",29,43212344,"Informatica", -1);
		
		//Habria que cambiar los toString pero quitaria tiempo innecesariamente
		System.out.println(German);
		System.out.println(Antonio);
		
		
		
	}

}
