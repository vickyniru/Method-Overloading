package org.company;

public class BankInfo {
	public void saving() {
		System.out. println("Monthly Saving");
		
	}
	public void fixed (int amt) {
		System.out. println(amt);
	}
	public void deposit(String name) {
		System.out. println(name);
	}
	public static void main(String[]args) {
		BankInfo b =new BankInfo();
		b.saving();
		b.fixed(6738273);
		b.deposit("Full Deposit");
		
	}
}
