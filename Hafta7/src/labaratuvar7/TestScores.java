package labaratuvar7;

public class TestScores {

	   private double score1;  // First test score
	   private double score2;  // Second test score
	   private double score3;  // Third test score

	   /**
	      The constructor initializes the object with
	      three test scores.
	      @param s1 The first test score.
	      @param s2 The second test score.
	      @param s3 The third test score.
	   */

	   public TestScores(double s1, double s2, double s3)
	   {
	      score1 = s1;
	      score2 = s2;
	      score3 = s3;
	   }
	   
	   /**
	      The setScore1 method sets the first test score.
	      @param s The value to set the score to.
	   */

	   public void setScore1(double s)
	   {
	      score1 = s;
	   }

	   /**
	      The setScore2 method sets the second test score.
	      @param s The value to set the score to.
	   */

	   public void setScore2(double s)
	   {
	      score2 = s;
	   }

	   /**
	      The setScore3 method sets the third test score.
	      @param s The value to set the score to.
	   */

	   public void setScore3(double s)
	   {
	      score3 = s;
	   }

	   /**
	      The getScore1 method returns the first test score.
	      @return The value of the test score.
	   */

	   public double getScore1()
	   {
	      return score1;
	   }

	   /**
	      The getScore2 method returns the second test score.
	      @return The value of the test score.
	   */

	   public double getScore2()
	   {
	      return score2;
	   }

	   /**
	      The getScore3 method returns the third test score.
	      @return The value of the test score.
	   */

	   public double getScore3()
	   {
	      return score3;
	   }

	   /**
	      The getAverage method returns the average of
	      the test scores.
	      @return The average of the test scores.
	   */

	   public double getAverageScore()
	   {
	      return (score1 + score2 + score3) / 3.0;
	   }

}
