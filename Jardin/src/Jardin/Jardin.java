package Jardin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Flore.Ail;

public class Jardin {
	
	private int longueur;
	private int largeur;
	private Emplacement emplacements[][];
	private HashMap <String, Integer> panier; 

	
	public int getLongueur() {
		return longueur;
	}
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	public Emplacement[][] getEmplacements() {
		return emplacements;
	}
	public void setEmplacements(Emplacement[][] emplacements) {
		this.emplacements = emplacements;
	}
	public HashMap<String, Integer> getPanier() {
		return panier;
	}
	public void setPanier(HashMap<String, Integer> panier) {
		this.panier = panier;
	}
	
	public Jardin(int longueur, int largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
		this.emplacements = new Emplacement[longueur][largeur];
		this.panier = new HashMap<String, Integer>();
		
	
	}
	
	public void ajouterPanier(String name, int quantite) {
		this.panier.put(name, quantite);
	}
	


	@Override
	public String toString() {
		String contenue = new String();

		for (int i = 0; i < longueur; i++) {
			
			for (int k = 0; k < largeur; k++) {
				if(emplacements[i][k] == null) {
					contenue = contenue + "o";
				}
				else {
					contenue = contenue + emplacements[i][k].toString();
				}
			}
			contenue = contenue +"\n";
		}
		contenue = contenue +"Notre panier contient : ";
        for (Map.Entry<String, Integer> variable : panier.entrySet()) {
            contenue = contenue + "\n" + variable.getKey() + " "+ variable.getValue() + " graine(s)";
        }
		
		return contenue;
	}	
	
	public void semer() { 
		Scanner scanner = new Scanner(System.in); 
		int longueur = scanner.nextInt();
		int largeur = scanner.nextInt();
		int vege = scanner.nextInt();
		
		emplacements[longueur][largeur] = new Emplacement(new Ail());
	}
	
}