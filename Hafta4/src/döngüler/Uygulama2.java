package döngüler;

import java.util.Scanner;

public class Uygulama2 {

	public static void main(String[] args) {
		
		Scanner giriþ = new Scanner(System.in);
		
		System.out.println("Baþlangýç sayýsýný giriniz: ");
		int baþlangýçsayýsý=giriþ.nextInt();
		
		System.out.println("Bitiþ sayýsýný giriniz: ");
		int bitiþsayýsý=giriþ.nextInt();
		
		if (baþlangýçsayýsý<bitiþsayýsý) {
			
			for (int i = baþlangýçsayýsý; i <=bitiþsayýsý; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("Bitiþ sayýsý baþlangýç sayýsýndan büyük olmalýdýr...");
		}
	}
}
