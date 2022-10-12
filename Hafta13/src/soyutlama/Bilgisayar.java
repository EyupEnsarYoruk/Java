package soyutlama;

public abstract class Bilgisayar {
	
	String iþletimsistemi;

	public Bilgisayar(String iþletimsistemi) {
		super();
		this.iþletimsistemi = iþletimsistemi;
	}
	
	public abstract void videoOynat();
	
	public abstract void oyunOynat();
	
	public abstract void interneteBaðlan();
	


}
