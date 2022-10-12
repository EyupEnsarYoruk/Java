package labaratuvar13;

public class Kepçe extends Araç implements ÝþMakinesi {

	public Kepçe(String plaka, int motorserino) {
		super(plaka, motorserino);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void çalýþ(int saat) {
		
		System.out.println("Kepçe iþ makinesi "+ saat+ " saat çalýþtý...");

	}

	@Override
	public void ilerle() {
		// TODO Auto-generated method stub

	}

	@Override
	public void geriGit() {
		
		System.out.println("Kepçe geri gitti...");

	}

	@Override
	public void dur() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ilerle(int km) {
		// TODO Auto-generated method stub

	}

}
