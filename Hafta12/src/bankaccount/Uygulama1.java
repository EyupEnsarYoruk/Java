package bankaccount;

import java.text.DecimalFormat;

public class Uygulama1 {

	public static void main(String[] args) {
		
		  // Çýktýyý biçimlendirmek için bir Decimalformat nesnesi oluþturun.
	      DecimalFormat dollar = new DecimalFormat("#,##0.00");
	      
	      // 100 ABD dolarý bakiye, %3 faiz oraný ve 
	      // aylýk 2,50 ABD dolarý hizmet ücreti olan 
	      // bir SavingsAccount nesnesi oluþturun.
	      SavingsAccount savings = 
	                   new SavingsAccount(100.0, 0.03, 2.50);
	      
	      // Elimizde olaný göster.
	      System.out.println("Bakiye $" + 
	                         dollar.format(savings.getBalance()));
	      System.out.println("Mevduat (para yatýrma) sayýsý: " + 
	                         savings.getNumDeposits());
	      System.out.println("Para çekme sayýsý: " + 
	                         savings.getNumWithdrawals());
	      System.out.println();
	      
	      // Biraz para yatýrýn.
	      savings.deposit(25.00);
	      savings.deposit(10.00);
	      savings.deposit(35.00);
	      
	      // Elimizde olaný göster.
	      System.out.println("Bakiye $" + 
	                         dollar.format(savings.getBalance()));
	      System.out.println("Mevduat (para yatýrma) sayýsý: " + 
	                         savings.getNumDeposits());
	      System.out.println("Para çekme sayýsý: " + 
	                         savings.getNumWithdrawals());
	      System.out.println();
	      
	      // Birkaç çekme iþlemleri yapýn.
	      savings.withdraw(100.00);
	      savings.withdraw(50.00);
	      savings.withdraw(10.00);
	      savings.withdraw(1.00);
	      savings.withdraw(1.00);
	      
	      // Elimizde olaný göster.
	      System.out.println("Bakiye $" + 
	                         dollar.format(savings.getBalance()));
	      System.out.println("Mevduat (para yatýrma) sayýsý: " + 
	                         savings.getNumDeposits());
	      System.out.println("Para çekme sayýsý: " + 
	                         savings.getNumWithdrawals());
	      System.out.println();

	      // Aylýk iþlemleri yapýn.
	      savings.monthlyProcess();
	   
	      // Þimdiye kadar yaptýklarýmýzý gösterin.
	      System.out.println("Bakiye $" + 
                  dollar.format(savings.getBalance()));
	      System.out.println("Mevduat (para yatýrma) sayýsý: " + 
                  savings.getNumDeposits());
	      System.out.println("Para çekme sayýsý: " + 
                  savings.getNumWithdrawals());
	      System.out.println();		

	}
}
