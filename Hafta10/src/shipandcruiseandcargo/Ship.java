package shipandcruiseandcargo;

public class Ship {
	
	private String name;
	private String yearBuilt;
	
	public Ship(String name, String yearBuilt) {
		super();
		this.name = name;
		this.yearBuilt = yearBuilt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	@Override
	public String toString() {
		return "Gemi [adý=" + name + ", Üretim Yýlý =" + yearBuilt + "]";
	}
	

}
