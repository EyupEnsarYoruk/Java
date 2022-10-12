package bankaccount;

public class BankAccount {
	
	private double balance; // bakiye
	private int numDeposits; // aylýk mevduat sayýsý (para yatýrma)
	private int numWithdrawals; // para çekme sayýsý
	private double interestRate; // yýllýk faiz oraný
	private double monthlyServiceCharges; // aylýk Servis ücreti
	
	public BankAccount(double balance, double interestRate, double monthlyServiceCharges) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
		this.monthlyServiceCharges = monthlyServiceCharges;
		numDeposits=0;
		numWithdrawals=0;
	}

	public void deposit(double amount) {
		
		balance += amount;
		numDeposits++;
	}
	
	public void withdraw(double amount) {
		
		balance -=amount;
		numWithdrawals++;
	}
	
	private void calcInterest() {
		
		double monIntRate= interestRate/12;
		
		double monInterest = balance*monIntRate;
		
		balance += monInterest;
		
	}
	
	public void monthlyProcess() {
		
		balance -= monthlyServiceCharges;
		
		calcInterest();
		
		numDeposits=0;
		numWithdrawals=0;
	}

	public double getMonthlyServiceCharges() {
		return monthlyServiceCharges;
	}

	public void setMonthlyServiceCharges(double monthlyServiceCharges) {
		this.monthlyServiceCharges = monthlyServiceCharges;
	}

	public double getBalance() {
		return balance;
	}

	public int getNumDeposits() {
		return numDeposits;
	}

	public int getNumWithdrawals() {
		return numWithdrawals;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
}
