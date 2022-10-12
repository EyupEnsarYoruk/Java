package bankaccount;

public class SavingsAccount extends BankAccount {

	private boolean status;
	
	public SavingsAccount(double balance, double interestRate, double monthlyServiceCharges) {
		super(balance, interestRate, monthlyServiceCharges);
		
		if (balance<25.0) {
			status=false;
		} else {
			status=true;
		}
	
	}
	
	public void withdraw(double amount) {
		
		if (status) {	
			
			super.withdraw(amount);
			if (getBalance()<25) {
				status=false;
			}
		}
	}
	
	public void deposit(double amount) {
		
		super.deposit(amount);
		
		if (!status) {
			if (getBalance()>=25) {
				status=true;
			}
		}
	}
	
	public void monthlyProcess() {
		
		double msc; //aylýk servis ücreti
		
		
		if (getNumWithdrawals()>4) {
			
			msc=getMonthlyServiceCharges();
		
			setMonthlyServiceCharges(msc +(getNumWithdrawals()-4));
			
			super.monthlyProcess();

			setMonthlyServiceCharges(msc);
		} else {
			super.monthlyProcess();
		}
	}
}
