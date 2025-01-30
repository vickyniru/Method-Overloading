package org.company;

public class Arts {
	public void bsc() {
		System.out.println("Bachelor of Science ");
		
	}
	public void bEd(String name) {
		System.out.println(name);
		
	}
	public void ba() {
		System.out.println("Bachelor of Arts ");
		
	}
	public void bba() {
		System.out.println("Bachelor of Business Arts ");
		
	}
	public void UG() {
		System.out.println("Under Graduate ");
		
	}
	public void PG() {
		System.out.println("Post Graduate ");
		
	}
	public static void main(String[]args) {
      Arts a = new Arts();
      a.bsc();
      a.bEd("Bachelor of Education");
      a.ba();
      a.bba();
      a.UG();
      a.PG();
	}
}
