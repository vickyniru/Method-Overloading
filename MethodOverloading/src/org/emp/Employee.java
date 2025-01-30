package org.emp;

public class Employee {

	public void emp (String name) {
	     System.out.println(name);
   }
	public void emp (int ID) {
	     System.out.println(ID);
	}
	public void emp (char Dept) {
	     System.out.println(Dept);
	}
	public void emp(float salary) {
	    System.out.println(salary);
	     
}
	
    public static void main(String[]args) {
    	Employee e = new Employee();

    	e.emp("Niranjana");
    	e.emp(7635421);
    	e.emp("IT");
  
    	e.emp(654321.56f);
    	
    	e.emp("Vignesh");
      	e.emp(98635421);
    	e.emp("Sap Technololgy");
    	e.emp(1654321.56f);
    	e.emp("Akshatha");
    	e.emp("Mirudhu");
    	
    	
    }
}
