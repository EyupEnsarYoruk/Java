package labaratuvar6;

import java.util.Random;

import javax.swing.JOptionPane;

public class Soru3 {

	public static void main(String[] args) {
		
		int numEven=0; //çift sayýlarýn sayýsý
		int numOdd=0; // tek sayýlarýn sayýsý
		
		Random randomValue= new Random();
		
		for (int i = 1; i <=100; i++) {
			
			if (isEven(randomValue.nextInt(i))) {
				numEven++;
			}else {
				numOdd++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Rasgele oluþturulmuþ 100 sayýdan "+
		               + numEven+"adedi çift ve"+numOdd+" adedi tek sayýdýr.");

	}

	private static boolean isEven(int num) {
			
		if ((num%2)==0) {
			return true;
		}
		return false;
	}

}
