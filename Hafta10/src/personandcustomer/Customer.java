package personandcustomer;

public class Customer extends Person {

	private String customerNumber;
	private boolean mailingList;
	
	public Customer() {
		super();
		customerNumber="";
		mailingList=false;
	}

	public Customer(String name, String address, String phone, 
			String customerNumber, boolean mailingList) {
		super(name, address, phone);
		this.customerNumber=customerNumber;
		this.mailingList=mailingList;
		
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public boolean isMailingList() {
		return mailingList;
	}

	public void setMailingList(boolean mailingList) {
		this.mailingList = mailingList;
	}

}
