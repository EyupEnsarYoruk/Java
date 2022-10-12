package metotlar;

public class Uygulama1 {

	public static void main(String[] args) {
		
		/*eriþim_belirleyici (static) dönüþ_tipi(veritipi parametre(ler)){
			
			Metot Gövdesi (Method Body)
		}*/
		
		//merhabaMetodu();
		
		merhabaMetodu("ali");
		
	}

	private static void merhabaMetodu(String isim) {
		
		System.out.println("Merhaba ben: "+ isim);
		
		//metotlarýn eriþim belirleyicileri: public, private, protected, default(package)
		//Static bir metotdan ancak static bir metot çaðrýlabilir
		//Main metotdan çaðrýlacak her metot staric olmak zorundadýr.
		//Çünkü main metodu static dir.
		
	}
	
	/*public static void merhabaMetodu() {
		
		System.out.println("Merhaba ben metot...");
	}*/ 

}
