package sahiplik;

public class Personel {
	
	String adsoyad;
	double maaþ;
	int sicilno;
	int yaþ;
	Adres adres;
	
	public Personel(String adsoyad, double maaþ, int sicilno, int yaþ) {
		super();
		this.adsoyad = adsoyad;
		this.maaþ = maaþ;
		this.sicilno = sicilno;
		this.yaþ = yaþ;
	}
	

	public Personel(String adsoyad, double maaþ, int sicilno, int yaþ, Adres adres) {
		super();
		this.adsoyad = adsoyad;
		this.maaþ = maaþ;
		this.sicilno = sicilno;
		this.yaþ = yaþ;
		this.adres = adres;
	}

	public void çalýþ() {
		System.out.println("Personel çalýþtý...");
	}

	@Override
	public String toString() {
		return "Personel [adsoyad=" + adsoyad + ", maaþ=" + maaþ 
				+ ", sicilno=" + sicilno + ", yaþ=" + yaþ + "]";
	}
	
	public void izinHakkýnýKullan(int gün) {
		System.out.println("Personel "+gün+" gün izin kullandý...");
	}
}
