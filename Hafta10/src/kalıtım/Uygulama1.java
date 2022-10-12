package kalýtým;

import java.awt.Color;

public class Uygulama1 {

	public static void main(String[] args) {
		
		Top top=new Top("Deri", 30, Color.red, 5);
		FutbolTopu futboltopu=new FutbolTopu("Deri", 20, Color.white, 3);
		BasketbolTopu basketboltopu=new BasketbolTopu("Plastik", 25, Color.ORANGE, 2);
		
		System.out.println(top.toString());
		System.out.println(futboltopu.toString());
		System.out.println(basketboltopu.toString());
		
		System.out.println("----------------------------");
		futboltopu.yuvarlan();
		futboltopu.zýpla();
		futboltopu.gol();
		
		System.out.println("----------------------------");
		
		basketboltopu.yuvarlan();
		basketboltopu.zýpla();
		basketboltopu.basket();
	}

}
