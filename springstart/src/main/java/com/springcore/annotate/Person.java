package com.springcore.annotate;

public class Person {
	Info info = new Info();
	
	public Person(Info info) {
		super();
		this.info = info;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public void per() {
		info.value();
		System.out.println("I don't have my info");
	}
	
}
