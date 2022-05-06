package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Person {
	@Value("Aakash Singh")
	private String name;
	@Value("Male")
	private String gender;
	@Value("#{add}")
	private List<String> city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getCity() {
		return city;
	}
	public void setCity(List<String> city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", city=" + city + "]";
	}
	
	
}
