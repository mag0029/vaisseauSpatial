package main.java.com.mgiraud.vaisseauSpatial.entities.vaisseau;
import java.util.ArrayList;

import main.java.com.mgiraud.vaisseauSpatial.entities.planete.DefaultPlanete;
import main.java.com.mgiraud.vaisseauSpatial.entities.vaisseau.compartiment.*;

public class Navette {
	
	private double poidsTotal;
	private ArrayList<DefaultCompartiment> compartiments;
	private Cosmonaute pilote;
	private double carburant;
	private ArrayList<DefaultPlanete> planDeVol;
	
	public Navette(Cosmonaute pilote, double carburant) {
		super();
		this.pilote = pilote;
		this.carburant = carburant;
	}

	public double getPoidsTotal() {
		return poidsTotal;
	}

	public void setPoidsTotal(double poidsTotal) {
		this.poidsTotal = poidsTotal;
	}

	public ArrayList<DefaultCompartiment> getCompartiments() {
		return compartiments;
	}

	public void setCompartiments(ArrayList<DefaultCompartiment> compartiments) {
		this.compartiments = compartiments;
	}

	public double getCarburant() {
		return carburant;
	}

	public void setCarburant(double carburant) {
		this.carburant = carburant;
	}

	public ArrayList<DefaultPlanete> getPlanDeVol() {
		return planDeVol;
	}

	public void setPlanDeVol(ArrayList<DefaultPlanete> planDeVol) {
		this.planDeVol = planDeVol;
	}
	
	
	
	

}
