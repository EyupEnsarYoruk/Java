package metotlar;

import java.util.Scanner;

public class Uygulama2 {

	public static void main(String[] args) {
		
		//Bir metot oluşturulup metoda bir sayı gönderelim.
		//Metot bize sayının asal olup olmadığını söylesin.
		
		Scanner giriş = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayı=giriş.nextInt();
		
		if (asalMı(sayı)) {
			System.out.println("Sayı asaldır...");
		} else {
			System.out.println("Sayı asal değildir...");	
		}
		giriş.close();

	}

	private static boolean asalMı(int asal) {
		
		for (int i = asal-1; i >= 2; i--) {
			
			if (asal%i==0) {
				return false;
			}
		}
		return true;
	}
}
