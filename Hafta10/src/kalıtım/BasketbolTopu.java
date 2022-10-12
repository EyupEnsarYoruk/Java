package kalýtým;

import java.awt.Color;

public class BasketbolTopu extends Top {

	public BasketbolTopu(String hammadde, double çap, Color renk, int elastikiyet) {
		super(hammadde, çap, renk, elastikiyet);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String toString() {
		return "BasketbolTopu [hammadde=" + hammadde + ", çap=" + çap + ", renk=" + renk + ", elastikiyet="
				+ elastikiyet + "]";
	}



	public void basket() {
		System.out.println("Basketbol topu basket oldu...");
	}

	
}
