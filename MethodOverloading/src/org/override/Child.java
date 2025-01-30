package org.override;

public class Child extends Parent {
	public void call() {
		System.out.println("Child class is calling");
		
	}
	public void Meth() {
		System.out.println("A method in Child class");
	}
public static void main(String[]args) {
	Child c= new Child();
	Parent p = new Parent();
    c.call();
    c.Meth();
    p.call();
    
    
}
}

