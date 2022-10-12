package labaratuvar4;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		
		int num, largest, smallest;
		
		Scanner giriş = new Scanner(System.in);
		
		System.out.println("Bir tamsayı girin veya çıkmak için -99 :");
		num=giriş.nextInt();
		
		largest=num;
		smallest=num;
		
		while (num!=-99) {
			
			System.out.println("Bir tamsayı girin veya çıkmak için -99 :");
			num=giriş.nextInt();
			
			if (num!=-99 && num>largest) {
				largest=num;
			}
			
			if (num!=-99 && num<smallest) {
				smallest=num;
			}
			
		}
		
		if (largest==-99) {
			System.out.println("Herhangi bir sayı girmediniz...  ");
		} else {
			System.out.println("En büyük: "+largest);
			System.out.println("En küçük: "+smallest);
		}
	}
}
