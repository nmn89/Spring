package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Tuition {
	private List<String> Subjects;
	private Map<String, Integer> Fees;
	private Properties property;
	
	public List<String> getSubjects() {
		return Subjects;
	}
	public void setSubjects(List<String> subjects) {
		Subjects = subjects;
	}
	public Map<String, Integer> getFees() {
		return Fees;
	}
	public void setFees(Map<String, Integer> fees) {
		Fees = fees;
	}
	public Properties getProperty() {
		return property;
	}
	public void setProperty(Properties property) {
		this.property = property;
	}
	@Override
	public String toString() {
		return "Tuition [Subjects=" + Subjects + ", Fees=" + Fees + ", property=" + property + "]";
	}
	
}
