package Jardin;

import java.util.Map;

import Flore.Ail;
import Flore.Vegetal;

public class Emplacement {

    private Vegetal vegetal;


	public Vegetal getVegetal() {
        return vegetal;
    }

    public void setVegetal(Vegetal vegetal) {
        this.vegetal = vegetal;
    }
    

    public Emplacement(Ail ail) {
		
	}

	public String toString() {
		return vegetal.toString();
	}

}