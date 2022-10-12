package kararyapýlarý;

import java.util.Scanner;

public class Uygulama3 {

	public static void main(String[] args) {
		
		Scanner giriþ = new Scanner(System.in);
		
		System.out.println("Haftanýn günleri için 1-7 arasý bir sayý girin:");
		
		byte sayý=giriþ.nextByte();
		
		switch (sayý) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salý");
			break;
		case 3:
			System.out.println("Çarþamba");
			break;
		case 4:
			System.out.println("Perþembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
			
		default:
			System.out.println("Yanlýþ giriþ yaptýnýz...");
			break;
		}
		
		giriþ.close();

	}
}
