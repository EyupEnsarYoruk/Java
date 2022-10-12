package labaratuvar4;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		
		int maxNum, num, total=0;
	
		Scanner giriþ = new Scanner(System.in);
	
		System.out.println("Sýfýrdan farklý pozitif bir sayý girin: ");
		maxNum=giriþ.nextInt();
		
		while (maxNum<=0) {
			
			System.out.println("Geçersiz deðer. Sýfýrdan farklý pozitif bir sayý girin: ");
			maxNum=giriþ.nextInt();
		}
		
		num=1;
		
		while (num<=maxNum) {
			
			total +=num;
			num++;
		}
		
		System.out.println("1 ile "+ maxNum +" arasýndaki tüm tam sayýlarýn toplamý "+total+ " dýr.");
		
	}
}
