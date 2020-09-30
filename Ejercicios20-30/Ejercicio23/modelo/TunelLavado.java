package modelo;

//se usa una especie de constante para posteriormente modificar el precio con mayor facilidad
public class TunelLavado {

	
	private tipoTunel tipotunel;
	private final int precioInicial =2;
	private int precio;
	
	
	
	public TunelLavado(tipoTunel tipotunel) {
		super();
		this.tipotunel = tipotunel;
		
		if (tipotunel == tipoTunel.BASICO) {
			this.precio = precioInicial+5;
		}
		if (tipotunel == tipoTunel.NORMAL) {
			this.precio = precioInicial+10;
		}
		if (tipotunel == tipoTunel.SUPER) {
			this.precio = precioInicial+15;
		}
	}
	public tipoTunel getTipotunel() {
		return tipotunel;
	}
	public void setTipotunel(tipoTunel tipotunel) {
		this.tipotunel = tipotunel;
	}
	public int getPrecio() {
		return precio;
	}
	@Override
	public String toString() {
		return "TunelLavado: " + tipotunel + " , Precio: " + precio + "Duracion:" +tipotunel.getMinutos();
	}
	
	
	
}
