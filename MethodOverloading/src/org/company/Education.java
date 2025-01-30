package org.company;

public class Education extends Arts {

	public void UG(String name) {
		System.out.println(name);
		
	}
	public void PG() {
		System.out.println("All Post Graduate Courses");
	}
	public static void main(String[]args) {
		Education e = new Education();
		e.UG("All Undergraduate Courses");
		e.PG();
	}
		
}
