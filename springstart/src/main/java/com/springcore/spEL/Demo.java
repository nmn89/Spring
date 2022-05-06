package com.springcore.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{11+44}")
	private int x;
	@Value("#{8>4?22:44}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(100)}")
	private double z;
	@Value("#{T(java.lang.Math).PI}")
	private double n;
	@Value("#{ new java.lang.String('Aakash Singh') }")
	private String name;
	@Value("#{8>3}")
	private boolean isActive;
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", n=" + n + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
}
