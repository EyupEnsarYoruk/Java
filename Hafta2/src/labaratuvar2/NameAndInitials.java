package labaratuvar2;

public class NameAndInitials {

	public static void main(String[] args) {
		
		String firstName ="Herbert";
		String middleName="George";
		String lastName="Dorfmann";
		
		char firtInitial;
		char middleInitial;
		char lastInitial;
		
		firtInitial=firstName.charAt(0);
		middleInitial=middleName.charAt(0);
		lastInitial=lastName.charAt(0);
		
		System.out.println("Name: "+ firstName +
				           " "+middleName+ " "+
				            lastName);
		
		System.out.println("Initials: " + firtInitial +
							middleInitial + lastInitial);
		
	}
}
