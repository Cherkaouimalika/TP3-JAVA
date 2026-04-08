package TP3;

public class Vehicule {
	protected String matricule,marque;
	
	public Vehicule(String maticule, String marque) {
		this.matricule=matricule;
		this.marque=marque;
	}
public void stationner() {
	System.out.println("le vehicule se gare dans le parking");
}
public void afficher() {
	System.out.println("Matricule:"+matricule+",Marque:"+marque);
}
}
