package sahiplik;

public class Uygulama4 {

	public static void main(String[] args) {
		
		Adres adres1=new Adres("Ýstanbul", "Küçükçekmece", "Kemalpaþa", 10);
		Personel personel=new Personel("Turgut Yýlmaz", 7500, 105, 50, adres1);
		Personel personel2=new Personel("Murat Kazanç", 10000, 106, 46);
		
		System.out.println(personel.adres.toString());
		System.out.println(personel.adres.il);
		
		//Personel sýnýfý adres sýnýfýna sahiptir.
		// Adres personel e sahip deðildir. 
		// Aralarýnda sahiplik iliþkisi vardýr denir.

	}

}
