package labaratuvar7;

public class Soru2 {

	public static void main(String[] args)
	   {
	      // Create the first employee. Use the
	      // no-arg constructor.
	      Employee employee1 = new Employee();
	      employee1.setName("Susan Meyers");
	      employee1.setIdNumber(47899);
	      employee1.setDepartment("Accounting");
	      employee1.setPosition("Vice President");
	      
	      // Create the second employee. Use the
	      // constructor that accepts arguments for
	      // all  of the fields.
	      Employee employee2 = new Employee("Mark Jones", 39119,
	                                        "IT", "Programmer");

	      // Create the third employee. Use the constructor
	      // that accepts the name and ID number.
	      Employee employee3 = new Employee("Joy Rogers", 81774);
	      employee3.setDepartment("Manufacturing");
	      employee3.setPosition("Engineer");
	   
	      // Display the data for employee 1.
	      System.out.println("Employee #1");
	      System.out.println("Name: " + employee1.getName());
	      System.out.println("ID Number: " + employee1.getIdNumber());
	      System.out.println("Department: " + employee1.getDepartment());
	      System.out.println("Position: " + employee1.getPosition());
	      System.out.println();
	      
	      // Display the data for employee 2.
	      System.out.println("Employee #2");
	      System.out.println("Name: " + employee2.getName());
	      System.out.println("ID Number: " + employee2.getIdNumber());
	      System.out.println("Department: " + employee2.getDepartment());
	      System.out.println("Position: " + employee2.getPosition());
	      System.out.println();
	      
	      // Display the data for employee 3.
	      System.out.println("Employee #3");
	      System.out.println("Name: " + employee3.getName());
	      System.out.println("ID Number: " + employee3.getIdNumber());
	      System.out.println("Department: " + employee3.getDepartment());
	      System.out.println("Position: " + employee3.getPosition());
	      System.out.println();
	   }

}
