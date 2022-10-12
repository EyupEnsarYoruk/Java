package çokbiçimlilik;

public class Öðretmen extends Personel {

	String branþ;
	
	public Öðretmen(String adsoyad, double maaþ, int sicilno, int yaþ) {
		super(adsoyad, maaþ, sicilno, yaþ);
		// TODO Auto-generated constructor stub
	}
	
	
	public void çalýþ() {
		System.out.println("Öðretmen çalýþtý...");
	}


	@Override
	public String toString() {
		return "Öðretmen [branþ=" + branþ + ", adsoyad=" + adsoyad + 
				", maaþ=" + maaþ + ", sicilno=" + sicilno
				+ ", yaþ=" + yaþ + "]";
	}
	
	public void dersVer(String branþ) {
		System.out.println("Öðretmen "+branþ+ " dersi verdi...");
	}

}
