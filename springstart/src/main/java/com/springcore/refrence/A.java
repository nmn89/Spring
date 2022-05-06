package com.springcore.refrence;

public class A {
	private int m;
	private B obj;
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "A [m=" + m + ", obj=" + obj + "]";
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A(int m, B obj) {
		super();
		this.m = m;
		this.obj = obj;
	}
	
}
