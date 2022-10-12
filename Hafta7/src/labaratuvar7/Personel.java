package labaratuvar7;

public class Personel {
	
	int sicilno;
	double maaþ; 
	int yaþ; 
	String adsoyad;
	
	public Personel() { //Default constructor
		
	}
		
	public Personel(int sicilno, double maaþ, int yaþ, String adsoyad) {
		super();
		this.sicilno = sicilno;
		this.maaþ = maaþ;
		this.yaþ = yaþ;
		this.adsoyad = adsoyad;
	}

	public void çalýþ() {
		System.out.println("Personel çalýþýyor...");
	}
	
	public void çalýþ(int mesai) {
		System.out.println("Personel "+mesai+" saat mesai yapacak...");
	}

	@Override
	public String toString() {
		return "Personel [sicilno=" + sicilno + ", maaþ=" + maaþ + ", yaþ=" + yaþ + 
				", adsoyad=" + adsoyad + "]";
	}
}
