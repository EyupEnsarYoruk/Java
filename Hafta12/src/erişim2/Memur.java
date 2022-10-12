package eriþim2;

import eriþim1.Personel;

public class Memur extends Personel {

	public Memur(String adsoyad, double maaþ, int sicilno, int yaþ) {
		super(adsoyad, maaþ, sicilno, yaþ);
		
		//this.sicilno diyerek protected olan özelliðe ulaþabiliyoruz.
	}

}
