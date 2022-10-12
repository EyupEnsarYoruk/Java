package döngüler;

import java.util.Scanner;

public class Uygulama4 {

	public static void main(String[] args) {
		
		Scanner giriþ = new Scanner(System.in);
		
		int toplam=0;
		
		do {
			
			System.out.println("Eklenecek sayýyý girin: ");
			int ekleneceksayý=giriþ.nextInt();
			
			toplam +=ekleneceksayý;
			
			System.out.println("Toplam: "+toplam);
			
			
		} while (toplam<=100);
		
		System.out.println("Program sonlandý toplam:" + toplam);
		giriþ.close();
	}
}
