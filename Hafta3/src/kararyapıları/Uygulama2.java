package kararyapýlarý;

import java.util.Scanner;

public class Uygulama2 {

	public static void main(String[] args) {
		
		Scanner giriþ = new Scanner(System.in);
		
		System.out.println("Kilonuzu kg cinsinden giriniz:");
		
		double kg=giriþ.nextDouble();
		
		System.out.println("Boyunuzu metre cinsinden giriniz:");
		
		double boy=giriþ.nextDouble();
		
		double bki=kg/(boy*boy); 
		
		if (bki<18.5) {
			System.out.println("Zayýf");
		}else if (bki>=18.5 && bki<=24.9) {
			System.out.println("Normal");
		}else if (bki>=25 && bki<=29.9) {
			System.out.println("Kilolu");
		}else {
			System.out.println("Obez");
		}
		
		giriþ.close();

	}

}
