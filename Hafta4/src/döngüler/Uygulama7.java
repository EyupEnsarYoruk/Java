package döngüler;

import java.util.Scanner;

public class Uygulama7 {

	public static void main(String[] args) {
		
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
			
			for (int j = 0; j < satýrsayýsý; j++) {
				
				if (i+j>=satýrsayýsý-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
		
	}

}
