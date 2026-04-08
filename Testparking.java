package TP3;

import java.util.List;
public class TestParking {

	public static void main(String[] args) {
		
	Vehicule[] v=new Vehicule[4];
	
	Vehicule voiture1= new Voiture("dex2","maroc",4);
     Vehicule voiture2= new Voiture("fex4","que1",1);
     Vehicule moto1= new Moto("beu3","poi4",true);
     Vehicule camion1=new Camion("fds4","FR",5.0,6);
    
     v[0] = voiture1;
     v [1]= voiture2;
     v[2] = moto1;
     v[3] = camion1;
    
    	 for(int i = 0; i < v.length; i++) {
    	        v[i].stationner();
    	        v[i].afficher();
      }
    	 System.out.println(  "les voitures seulement");
    	 for (int i = 0; i < v.length; i++) {
    	     if (v[i] instanceof Voiture) {
    	         v[i].afficher();
    	     }
    	    
    	 }
    	 Vehicule x= new Moto("11C22","YAMAHA",true);
    	 Moto m1=(Moto)x;
    	 System.out.println(  "Downcasting réussi!");
    	 
     }
	}

