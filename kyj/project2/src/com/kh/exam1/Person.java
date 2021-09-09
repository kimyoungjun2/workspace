package com.kh.exam1;

 class Person {
	static String pNo = "111";
	String name;
	private char gender;
	private String address;
	private String phone;
	private int age;
	
	public Person() {}
	public Person(int x) {}
	public Person(double x) {}
	public Person(int x, int y) {}
	public Person(int x, double y) {}
	
	public String getName() {
		System.out.println("this -> " + this);
		return this.name;
	}
	
}
