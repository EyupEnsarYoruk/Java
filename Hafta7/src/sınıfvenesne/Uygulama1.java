package sýnýfvenesne;

import java.awt.Color;

public class Uygulama1 {

	public static void main(String[] args) {
		
		Top top1=new Top(); //Parametre almayan yapýlandýrýcý Default Constructor
		
		Top top2=new Top(25,10, Color.yellow, "Plastik");

		top1.hammadde="Deri";
		top1.çap=30;
		top1.elastikiyet=5;
		top1.renk=Color.red;
		
		/*System.out.println("Topun çapý:"+top1.çap);
		System.out.println("Topun elastikiyet katsayýsý:"+top1.elastikiyet);
		System.out.println("Topun rengi:"+top1.renk);
		System.out.println("Topun hammaddesi:"+top1.hammadde);*/
		
		System.out.println(top1.toString());
		System.out.println("-----------------------------");
		System.out.println(top2.toString());
		
		top1.zýpla();
		top1.zýpla(5);
		top1.yuvarlan();
	}
}
