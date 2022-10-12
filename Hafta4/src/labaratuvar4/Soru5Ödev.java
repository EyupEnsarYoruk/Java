package labaratuvar4;

import java.util.Scanner;

public class Soru5Ödev {

	public static void main(String[] args) {
		
		
		
		Scanner giriþ = new Scanner(System.in);
		
		System.out.println("Satýr Sayýsý..: ");
		int satýrsayýsý=giriþ.nextInt();
		
		for (int i = 1; i <=satýrsayýsý; i++) {
			for (int j = 1; j <= satýrsayýsý-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i*2-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
