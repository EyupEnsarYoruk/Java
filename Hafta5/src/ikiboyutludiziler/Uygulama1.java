package ikiboyutludiziler;

import java.util.Random;

public class Uygulama1 {

	public static void main(String[] args) {
		
		// Ýki boyutlu diziler tek boyutlu dizilerin üst üste dizilmiþ halidir.
		// veritipi[][] diziadý=new veritipi[satýr sayýsý][sütun sayýsý];
		
		// Örnek: int [][] ikiboyutlu= new int[4][5];
		// 4 satýri 5 sütuna sahip iki boyutlu bir dizi tanýmlanmýþtýr...
		
		//Ýki boyutlu diziye 10 ile 30 arasýnda rasgele sayýlarýn yerleþtirilmesi
		
		
		Random rasgelesayýüretici=new Random();
		
		int [][] ikiboyutlu=new int[4][5];
		
		for (int i = 0; i < ikiboyutlu.length; i++) { //satýr uzunluðu
			for (int j = 0; j < ikiboyutlu[i].length; j++) {//her satýrdaki dizi uzunluðu
				ikiboyutlu[i][j]=rasgelesayýüretici.nextInt(20)+10;
				System.out.print(ikiboyutlu[i][j]+"\t");
			}	
			System.out.println();
		}
	}

}
