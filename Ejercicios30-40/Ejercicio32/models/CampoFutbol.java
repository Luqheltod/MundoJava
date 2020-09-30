package models;

public class CampoFutbol extends Rectangulo {

	private boolean cespedArtificial;
    private final static String color = "verde";
	
	
	
	public CampoFutbol( boolean cespedArtificial) {
		super(color);
		this.cespedArtificial = cespedArtificial;
	}

	public boolean isCespedArtificial() {
		return cespedArtificial;
	}

	public void setCespedArtificial(boolean cespedArtificial) {
		this.cespedArtificial = cespedArtificial;
	}

	@Override
	public String toString() {
		return "CampoFutbol [cespedArtificial=" + cespedArtificial + ", LADOS=" + LADOS + ", color=" + color + "]";
	}

	
	
}
