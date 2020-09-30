package control;
import models.*;
import java.util.ArrayList;
public class Main {

	
	public static void main(String[] args) {
		
	
	//UNA imagen bmp de un pixel
	
	Punto punto = new Punto(1,1);
	Pixel pixel = new Pixel(punto,"Rojo");

	ArrayList<Pixel> losPixeles = new ArrayList<Pixel>();
	
	losPixeles.add(pixel);
	
	ImagenBMP imagen = new ImagenBMP(losPixeles,1980);

	
	System.out.println(imagen);
}
}