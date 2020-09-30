package modelo;

public class Helado {
	
	private tipoHelado tipo;

	
	
	
	public Helado(tipoHelado tipo) {
		super();
		this.tipo = tipo;
	}

	public tipoHelado getTipo() {
		return tipo;
	}

	public void setTipo(tipoHelado tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "El helado es de " + tipo.getTamanio() + " y tiene "+ tipo.getBolas()+ " bolas";
	}
	

}
