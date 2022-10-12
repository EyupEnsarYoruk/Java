package tekboyutludiziler;

import java.util.Random;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Uygulama1 {

	public static void main(String[] args) {
		
		//veritipi[] diziadý=new veritipi[eleman sayýsý]; 
		
		//Örnek: int[] dizi=new int[10]; 

		//Dizilerin veri tipi ne ise içerisine o tipte deðiþken koyulmalýdýr.
		//Farklý veri tipindeki elemanlarýn dizi içerisine aktarýlmasý önlenmelidir.
		
		//Dizi oluþtururken statik atama kullanmýyorsak default olarak dizinin
		//için veri tipinin default deðeri ile dolar
		
		//Örneðin örnekteki dizinin 10 elemaný 0 olarak doldurulur. 
		//dizinin ilk elemanýnýn indis deðeri 0 dýr.
		//Örnekteki dizinini ilk elemaný dizi[0]
		//Dizinin son elemanýna dizinin eleman sayýsý-1 þeklinde ulaþýlýr
		//Örnekteki kodda dizi[9]
		
		Random rasgelesayýüretici= new Random();
		
		int[] dizi=new int[10];
		
		int toplam=0;
		
		for (int i = 0; i < dizi.length; i++) {
			
			dizi[i]=rasgelesayýüretici.nextInt(50)+50;   //nextInt(50) 0 ile 49 arasýnda sayý üretiyor
			System.out.println((i+1)+".sayý: "+dizi[i]);
			toplam+=dizi[i];
			
		}
		
		System.out.println("Dizinin elemanlarý toplamý: "+ toplam);
		System.out.println("Dizinin ortalamasý: "+ (double)toplam/dizi.length); //Casting iþlemi yapýldý
			
	}
}
