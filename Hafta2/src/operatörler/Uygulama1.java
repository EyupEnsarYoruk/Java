package operatörler;

import java.util.Scanner;

public class Uygulama1 {

	public static void main(String[] args) {
		
		Scanner giriþ = new Scanner(System.in); 
		
		System.out.println("Birinci sayýyý giriniz:");
		
		double sayý1=giriþ.nextDouble();
		
		System.out.println("Ýkinci sayýyý giriniz:");
		
		double sayý2=giriþ.nextDouble();
		
		System.out.println("Sayýlarýn toplamý: "+(sayý1+sayý2)+" sayýsý");
		
		System.out.println("Sayýlarýn farký: "+(sayý1-sayý2));
		
		System.out.println("Sayýlarýn çarpýmý: "+sayý1*sayý2);
		
		System.out.println("Sayýlarýn bölümü: "+sayý1/sayý2);
		
		System.out.println("Sayýlarýn modu: "+sayý1%sayý2);
		
		giriþ.close();
		

	}

}
