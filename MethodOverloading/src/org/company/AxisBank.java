package org.company;

public class AxisBank extends BankInfo{
	
	public void fixed (int amount) {
		System.out. println(amount);
	}
	public void deposit(String name) {
		System.out. println(name);
	}
	public static void main(String[]args) {
		AxisBank b = new AxisBank();
		b.fixed(688687);
		b.deposit("Partial deposit");
		b.saving();
	}
}
