package tekboyutludiziler;

import java.util.Arrays;
import java.util.Random;

public class Uygulama2 {

	public static void main(String[] args) {
		
		// Rasgele sayý ile doldurulmuþ dizinin en büyüðü 
		// en küçüðünün bulunmasý
		
		Random rasgelesayýüretici= new Random();
		
		int[] dizi=new int[10];
		
		for (int i = 0; i < dizi.length; i++) {
			
			dizi[i]=rasgelesayýüretici.nextInt(50)+50;   //nextInt(50) 0 ile 49 arasýnda sayý üretiyor
			System.out.println((i+1)+".sayý: "+dizi[i]);
		
		}
		
		int ek=dizi[0];
		int eb=dizi[0];
		
		for (int i = 1; i < dizi.length; i++) {
			
			if (dizi[i]<ek) {
				ek=dizi[i];
			}
			if (dizi[i]>eb) {
				eb=dizi[i];
			}
		}
		
		System.out.println("Dizinin en küçük elemaný:"+ek);
		System.out.println("Dizinin en büyük elemaný:"+eb);
		
		Arrays.sort(dizi);
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]); 
		}
		
		int[] tersdizi=new int[10];
		
		for (int i = 0; i < tersdizi.length; i++) {
			tersdizi[i]=dizi[9-i];
		}
		
		System.out.println("------------------------");
		for (int i = 0; i < tersdizi.length; i++) {
			System.out.println(tersdizi[i]);
		}
		
		
	}
}
