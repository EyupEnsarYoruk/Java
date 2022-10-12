package sahiplik;

public class Adres {
	
	String il, ilçe, mahalle;
	int kapýno;
	
	public Adres(String il, String ilçe, String mahalle, int kapýno) {
		super();
		this.il = il;
		this.ilçe = ilçe;
		this.mahalle = mahalle;
		this.kapýno = kapýno;
	}

	@Override
	public String toString() {
		return "Adres [il=" + il + ", ilçe=" + ilçe + 
				", mahalle=" + mahalle + ", kapýno=" + kapýno + "]";
	}
}
