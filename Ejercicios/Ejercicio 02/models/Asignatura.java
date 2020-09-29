package models;

public class Asignatura {

	private String nombre;
	private int codigo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Asignatura() {

		crearAsignatura();
	}

	public void crearAsignatura() {

	int x = (int)(Math.random()*10);
	
	switch (x) {
	case 0: 
		nombre = "Matematicas";
	
		codigo = x;
		break;
	case 1:
		nombre = "Fisica";
		codigo = x+1;
		break;
	case 2:
		nombre = "Informatica";
		codigo = x+2;
		break;
	case 3:
		nombre = "Ingles";
		codigo = x+3;
		break;
	case 4:
		nombre = "Yoga";
		codigo = x+4;
		break;
	case 5:
		nombre = "Marketing";
		codigo = x+5;
		break;
	case 6:
		nombre = "Administracion";
		codigo = x+6;
		break;
	case 7:
		nombre = "Sistemas";
		codigo = x+7;
		break;
	case 8:
		nombre = "Astrologia";
		codigo = x+8;
		break;
	case 9:
		nombre = "Cauterizacion";
		codigo = x+9;
		break;
	
	}
	
     
	}

	@Override
	public String toString() {
		return "" + nombre + ", codigo = " + codigo ;
	}

}
