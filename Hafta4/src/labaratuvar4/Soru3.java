package labaratuvar4;

import java.text.DecimalFormat;

public class Soru3 {

	public static void main(String[] args) {
		
		double fahrenheit, celsius;
		
		DecimalFormat fmt=new DecimalFormat(" 0.0");
		
		System.out.println("Celsius\t\tFahrenheit");
		System.out.println("--------------------------");
		
		for (celsius=0; celsius<=20; celsius++) {
			
			fahrenheit=(9.0/5.0)*celsius+32;
			System.out.println(fmt.format(celsius)+"\t\t"+fmt.format(fahrenheit));
		}
	}
}
