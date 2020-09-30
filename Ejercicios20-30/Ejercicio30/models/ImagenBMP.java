package models;

import java.util.ArrayList;

public class ImagenBMP {

	// la imagen tendria una collecion de pixels, los pixels son simplemente un
	// punto con color.
	// aqui tambien estaria el tamaño de la imagen.
	private ArrayList<Pixel> pixeles;
	private double size;

	public ImagenBMP(ArrayList<Pixel> pixeles, double size) {
		super();
		this.pixeles = pixeles;
		this.size = size;
	}

	public ArrayList<Pixel> getPixeles() {
		return pixeles;
	}

	public void setPixeles(ArrayList<Pixel> pixeles) {
		this.pixeles = pixeles;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "ImagenBMP [pixeles=" + pixeles + ", size=" + size + "]";
	}

}
