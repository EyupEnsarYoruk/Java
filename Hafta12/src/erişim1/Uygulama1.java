package eriþim1;

public class Uygulama1 {

	public static void main(String[] args) {
		
		//Paket içi eriþim
		
		Personel personel1=new Personel("Murat Kazanç", 7000, 100, 35);
		
		//public --> Yeþil
		//protected --> Sarý
		//default --> Mavi
		//Private --> Kýrmýzý
		//personel1 nesnesi public, protected ve default eriþime sahip
		//özelliklere eriþebilir, fakat private olan maaþ özelliðine eriþemez.
		
		System.out.println(personel1.toString());
		
	}
}
