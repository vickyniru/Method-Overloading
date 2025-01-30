package org.override;

public class Parent {
	public void call() {
		System.out.println("Parent class is calling");
		
	}
public static void main(String[]args) {
	Parent p= new Parent();
	p.call();
}
}
