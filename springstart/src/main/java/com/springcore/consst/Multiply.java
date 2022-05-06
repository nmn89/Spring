package com.springcore.consst;

public class Multiply {
	private int a;
	private int b;
	public Multiply(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("int, int");
	}
	public Multiply(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("double, double");
	} 
	public void Mul() {
		System.out.println("Multiply is: " +(this.a*this.b));
	}
}
