package kalýtým;

import java.awt.Color;

public class FutbolTopu extends Top  {

	double havabasýncý;
	
	public FutbolTopu(String hammadde, double çap, Color renk, int elastikiyet) {
		super(hammadde, çap, renk, elastikiyet);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() { //Method Overriding. Metot Ezme. 
		return "FutbolTopu [havabasýncý=" + havabasýncý + ", hammadde=" 
			+ hammadde + ", çap=" + çap + ", renk=" + renk
				+ ", elastikiyet=" + elastikiyet + "]";
	}

	public void zýpla() {
		System.out.println("Futbol Topu zýpladý...");
	}
	
	public void yuvarlan() {
		System.out.println("Futbol Topu yuvarlandý...");
	}
	
	public void gol() {
		System.out.println("Futbol topu gol oldu...");
	}
	
}
