package sarmalama;

public class Personel {
	
	String adsoyad;
	private double maaþ;
	int sicilno;
	int yaþ;
	
	public Personel(String adsoyad, double maaþ, int sicilno, int yaþ) {
		super();
		this.adsoyad = adsoyad;
		this.maaþ = maaþ;
		this.sicilno = sicilno;
		this.yaþ = yaþ;
	}
	
	
	public double getMaaþ() {
		return maaþ;
	}

	public void setMaaþ(double maaþ) {
		
		if (maaþ>=2200 && maaþ<=10000) {
			this.maaþ = maaþ;
		} else {
			System.out.println("Hatalý maaþ belirleme iþleme yapýldý...");
		}
		
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
