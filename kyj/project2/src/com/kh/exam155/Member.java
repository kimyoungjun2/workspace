package com.kh.exam155;

import java.util.*;

public class Member {
	private int num;
	private List<Member> Valuess;
	private String name;
	private int age;
	private char gender;
	private String email;
	//private Date joinDate;
	
	public Member() {}
	
	public Member(int num, String name, int age, char gender, String email) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		//this.joinDate = joinDate;
	}
	
	public void setValue(ArrayList<Valuess> num, String name, int age, char gender, String email) {
		if(num == null) {
			num = new ArrayList<Valuess>();
		}
		this.Valuess.add(new Valuess);
	}
}

class Valuess{
	private int num;
	private List<Member> Valuess;
	private String name;
	private int age;
	private char gender;
	private String email;
	
	public Valuess(int num, String name, int age, char gender, String email) {
		this.num = num;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", age=" + age + ", gender=" + gender + ", email=" + email
				+ "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Member other = (Member) obj;
//		return Objects.equals(name, other.name);		
//	}	
}
