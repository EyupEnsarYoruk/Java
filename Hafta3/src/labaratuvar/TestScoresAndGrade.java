package labaratuvar;

import java.util.Scanner;

public class TestScoresAndGrade {

	public static void main(String[] args) {
		
		double test1,     // Test score #1
		test2,     // Test score #2
		test3,     // Test score #3
        average;   // Average test score
		char grade;       // Letter grade

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get three test scores from the user.
		System.out.print("Enter test score #1: ");
		test1 = keyboard.nextDouble();
   
		System.out.print("Enter test score #2: ");
		test2 = keyboard.nextDouble();
   
		System.out.print("Enter test score #3: ");
		test3 = keyboard.nextDouble();
   
		// Calculate the average test score.
		average = (test1 + test2 + test3) / 3;

		// Determine the letter grade.
		if (average >= 90 && average <= 100)
			grade = 'A';
		else if (average >= 80 && average <= 89)
			grade = 'B';
		else if (average >= 70 && average <= 79)
			grade = 'C';
		else if (average >= 60 && average <= 69)
			grade = 'D';
		else 
			grade = 'F';

		// Display the average test score.
		System.out.println("Average score: " + average);

		// Display the letter grade.
		System.out.println("Letter grade: " + grade);
   
		keyboard.close();
   	
	}

}
