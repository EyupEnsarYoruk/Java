package metotlar;

import java.util.Scanner;

public class Uygulama4 {

	public static void main(String[] args) {
		
		// Kullanýcý bize dairenin yarýçapýný versin. Biz de dairenin 
		// alanýný ve hacmini hesaplatalým.
		
		Scanner giriþ = new Scanner(System.in);
		
		System.out.println("Yarýçapý giriniz (cm): ");
		double yarýçap=giriþ.nextDouble();
		
		alanHesapla(yarýçap);
		
		çevreHesapla(yarýçap);
		
	}

	private static void çevreHesapla(double yarýçap) {
		System.out.println("Dairenin çevresi: "+Math.PI*2*yarýçap + " cm");
	}

	private static void alanHesapla(double yarýçap) {
		System.out.println("Dairenin alaný: "+Math.PI*Math.pow(yarýçap, 2)+" cm2");
	}

}
