package metotlar;

import java.util.Random;
import java.util.Scanner;

public class Uygulama5 {

	public static void main(String[] args) {
	
		//Kullanýcýdan dizinin eleman sayýsýný ve içindeki en küçük sayýyý,
		// en büyük sayýyý girmesini isteyelim. 
		
		Scanner giriþ = new Scanner(System.in);
		
		System.out.println("Dizinin eleman sayýsýný girin: ");
		int elemansayýsý=giriþ.nextInt();
		
		System.out.println("Dizinin en küçük olasý sayýsýný girin: ");
		int ek=giriþ.nextInt();
		
		System.out.println("Dizinin en büyük olasý sayýsýný girin: ");
		int eb=giriþ.nextInt();
		
		int [] dizi=diziOluþtur(ek, eb, elemansayýsý);
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i]+"\t");
		}
		giriþ.close();
	}

	private static int[] diziOluþtur(int ek, int eb, int elemansayýsý) {
		
		Random rasgelesayýüretici= new Random();
		
		int[] dizi= new int[elemansayýsý];
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i]=rasgelesayýüretici.nextInt(eb-ek)+ek;
		}
		return dizi;
	}
	
	
	
}
