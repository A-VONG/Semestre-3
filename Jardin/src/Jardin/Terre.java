package Jardin;

import java.util.HashMap;
import java.util.Scanner;

import Flore.Vegetal;

public class Terre {

    public static void main(String[] args) {
    	
    	
        Jardin monJardin = new Jardin(5, 3);
        
        monJardin.ajouterPanier("betteraves", 5);
        monJardin.ajouterPanier("ails", 10);
        monJardin.ajouterPanier("carrotes", 5);
        monJardin.ajouterPanier("tomate", 5);
       
        System.out.println(monJardin);
       
        System.out.println("1. Semer une graine"); 
        System.out.println("2. Récolter toutes les plantes qui sont matures");
        System.out.println("3. Passer à la saison suivante (toutes les plantes grandissent)");
        System.out.println("4. Quitter l’application");
        
        
        Scanner scanner = new Scanner(System.in);
        int res = scanner.nextInt();
        
        switch(res){
        	case 1:
        		System.out.println("Tu as choisie le 1");
        		System.out.println("Choisisez la longueur puis la largeur du jardin");
        		monJardin.semer();
        		System.out.println(monJardin); 
          	break;
        	
        	case 2:
        		System.out.println("Tu as choisie le 2");
        	break;
        	
        	case 3:
        		System.out.println("Tu as choisie le 3 ");
        	break;
        	
        	case 4:
        		System.out.println("Tu as choisie le 4");
        	break;
        }

    }
}