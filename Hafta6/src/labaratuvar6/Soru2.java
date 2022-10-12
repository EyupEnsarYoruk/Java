package labaratuvar6;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Soru2 {

	public static void main(String[] args) {
		
		String input;
		double wholesale; // toptan maliyet
		double markup; // kar marjý yüzdesi
		
		input=JOptionPane.showInputDialog("Ürünün toptan satýþ mmaliyetini girin: ");
		wholesale=Double.parseDouble(input);
		
		input=JOptionPane.showInputDialog("Ürünün kar marjý yüzdesini girin: ");
		markup=Double.parseDouble(input);
		
		DecimalFormat dollar= new DecimalFormat("#,##0.00");
		
		JOptionPane.showMessageDialog(null, "Ürünün perakende fiyatý $. " + 
		                       dollar.format(perakendeHesapla(wholesale,markup)) +" dýr.");
		
		System.exit(0);

	}

	private static double perakendeHesapla(double wholesale, double markup) {
		
		return wholesale +(wholesale*(markup/100.0));
	}
}
