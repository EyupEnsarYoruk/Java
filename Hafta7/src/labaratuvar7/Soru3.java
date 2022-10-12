package labaratuvar7;

public class Soru3 {

	public static void main(String[] args)
	   {
	      Car sportsCar = new Car(2004, "Porsche");
	      
	      // Display the current status.
	      System.out.println("Current status of the car:");
	      System.out.println("Year model: " + sportsCar.getYearModel());
	      System.out.println("Make: " + sportsCar.getMake());
	      System.out.println("Speed: " + sportsCar.getSpeed());
	      
	      // Accelerate the car five times.
	      System.out.println("\nAccelerating...");
	      sportsCar.accelerate();
	      sportsCar.accelerate();
	      sportsCar.accelerate();
	      sportsCar.accelerate();
	      sportsCar.accelerate();
	      
	      // Display the speed.
	      System.out.println("Now the speed is " + sportsCar.getSpeed());
	      
	      // Brake the car five times.
	      System.out.println("\nBraking...");
	      sportsCar.brake();
	      sportsCar.brake();
	      sportsCar.brake();
	      sportsCar.brake();
	      sportsCar.brake();
	      
	      // Display the speed.
	      System.out.println("Now the speed is " + sportsCar.getSpeed());
	   }

}
