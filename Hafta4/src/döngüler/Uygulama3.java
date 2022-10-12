package döngüler;

import java.util.Scanner;

public class Uygulama3 {

	public static void main(String[] args) {
		
		
		Scanner giriþ = new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		
		String kelime=giriþ.next();
		
		while (!kelime.equalsIgnoreCase("bitti")) {
			
			System.out.println("Girilen kelimesi "+kelime.length()+" karekter içermektedir.");
			
			System.out.println("Bir kelime giriniz: ");
			kelime=giriþ.next();
		}
	}
}
