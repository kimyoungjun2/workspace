package com.kh.exam7;

import java.util.Arrays;

public class ArrayData {

	public static void sample1() {
		// 배열 생성
		int[] iArr = new int[5];
		
		System.out.println(iArr[0]);
		System.out.println(iArr[1]);
		System.out.println(iArr[2]);
		System.out.println(iArr[3]);
		System.out.println(iArr[4]);
	}
	
	public static void sample2() {
		int[] iArr = new int[5];
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}
	
	public static void sample3() {
		// 선언과 동시에 초기화.
		// int[] iArr = {1, 2, 3, 4, 5};
		int[] iArr = new int[] {1, 2, 3, 4, 5};
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}
	
	public static void sample4() {
		// 선언 후 초기화
		int[] iArr = new int[5];
		
		// 반복문을 사용하여 초기화.
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
		}
		
		// 결과 출력
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}
	
	public static void sample5() {
		boolean[] boolArr = new boolean[] {true, false, true, true};
		byte[] bArr = {1, 2, 3, 4};
		char[] cArr = {'a', 'b', 'c', 'd'};
		double[] dArr = new double[] {1.0, 2.0, 3.0};
		String[] sArr = new String[] {"hello", "hi", "안녕하세요"};
		
		// 결과 출력
		for(int i = 0; i < boolArr.length; i++) {
			System.out.print(i + ":" + boolArr[i] + " ");
		}
		
		System.out.println();
		
		// 결과 출력
		for(int i = 0; i < bArr.length; i++) {
			System.out.print(i + ":" + bArr[i] + " ");
		}
		
		System.out.println();
		
		// 결과 출력
		for(int i = 0; i < cArr.length; i++) {
			System.out.print(i + ":" + cArr[i] + " ");
		}
		
		System.out.println();
		
		// 결과 출력
		for(int i = 0; i < dArr.length; i++) {
			System.out.print(i + ":" + dArr[i] + " ");
		}
		
		System.out.println();
		
		// 결과 출력
		for(int i = 0; i < sArr.length; i++) {
			System.out.print(i + ":" + sArr[i] + " ");
		}
	}
	
	public static void sample6() {
		int x1 = 10;
		int x2 = x1;
		System.out.println("x1:" + x1 + "|x2:" + x2);
		
		x2 = 15;
		System.out.println("x1:" + x1 + "|x2:" + x2);
		
		// 얕은 배열 복사 : 배열의 참조 주소를 복사.
		int[] iArr1 = new int[] {1, 2, 3, 4};
		int[] iArr2 = iArr1;
		for(int i = 0; i < iArr1.length; i++) {
			System.out.println("iArr1[" + i + "]:" + iArr1[i] + "|iArr2[" + i + "]:" + iArr2[i]);
		}
		
		iArr2[2] = 45;
		for(int i = 0; i < iArr1.length; i++) {
			System.out.println("iArr1[" + i + "]:" + iArr1[i] + "|iArr2[" + i + "]:" + iArr2[i]);
		}
	}
	
	public static void sample7() {
		// 깊은 배열 복사 : 배열의 실제 데이터를 복사
		int[] iArr1 = new int[] {1, 2, 3, 4};
		int[] iArr2 = new int[iArr1.length];
		
		for(int i = 0; i < iArr1.length; i++) {
			iArr2[i] = iArr1[i];
		}
		
		for(int i = 0; i < iArr1.length; i++) {
			System.out.println("iArr1[" + i + "]:" + iArr1[i] + "|iArr2[" + i + "]:" + iArr2[i]);
		}
		
		iArr2[2] = 45;
		for(int i = 0; i < iArr1.length; i++) {
			System.out.println("iArr1[" + i + "]:" + iArr1[i] + "|iArr2[" + i + "]:" + iArr2[i]);
		}
	}
	
	public static void sample8() {
		int[] iArr1 = new int[] {1, 2, 3, 4};
		int[] iArr2 = new int[iArr1.length + 1];
		
		System.out.println("-----배열의 크기를 늘리기 전-----");
		for(int i = 0; i < iArr1.length; i++) {
			System.out.println("iArr1[" + i + "]:" + iArr1[i]);
		}
		
		for(int i = 0; i < iArr1.length; i++) {
			iArr2[i] = iArr1[i];
		}
		
		iArr1 = iArr2;
		
		iArr1[iArr1.length - 1] = 5;
		
		System.out.println("-----배열의 크기를 늘린 후-----");
		for(int i = 0; i < iArr1.length; i++) {
			System.out.println("iArr1[" + i + "]:" + iArr1[i]);
		}
	}
	
	public static void sample9() {
		int[] iArr1 = new int[] {1, 2, 3, 4};
		int[] iArr2 = new int[iArr1.length + 1];
		
		System.out.println("-----배열의 크기를 늘리기 전-----");
		System.out.println(Arrays.toString(iArr1));
//		for(int i = 0; i < iArr1.length; i++) {
//			System.out.println("iArr1[" + i + "]:" + iArr1[i]);
//		}
		
		//               원본,   원본시작위치, 복사본,  복사본시작위치, 복사할데이터길이-1
		System.arraycopy(iArr1, 0,        iArr2, 0,         iArr1.length);
//		for(int i = 0; i < iArr1.length; i++) {
//			iArr2[i] = iArr1[i];
//		}
		
		iArr1 = iArr2;
		
		iArr1[iArr1.length - 1] = 5;
		
		System.out.println("-----배열의 크기를 늘린 후-----");
		System.out.println(Arrays.toString(iArr1));
//		for(int i = 0; i < iArr1.length; i++) {
//			System.out.println("iArr1[" + i + "]:" + iArr1[i]);
//		}
	}
	
	public static void main(String[] args) {
		sample9();
		// sample8();
		// sample7();
		// sample6();
		// sample5();
		// sample4();
		// sample3();
		// sample2();
		// sample1();
	}

}
