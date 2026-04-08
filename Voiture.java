package TP3;

public class Voiture extends Vehicule{
private int nbPortes;

public Voiture( String matricule,String marque,int nbPortes) {
	super(matricule,marque);
	this.nbPortes=nbPortes;
}
public void stationner() {
	System.out.println("la vioiture se gare dans une place standad");
}
public void afficher() {
	super.afficher();
	System.out.println("le nombre de portes:"+nbPortes);
}
}


