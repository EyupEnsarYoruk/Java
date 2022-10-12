package operatörler;

import java.util.Scanner;

public class Uygulama1 {

	public static void main(String[] args) {
		
		//(==, !=, <, >, <=, >=)
		
		Scanner giriþ = new Scanner(System.in);
		
		System.out.println("Birinci Sayýyý Girin:");
		double sayý1=giriþ.nextDouble();
	
		System.out.println("Ýkinici Sayýyý Girin:");
		double sayý2=giriþ.nextDouble();
		
		System.out.println("Birinci sayý ile ikinici sayý eþitmi: "+(sayý1==sayý2));
		System.out.println("Birinci sayý ikinici sayýdan farklý mý: "+(sayý1!=sayý2));
		System.out.println("Birinci sayý ikinciden büyük mü: "+(sayý1>sayý2));
		System.out.println("Birinci sayý ikinci sayýdan küçük mü:"+(sayý1<sayý2));
		System.out.println("Birinci sayý ikinciden büyük veya ikinciye eþit mi: "+(sayý1>=sayý2));
		System.out.println("Birinci sayý ikinciden küçük veya ikiciye eþit mi: "+(sayý1<=sayý2));
		
		giriþ.close();

	}

}
