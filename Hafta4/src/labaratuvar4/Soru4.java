package labaratuvar4;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		
		double speed;
		int maxHour;
		int period;
		
		Scanner giriþ = new Scanner(System.in);
		
		System.out.println("Aracýn hýzýný girin: ");
		speed=giriþ.nextDouble();
		
		while (speed<0) {
			System.out.println("Hýz için 0 veya daha büyük deðer girin : ");
			speed=giriþ.nextDouble();
		}
		
		System.out.println("Aracýn hareket halinde olduðu saat süresini girin: ");
		maxHour=giriþ.nextInt();
		
		while (maxHour<1) {
			System.out.println("Saat süresi için 1 veya daha büyük deðer girin: ");
			maxHour=giriþ.nextInt();
		}
		
		System.out.println("Saat\tGidilen Mesafe");
		System.out.println("----------------------------");
		
		period=1;
		
		while (period<=maxHour) {
			System.out.println(period+ "\t\t"+period*speed);
			period++;
		}

	}

}
