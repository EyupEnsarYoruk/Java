package operatörler;

import java.util.Scanner;

public class Uygulama2 {

	public static void main(String[] args) {
		
		//(and &&, or ||, xor ^, not ! )
		
		Scanner giriþ = new Scanner(System.in);
		
		System.out.println("0 ile 100 arasýnda bir not giriniz:");
		double not=giriþ.nextDouble();
		
		//System.out.println("Girilen not doðru aralýkta mý?:"+(not>=0 && not<=100));
		
		System.out.println("Girilen not doðru aralýkta mý?:"+ !(not<0 || not>100));
		
		giriþ.close();
		

	}

}
