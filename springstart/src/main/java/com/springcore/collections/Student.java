package com.springcore.collections;

import java.util.*;

public class Student {
	private String name;
	private Map<String, String> marks;
	private List<String> sports;
	private Set<String> activities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, String> marks) {
		this.marks = marks;
	}

	public List<String> getSports() {
		return sports;
	}

	public void setSports(List<String> sports) {
		this.sports = sports;
	}

	public Set<String> getActivities() {
		return activities;
	}

	public void setActivities(Set<String> activities) {
		activities = activities;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, Map<String, String> marks, List<String> sports, Set<String> activities) {
		super();
		this.name = name;
		this.marks = marks;
		this.sports = sports;
		this.activities = activities;
	}

}

