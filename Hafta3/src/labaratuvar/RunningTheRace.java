package labaratuvar;

import java.util.Scanner;

public class RunningTheRace {
	
	public static void main(String[] args)
	   {
	      String runner1,      // First runner's name
	             runner2,      // Second runner's name
	             runner3,      // Third runner's name
	             firstPlace,   // Name of first place runner
	             secondPlace,  // Name of second place runner
	             thirdPlace;   // Name of third place runner

	      double time1,        // First runner's time
	             time2,        // Second runner's time
	             time3;        // Third runner's time
	      
	      // Create a Scanner object for keyboard input.
	      Scanner keyboard = new Scanner(System.in);

	      // Display intro.
	      System.out.println("This program displays the " +
	                         "first, second, and third");
	      System.out.println("place runners in a race.");
	      System.out.println("No ties, please.");
	      
	      // Get the first runner's data.
	      System.out.print("Enter the first runner's name: ");
	      runner1 = keyboard.nextLine();
	      System.out.print("Enter the first runner's time: ");
	      time1 = keyboard.nextDouble();
	      
	      // Get the second runner's data.
	      System.out.print("Enter the second runner's name: ");
	      runner2 = keyboard.nextLine();   // Consume the remaining newline
	      runner2 = keyboard.nextLine();
	      System.out.print("Enter the second runner's time: ");
	      time2 = keyboard.nextDouble();
	   
	      // Get the third runner's data.
	      System.out.print("Enter the third runner's name: ");
	      runner3 = keyboard.nextLine();   // Consume the remaining newline
	      runner3 = keyboard.nextLine();
	      System.out.print("Enter the third runner's time: ");
	      time3 = keyboard.nextDouble();
	      
	      // Determine the first place runner.
	      if (time1 < time2 && time1 < time3)
	         firstPlace = runner1;
	      else if(time2 < time1 && time2 < time3)
	         firstPlace = runner2;
	      else
	         firstPlace = runner3;   

	      // Determine the second place runner.
	      if (time1 < time2 && time1 > time3)
	         secondPlace = runner1;
	      else if (time1 < time3 && time1 > time2)
	         secondPlace = runner1;
	      else if(time2 < time1 && time2 > time3)
	         secondPlace = runner2;
	      else if(time2 < time3 && time2 > time1)
	         secondPlace = runner2;
	      else
	         secondPlace = runner3;
	               
	      // Determine the third place runner.
	      if (time1 > time2 && time1 > time3)
	         thirdPlace = runner1;
	      else if(time2 > time1 && time2 > time3)
	         thirdPlace = runner2;
	      else
	         thirdPlace = runner3;

	      // Display the results.
	      System.out.println("1st place: " + firstPlace);
	      System.out.println("2nd place: " + secondPlace);
	      System.out.println("3rd place: " + thirdPlace);
	   }

}
