package operatörler;

import java.util.Scanner;

public class Uygulama2 {

	public static void main(String[] args) {
		
		Scanner giriþ = new Scanner(System.in);
		
		System.out.println("Baþlangý sayýsýný giriniz:");
		
		double sayý=giriþ.nextDouble();
		
		System.out.println(sayý + " sayýsýna kaç eklemek istersiniz:");
		
		double ekleneceksayý=giriþ.nextDouble();
		
		sayý+=ekleneceksayý;
		
		System.out.println("Ýþlem sonucu:"+sayý);
		
		System.out.println(sayý+ " sayýsýndan kaç çýkarmak istersiniz");
		
		double çýkarýlacaksayý=giriþ.nextDouble();
		
		sayý-=çýkarýlacaksayý;
		
		System.out.println("iþlem sonucu:"+sayý);
		
		System.out.println(sayý+" sayýsýný kaç ile çarpmak istersiniz:");
		
		double çarpýlacaksayý=giriþ.nextDouble();
		
		sayý*=çarpýlacaksayý;
		
		System.out.println("Ýþlem sonucu:"+sayý);
		
		System.out.println(sayý+" sayýsýný kaç ile bölmek istersiniz:");
		
		double bölüneceksayý=giriþ.nextDouble();
		
		sayý/=bölüneceksayý;
		
		System.out.println("Ýþlem sonucu:"+sayý);
		
		giriþ.close();

	}

}
