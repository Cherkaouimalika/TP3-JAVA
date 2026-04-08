package TP3;

public class Moto  extends Vehicule{
	private boolean avecCasque;
	private int nbPortes;
	public Moto(String matricule,String marque,boolean avecCasque) {
		super(matricule,marque);
		this.nbPortes=nbPortes;
		this.avecCasque=avecCasque;
	}
	public void stationner() {
		System.out.println("la Moto se gare dans une place réservée aux deux riues");
	}
	public void afficher() {
		super.afficher();
		System.out.println("le nombre de portes:"+nbPortes);
	}
