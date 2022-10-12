package sýnýfvenesne;

import java.awt.Color;

public class Top {
	
	double çap;
	int elastikiyet;
	Color renk;
	String hammadde;
	
	//Yapýlandýrýcý metotlar (Constructor methods) 
	
    public Top() {//Default Constructor
		
	}

	public Top(double çap, int elastikiyet, Color renk, String hammadde) {
		super();
		this.çap = çap;
		this.elastikiyet = elastikiyet;
		this.renk = renk;
		this.hammadde = hammadde;
	}
	
	//Bir sýnýfýn içerisinde bir metoton ayný isimle birden fazla tekrarlanmasýna
	//method overloading (metot aþýrý yükleme) denir.
	//Eðer aþýrý yüklenen metot yapýlandýrýcý metot ise buna constructor overloading denir.
	//Yapýlandýrýcýnýn aþýrý yüklenmesi denir.

	public void zýpla() {
		System.out.println("Top zýpladý...");
	}	
	
	public void zýpla(int metre) {//Method overloading
		System.out.println("Top "+metre+" metre zýpladý...");
	}
	
	public void yuvarlan() {
		System.out.println("Top yuvarlandý...");
	}

	@Override
	public String toString() {
		return "Top [çap=" + çap + ", elastikiyet=" + elastikiyet + 
				", renk=" + renk + ", hammadde=" + hammadde + "]";
	}
}
