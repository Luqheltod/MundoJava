package modelo;

public enum tipoHelado {

	MINI("tamaño mini",2),
	NORMAL("tamaño normal",3), 
	SUPER("tamaño enorme",5);

	private int bolas;
    private String tamanio;
	private tipoHelado(String tamanio,int bolas) {
        this.tamanio = tamanio;
		this.bolas = bolas;
	}

	public int getBolas() {
		return bolas;
	}

	public String getTamanio() {
		return tamanio;
	}

	
   
}