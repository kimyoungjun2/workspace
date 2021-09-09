package com.kh.exam155;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Car {	
	private final String name;

	public Car(String name) {
		this.name = name;
		} // intellij Generate 기능 사용

	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(name, other.name);
	}


	
public static void main(String[] args){	
	Car car1 = new Car("foo");
	Car car2 = new Car("foo");
	System.out.println(car1.equals(car2));
	
	}
}