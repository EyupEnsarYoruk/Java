package çoklukalýtým;

public class CepTelefonu extends FotoðrafMakinesi implements Bilgisayar, VideoOynatýcý, HesapMakinesi {

	@Override
	public void hesapla() {
		
		System.out.println("Cep telefonu hesaplama yaptý...");

	}

	@Override
	public void videoOynat() {
		
		System.out.println("Cep telefonu video oynattý...");

	}

	@Override
	public void oyunOyna() {
		
		System.out.println("Cep telefonu ile oyun oynandý...");

	}

	@Override
	public void interneteBaðlan() {
		
		System.out.println("Cep telefonu ile internete baðlandý...");

	}

	@Override
	public void fotoKaydet() {
		
		System.out.println("Cep telefonu fotoðrafý kaydetti...");
		
	}

}
