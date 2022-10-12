package shipandcruiseandcargo;

public class ShipApp {

	public static void main(String[] args) {
		
		final int NUM_SHIPS=3;
		
		Ship[] ships=new Ship[NUM_SHIPS];
		
		ships[0]=new Ship("Lolipop", "1960");
		ships[1]=new CruiseShip("Disney Magic", "1998", 2400);
		ships[2]=new CargoShip("Black Pearl", "1800", 50000);
		
		for (int i = 0; i < ships.length; i++) {
			
			System.out.println(ships[i]);
			System.out.println("--------------------");
		}
		
	}
}
