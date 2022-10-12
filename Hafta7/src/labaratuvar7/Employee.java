package labaratuvar7;

public class Employee {
	
	   // Alanlar
	   private String name;       // Çalýþanýn ismi
	   private int idNumber;      // kimlik Numarasý
	   private String department; // çalýþan departmaný
	   private String position;   // Ýþ ismi
	   
	   /*
	      Bu yapýcý, ad, departman ve konum alanlarýný boþ 
	      bir dizeyle ve idNum alanýný 0 ile baþlatýr.
	   */
	   
	   public Employee()
	   {
	      name = "";
	      idNumber = 0;
	      department = "";
	      position = "";
	   }

	   /**
	      Bu yapýcý, ad, idNum departmaný ve konum alanlarýný baþlatýr.
	      @param n Çalýþanýn adý.
	      @param id Çalýþanýn kimlik numarasý.
	      @param dept Çalýþanýn bölümü.
	      @param pos Çalýþanýn konumu.
	   */
	   
	   public Employee(String n, int id,
	                   String dept, String pos)
	   {
	      name = n;
	      idNumber = id;
	      department = dept;
	      position = pos;
	   }

	   /**
	      Bu yapýcý, ad ve idNum alanlarýný baþlatýr.
          Departman ve pozisyon alanlarý boþ bir dize ile baþlatýlýr.
	      @param n Çalýþanýn adý.
	      @param id Çalýþanýn kimlik numarasý.
	   */
	   
	   public Employee(String n, int id)
	   {
	      name = n;
	      idNumber = id;
	      department = "";
	      position = "";
	   }

	   /**
	      setName metodu, ad alanýnda depolanan 
	      bir baðýmsýz deðiþkeni kabul eder.
	      @param n Çalýþanýn adý.
	   */

	   public void setName(String n)
	   {
	      name = n;
	   }

	   /**
	      The setIdNumber method accepts an argument
	      which is stored in the idNumber field.
	      @param num The employee's ID number.
	   */

	   public void setIdNumber(int num)
	   {
	      idNumber = num;
	   }  

	   /**
	      The setDepartment method accepts an argument
	      which is stored in the department field.
	      @param d The employee's department.
	   */

	   public void setDepartment(String d)
	   {
	      department = d;
	   }
	   
	   /**
	      The setPosition method accepts an argument
	      which is stored in the position field
	      @param p The employee's position.
	   */

	   public void setPosition(String p)
	   {
	      position = p;
	   }
	   
	   /**
	      The getName method returns the value in
	      the name field.
	      @return the employee's name.
	   */

	   public String getName()
	   {
	      return name;
	   }

	   /**
	      The getIdNumber method returns the value in
	      the idNumber field.
	      @return The employee's ID number.
	   */

	   public int getIdNumber()
	   {
	      return idNumber;
	   }

	   /**
	      The getDepartment method returns the value in
	      the department field.
	      @return The employee's department.
	   */

	   public String getDepartment()
	   {
	      return department;
	   }
	   
	   /**
	      The getPosition method returns the value in
	      the position field.
	      @return The employee's position.
	   */

	   public String getPosition()
	   {
	      return position;
	   }   
}
