package main.java.com.mgiraud.vaisseauSpatial.entities.planete;

public abstract class DefaultPlanete {
	private double coordonneeX;
	private double coordonneeY;
	private double coordinneeZ;
	private String nomPlanete;
	
	public DefaultPlanete(double coordonneeX, double coordonneeY, double coordinneeZ, String nomPlanete) {
		super();
		this.coordonneeX = coordonneeX;
		this.coordonneeY = coordonneeY;
		this.coordinneeZ = coordinneeZ;
		this.nomPlanete = nomPlanete;
	}

	public double getCoordonneeX() {
		return coordonneeX;
	}

	public double getCoordonneeY() {
		return coordonneeY;
	}

	public double getCoordinneeZ() {
		return coordinneeZ;
	}

	public String getNomPlanete() {
		return nomPlanete;
	}
	

}
