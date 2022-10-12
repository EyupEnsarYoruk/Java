package labaratuvar5;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		
		int number;
		
		Scanner giriþ = new Scanner(System.in);
		
		System.out.println("1-15 arlýðýnda bir tamsayý girin: ");
		number=giriþ.nextInt();
		
		while (number<1 || number>15) {
			System.out.println("Üzgünüm, bu geçersiz bir sayý."); 
			System.out.println("1-15 arlýðýnda bir tamsayý girin: ");
			number=giriþ.nextInt();
		}
		
		for (int row = 0; row < number; row++) {
			
			for (int column = 0; column < number; column++) {
				
				System.out.print("X");
			}
			
			System.out.println();
		}
	}
}
