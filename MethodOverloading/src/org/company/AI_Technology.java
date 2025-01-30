package org.company;

public class AI_Technology {
	public void Tech (String name) {
		 System.out.println(name);
	}
	public void Tech (int order) {
		 System.out.println(order);
	}
	public void Tech (char type) {
		 System.out.println(type);
	}
	public void Tech (float number) {
		 System.out.println(number);
	}
	public void Tech () {
		 System.out.println();
	}
	public static void main(String[]args) {
		AI_Technology a = new AI_Technology();
		a.Tech("AI Technololgy");
		a.Tech(150);
		a.Tech("Complete Package");
		a.Tech(876543.23f);
		a.Tech("Wrong Technology");
		a.Tech("GA Technololgy");
		a.Tech(234);
		a.Tech("Partial Package");
		a.Tech(98368.23f);
		a.Tech("Right Technology");
	}
}
