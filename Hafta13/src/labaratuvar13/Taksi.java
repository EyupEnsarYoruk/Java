package labaratuvar13;

public class Taksi extends Araç {

	public Taksi(String plaka, int motorserino) {
		super(plaka, motorserino);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ilerle() {
		
		System.out.println("Taksi ilerledi...");

	}

	@Override
	public void geriGit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dur() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ilerle(int km) {
		
		System.out.println("Taksi "+ km+ " km kadar yol aldý...");

	}

}
