package labaratuvar;

import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {
		
		  int number;          // To hold a number

	      // Create a Scanner object for keyboard input.
	      Scanner keyboard = new Scanner(System.in);
	                  
	      // Get a number from the user.
	      System.out.print("Enter a number in the " +
	                         "range of 1 - 10: ");
	      number = keyboard.nextInt();
	      
	      // Display the Roman numeral.
	      switch (number)
	      {
	         case 1 :    System.out.println("I");
	                     break;
	                     
	         case 2 :    System.out.println("II");
	                     break;
	                     
	         case 3 :    System.out.println("III");
	                     break;
	                     
	         case 4 :    System.out.println("IV");
	                     break;
	                     
	         case 5 :    System.out.println("V");
	                     break;
	                     
	         case 6 :    System.out.println("VI");
	                     break;
	                     
	         case 7 :    System.out.println("VII");
	                     break;
	                     
	         case 8 :    System.out.println("VIII");
	                     break;
	                     
	         case 9 :    System.out.println("IX");
	                     break;
	                     
	         case 10 :   System.out.println("X");
	                     break;
	                     
	         default :   System.out.println("Invalid number.");
	     }

	}

}
