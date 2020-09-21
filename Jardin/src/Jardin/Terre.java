package Jardin;

import java.util.HashMap;

import Flore.Vegetal;

public class Terre {

    public static void main(String[] args) {
    	
    	
        Jardin monJardin = new Jardin(5, 3);
        
        monJardin.ajouterPanier("betteraves", 5);
        monJardin.ajouterPanier("ails", 10);
        monJardin.ajouterPanier("carrotes", 5);
        monJardin.ajouterPanier("tomate", 5);
       
        System.out.println(monJardin);

    }
}