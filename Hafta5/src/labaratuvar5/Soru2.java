package labaratuvar5;

import java.util.Random;
import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		
		final int MAX_NUMBER=10;
		
		int guess; //Kullanýcýnýn tahminini tutacak
		int randNum; //rasgele bir sayý tutacak
		
		Scanner giriþ = new Scanner(System.in);
		
		Random rand= new Random();
		
		randNum = rand.nextInt(MAX_NUMBER);
		
		System.out.println("(0-9) arasýnda bir sayý düþünüyorum.");
		System.out.print("Ne olduðunu tahmin et: ");
		guess=giriþ.nextInt();
		
		while (guess!=randNum) {
			
			if (guess<randNum) {
				System.out.println("Hayýr, bu çok düþük.");
			}else if (guess>randNum) {
				System.out.println("Üzgünüm, bu çok yüksek.");
			}
			
			System.out.print("Tekrar tahmin et: ");
			guess=giriþ.nextInt();
		}
		
		System.out.println("Tebrikler! Tahmin ettin!");
		System.out.println(randNum+ " sayýsýný düþünüyordum.");
		
	}
}
