package shipandcruiseandcargo;

public class CruiseShip extends Ship {
	
	private int passengers;

	public CruiseShip(String name, String yearBuilt,int passengers) {
		super(name, yearBuilt);
		this.passengers=passengers;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "Yolcu Gemisi [Maksimum Yolcu Kapasitesi=" + passengers + 
				", Geminin Adı=" + getName() + "]";
	}

}
