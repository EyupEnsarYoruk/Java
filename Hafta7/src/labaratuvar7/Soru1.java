package labaratuvar7;

public class Soru1 {

	public static void main(String[] args) {
		
		Personel per1=new Personel();
		
		Personel per2=new Personel(36521458, 15000.0, 30, "Tolga Han");
		
		per1.sicilno=1234567;
		per1.maaþ=10000.0;
		per1.yaþ=25;
		per1.adsoyad="Ahmet Toprak";
		
		System.out.println(per1.toString());
		System.out.println("-----------------------------");
		System.out.println(per2.toString());
		
		per1.çalýþ();
		per2.çalýþ(10);

	}
}
