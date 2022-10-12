package kararyapýlarý;

import java.util.Scanner;

public class Uygulama1 {

	public static void main(String[] args) {
		
		Scanner giriþ = new Scanner(System.in);
		
		System.out.println("Bir not giriniz:");
		
		double not=giriþ.nextDouble();
		
		if (not>=0 && not<=100) {
			System.out.println("Girilen not doðru aralýkta...");
			
		} else {
			System.out.println("Girilen not doðru aralýkta deðildir... ");

		}
		giriþ.close();

	}

}
