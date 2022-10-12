package çokbiçimlilik;

public class Müdür extends Personel {

	public Müdür(String adsoyad, double maaþ, int sicilno, int yaþ) {
		super(adsoyad, maaþ, sicilno, yaþ);
		// TODO Auto-generated constructor stub
	}
	
	public void çalýþ() { //Methot Overriding
		System.out.println("Müdür çalýþtý...");
	}

	@Override
	public String toString() {
		return "Müdür [adsoyad=" + adsoyad + ", maaþ=" + maaþ 
				+ ", sicilno=" + sicilno + ", yaþ=" + yaþ + "]";
	} 
	
}
