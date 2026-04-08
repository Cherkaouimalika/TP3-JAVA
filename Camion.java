package TP3;

public class Camion extends Vehicule{
	private double chargeMax;
	
	private int nbPortes;
	public Camion(String matricule,String marque,double chargeMax ,int nbPortes) {
		super(matricule,marque);
		
		this.chargeMax=chargeMax;
		this.nbPortes=nbPortes;
	}
	public void stationner() {
		System.out.println("le camion se gare dans une zone pour vehicule lourdsux ");
	}
	public void afficher() {
		super.afficher();
		System.out.println("le nombre de portes:"+nbPortes);
	}
	}


