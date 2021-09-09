package com.kh.exam3;

class Other {
	int x;
	int y;
	
	public Other() {}
	
	public Other(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class SampleClass {

	public static void main(String[] args) {
		Other oth1 = new Other(10, 20);
		
		System.out.println(oth1.x);
		System.out.println(oth1.y);
		
		Other oth2 = new Other();
		System.out.println(oth2.x);
		System.out.println(oth2.y);
	}

}
