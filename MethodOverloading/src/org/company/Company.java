package org.company;

public class Company {
	public void comp (String name) {
	 System.out.println(name);
	} 
	public void comp (int ID) {
		 System.out.println(ID);
		} 
	public void comp (char ClientName ) {
		 System.out.println(ClientName);
		} 
	public void comp (float  TotalEmployees) {
		 System.out.println(TotalEmployees);
		} 

	public static void main(String[]args) {
		Company n = new Company();
		n.comp("Accenture");
		n.comp(7643209);
		n.comp("UBS Bank");
		n.comp(10000);
		n.comp("TCS");
		n.comp(8736455);
		n.comp("CS Bank");
		n.comp(20000);
	}
}
