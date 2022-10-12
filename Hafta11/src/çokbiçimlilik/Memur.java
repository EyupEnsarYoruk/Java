package çokbiçimlilik;

public class Memur extends Personel {

	public Memur(String adsoyad, double maaþ, int sicilno, int yaþ) {
		super(adsoyad, maaþ, sicilno, yaþ);
		// TODO Auto-generated constructor stub
	}
	
	public void çalýþ() { //Methot Overriding
		System.out.println("Memur çalýþtý...");
	}
	
	public void çalýþ(int saat) { //Method Overloading
		System.out.println("Memur "+saat+" saat çalýþtý...");
	}

	@Override
	public String toString() {
		return "Memur [adsoyad=" + adsoyad + ", maaþ=" + maaþ 
				+ ", sicilno=" + sicilno + ", yaþ=" + yaþ + "]";
	}
	
}
