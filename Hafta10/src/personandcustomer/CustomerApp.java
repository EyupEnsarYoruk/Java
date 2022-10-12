package personandcustomer;

public class CustomerApp {

	public static void main(String[] args) {
		
		Customer myCustomer=new Customer("julie james", "123 main street", 
				"555-1212", "147-A049", true);
		
		System.out.println("Adý: " + myCustomer.getName());
		System.out.println("Adresi: "+ myCustomer.getAddress());
		System.out.println("Telefonu: "+ myCustomer.getPhone());
		System.out.println("Müþteri Numarasý: " + myCustomer.getCustomerNumber());
		
		if (myCustomer.isMailingList()) {
			System.out.println("Posta Listesi: Evet");
		} else {
			System.out.println("Posta Listesi: Hayýr");
		}

	}

}
