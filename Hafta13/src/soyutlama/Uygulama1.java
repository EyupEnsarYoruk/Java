package soyutlama;

public class Uygulama1 {

	public static void main(String[] args) {
		
		CepTelefonu ceptelefonu=new CepTelefonu("Android");
		Masaüstü masaüstü=new Masaüstü("Windows");
		Latop laptop=new Latop("Linux");
		
		ceptelefonu.interneteBaðlan();
		masaüstü.interneteBaðlan();
		laptop.interneteBaðlan();
		

	}

}
