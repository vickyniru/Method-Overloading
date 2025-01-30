package org.univ;

public class University extends Class{
	public void UG(String name) {
		System.out.println(name);
		
	}
	  
	public void PG() {
		System.out.println("Postgraduate coures in Anna University");
		
	}
	  public static void main(String[]args) {
		  University u = new University();
		  u.UG();
		  u.PG();
		  u.UG("Undergraduate in Anna University");
		
	  }

}
