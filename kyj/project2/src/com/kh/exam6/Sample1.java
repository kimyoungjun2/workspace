package com.kh.exam6;

import java.util.Arrays;

public class Sample1 {

	public static void ex1() {
		Prac1 p = new Prac1();
		
		p.method1();	p.method1(true);	p.method1(10);
		p.method1(1.23);	p.method1("Hello");
		p.method1(10, 20, 30);
		
		int[] x = {1, 2, 3, 4};
		p.method1(x);
		System.out.println(Arrays.toString(x));
		
		p.method1(1.1, 2.1, 3.1, 4.1);
		
		MyData d1 = new MyData();
		d1.name = "홍길동";
		d1.num = 30;
		p.method1(d1);
		System.out.println(d1.num + " | " + d1.name);
	}
	
	public static void ex2() {
		Prac2 p = new Prac2();
		
		System.out.println(p.method1());
		
		int x1 = p.method1();
		System.out.println(x1);
		
		int x2 = p.method1(5);
		System.out.println(x2);
		
		System.out.println(p.method1() + p.method1(10));
		
		boolean b1 = p.method2();
		System.out.println(b1);
		
		boolean b2 = p.method2(10);
		System.out.println(b2);
		
		boolean b3 = p.method2(11);
		System.out.println(b3);
		
		int[] arr1 = p.method3(5);
		System.out.println(arr1 + " | " + Arrays.toString(arr1));
		
		int[] arr2 = p.method3(5, 3);
		System.out.println(arr2 + " | " + Arrays.toString(arr2));
		
		MyData2 data1 = p.method4();
		System.out.println(data1.name + " | " + data1.num);
		
		MyData2 data2 = p.method4("박찬호");
		System.out.println(data2.name + " | " + data2.num);
	}
	
	public static void main(String[] args) {
		ex2();
		// ex1();
	}

}
