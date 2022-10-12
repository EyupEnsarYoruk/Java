package essayactivity;

public class Essay extends GradedActivity {

	private double grammer;
	private double spelling;
	private double correctLength;
	private double content;
	
	public Essay() {
		// TODO Auto-generated constructor stub
	}
	
	public void setScore(double grammer, double spelling, double correctLength,double content)
	{
		setGrammer(grammer);
		setSpelling(spelling);
		setCorrectLength(correctLength);
		setContent(content);
		
		super.setScore(grammer+spelling+correctLength+content);
	
	}

	public double getGrammer() {
		return grammer;
	}

	public void setGrammer(double grammer) {
		
		if (grammer<=30.0) {
			this.grammer = grammer;
		} else {
			this.grammer = 0.0;
		}

	}

	public double getSpelling() {
		return spelling;
	}

	public void setSpelling(double spelling) {
		
		if (spelling<=20.0) {
			this.spelling = spelling;
		} else {
			this.spelling = 0.0;
		}
		
	}

	public double getCorrectLength() {
		return correctLength;
	}

	public void setCorrectLength(double correctLength) {
		
		if (correctLength<=20) {
			this.correctLength = correctLength;
		} else {
			this.correctLength = 0.0;
		}

	}

	public double getContent() {
		return content;
	}

	public void setContent(double content) {
		
		if (content<=30) {
			this.content = content;
		} else {
			this.content = 0.0;
		}
		
	}
	
	public double getScore() {
		return grammer+spelling+correctLength+content;
	}

}
