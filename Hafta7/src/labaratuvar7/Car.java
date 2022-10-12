package labaratuvar7;

public class Car {
	
	private int yearModel;  // The car's year model
	   private String make;    // The car's make
	   private int speed;      // The current speed

	   /**
	      The constructor initializes the car's
	      year model and make.
	      @param y The car's year model.
	      @param m The car's make.
	   */

	   Car(int y, String m)
	   {
	      yearModel = y;
	      make = m;
	      speed = 0;
	   }

	   /**
	      The setYearModel method sets the car's
	      year model.
	      @param y The car's year model.
	   */

	   public void setYearModel(int y)
	   {
	      yearModel = y;
	   }

	   /**
	      The setMake method sets the car's make.
	      @param m The car's make.
	   */

	   public void setMake(String m)
	   {
	      make = m;
	   }

	   /**
	      The setSpeed method sets the car's current speed.
	      @param s The car's speed.
	   */

	   public void setSpeed(int s)
	   {
	      speed = s;
	   }

	   /**
	      The getYearModel method returns the car's
	      year model.
	      @return The car's year model.
	   */

	   public int getYearModel()
	   {
	      return yearModel;
	   }

	   /**
	      The getMake method returns the car's make.
	      @return The car's make.
	   */
	   
	   public String getMake()
	   {
	      return make;
	   }

	   /**
	      The getSpeed method returns the car's
	      current speed.
	      @return The car's current speed.
	   */
	   
	   public int getSpeed()
	   {
	      return speed;
	   }

	   /**
	      The accelerate method increases the car's
	      speed by 5 MPH.
	   */
	   
	   public void accelerate()
	   {
	      speed += 5;
	   }

	   /**
	      The brake method decreases the car's
	      speed by 5 MPH.
	   */
	   
	   public void brake()
	   {
	      speed -= 5;
	   }
}
