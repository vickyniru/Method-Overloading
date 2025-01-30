package org.phone;

public class Phone {
	public void phn (String name) {
		 System.out.println(name);
	}
	public void phn (int pieces) {
		 System.out.println(pieces);
}
	public void phn (char OS) {
		 System.out.println(OS);
	}
	public void phn (float memory) {
		 System.out.println(memory);
		 
}
	public void phn () {
		 System.out.println();
	}
	
	public static void main(String[]args) {
		Phone p = new Phone();
		p.phn("I-Phone");
		p.phn(10);
		p.phn("IOS");
		p.phn(128);
		p.phn("64 GB");
		p.phn("Samsung");
		p.phn(20);
		p.phn("Android");
		p.phn(32);
		p.phn("128 GB");
		
		
	}
	
	}
