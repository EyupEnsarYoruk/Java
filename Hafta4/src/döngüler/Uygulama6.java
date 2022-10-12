package döngüler;

import java.util.Scanner;

public class Uygulama6 {

	public static void main(String[] args) {
		
		// Ýç içe döngüler
		
		/*
		   *
		   **
		   ***
		   ****
		   *****
		 */
		
		Scanner giriþ = new Scanner(System.in);
		int satýrsayýsý=giriþ.nextInt();
		
		
		for (int i = 0; i < satýrsayýsý; i++) {
			for (int j = 0; j < i+1 ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
}
