package metotlar;

import java.util.Random;
import java.util.Scanner;

public class Uygulama3 {

	public static void main(String[] args) {
		// Kullanıcıdan bir adet küçük sayı bir adet büyük sayı alın.
		//Metodumuz girilen bu sayılar arasında rasgele bir sayı döndürsün.
		
		//Ör: Küçükü sayı: 20
		//    Büyük sayı: 50
		//Metot 20 ile 50 arasında rasgele bir sayı üretip bize döndürecek.
		
		Scanner giriş = new Scanner(System.in);
		
		System.out.println("Küçük sayıyı girin: ");
		int küçüksayı=giriş.nextInt();
		
		System.out.println("Büyük sayıyı girin: ");
		int büyüksayı=giriş.nextInt();
		
		if (büyüksayı>küçüksayı) {
			
			int rasgelesayı=rasgeleSayıÜret(küçüksayı,büyüksayı);
			
			System.out.println("Üretilen rasgele sayı: "+rasgelesayı);
			
		} else {
			System.out.println("Hatalı giriş...");
		}
	}

	private static int rasgeleSayıÜret(int küçüksayı, int büyüksayı) {
		
		Random rasgelesayıüretici= new Random();

		return rasgelesayıüretici.nextInt(büyüksayı-küçüksayı)+küçüksayı;
	}
}
