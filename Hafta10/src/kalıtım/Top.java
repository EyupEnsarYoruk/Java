package kalýtým;

import java.awt.Color;

public class Top {
	
	String hammadde;
	double çap;
	Color renk;
	int elastikiyet;
	
	public Top(String hammadde, double çap, Color renk, int elastikiyet) {
		this.hammadde = hammadde;
		this.çap = çap;
		this.renk = renk;
		this.elastikiyet = elastikiyet;
	}

	@Override
	public String toString() {
		return "Top [hammadde=" + hammadde + ", çap=" + çap + ", renk=" + 
				renk + ", elastikiyet=" + elastikiyet + "]";
	}
	
	public void zýpla() {
		System.out.println("Top zýpladý...");
	}
	
	public void yuvarlan() {
		System.out.println("Top yuvarlandý...");
	}

}
