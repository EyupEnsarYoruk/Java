package çokbiçimlilik;

public class Uygulama1 {

	public static void main(String[] args) {
		
		Personel personel1=new Personel("Süleyman Çýnar", 5000, 101, 40);
		Personel personel2=new Öðretmen("Murat Kazanç", 7000, 102, 38);
		System.out.println(personel1.toString());
		System.out.println("---------------------------");
		System.out.println(personel2.toString());
		System.out.println("---------------------------");
		
		//personel2 nesnesi þu ana kadar bir personel nesnesidir.
		//ancak öðretmeni refarans gösterdiði için override edilen 
		//metotlar için referans gösterildiði alt sýnýftaki metodu
		//kullanmayý tercih eder.
		
		
		Öðretmen yeniöðretmen=(Öðretmen) personel2; // Aþaðý çevrim (Down casting)
		System.out.println("Yeni öðretmenin özellikleri-------------------------");
		System.out.println(yeniöðretmen.toString());
		yeniöðretmen.dersVer("Web Programlama");
		System.out.println("---------------------------");
		
		Personel yenipersonel=yeniöðretmen; //Yukarý çevrim (Up casting)
		System.out.println(yenipersonel.toString());
		
		yenipersonel.izinHakkýnýKullan(10);
		

	}

}
