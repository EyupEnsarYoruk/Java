package labaratuvar;

import java.util.Scanner;

public class MagicDates {

	public static void main(String[] args) {
		
		// Variables to hold the month, day, and year
	      int month;
	      int day;
	      int year;
	      
	      // Create a Scanner object for keyboard input.
	      Scanner keyboard = new Scanner(System.in);
	      
	      // Get a month.
	      System.out.print("Enter the number for a month: ");
	      month = keyboard.nextInt();
	      
	      // Get a day.
	      System.out.print("Enter the number for a day: ");
	      day = keyboard.nextInt();
	      
	      // Get a two-digit year.
	      System.out.print("Enter a two-digit year: ");
	      year = keyboard.nextInt();
	      
	      // Is the date magic?
	      if ( (month * day) == year )
	      {
	         System.out.println("That date is magic!");
	      }
	      else
	      {
	         System.out.println("Sorry, that's just a regular " +
	                            "date... not magic.");
	      }

	}

}
