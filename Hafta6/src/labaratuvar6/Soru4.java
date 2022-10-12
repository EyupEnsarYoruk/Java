package labaratuvar6;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args)
	   {
	      String input;        // Klavye giriþini tutmak için
	      double speed;        // aracýn hýzý
	      int maxHours;        // Seyahat edilen maksimum saat sayýsý
	      int period;          // Zaman dilimlerini saymak için
	             
	      // Klavye giriþi için bir Tarayýcý nesnesi oluþturun.
	      Scanner keyboard = new Scanner(System.in);

	      // Hýzý al.
	      System.out.print("Aracýn hýzýný girin: ");
	      speed = keyboard.nextDouble();
	      
	      // Hýzý doðrulayýn.
	      while (speed < 0)
	      {
	         System.out.print("Hýz için 0 veya daha büyük girin: ");
	         speed = keyboard.nextDouble();
	      }
	      
	      // Get the number of hours.
	      System.out.print("Aracýn hareket halinde olduðu saat sayýsýný girin: ");
	      maxHours = keyboard.nextInt();

	      // Saatleri doðrulayýn.
	      while (maxHours < 1)
	      {
	         System.out.print("Saatler için 1 veya daha büyük girin: ");
	         maxHours = keyboard.nextInt();

	      }
	      
	      // Tablo baþlýðýný görüntüleyin.
	      System.out.println("Saat\tMesafe Gezilen mesafe");
	      System.out.println("----------------------------------");
	      
	      // Mesafe tablosunu görüntüleyin.
	      period = 1;
	      while (period <= maxHours)
	      {
	         // Bu süre için mesafeyi görüntüleyin.
	         System.out.println(period + "\t\t" + distance(speed, period));
	         
	         // Zaman periyodunu artýr
	         period++;
	      }
	   }
	   
	   /**
	      Mesafe metodu, bir aracýn kat ettiði mesafeyi, 
	      hýzýyla kat ettiði süreyi çarparak hesaplar.
	      @param speed Aracýn hýzý.
	      @param time Aracýn seyahat ettiði süre.
	      @return Aracýn kat ettiði mesafe.
	   */
	   
	   public static double distance(double speed, double time)
	   {
	      return speed * time;
	   }
}
