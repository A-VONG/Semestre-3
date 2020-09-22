package Flore;

import Jardin.Etat;

public abstract class Vegetal {


	private Etat etat;
	protected char dessins[];
	
	
	public Vegetal() {
		dessins = new char [6];
		this.etat = Etat.GRAINE;
		dessins[0] = '_';
		dessins[1] = '.';
		dessins[2] = '|';
		dessins[5] = '#';
	}
	 
	public String toString() {
		return String.valueOf(dessins[this.etat.ordinal()]);
	}
}
