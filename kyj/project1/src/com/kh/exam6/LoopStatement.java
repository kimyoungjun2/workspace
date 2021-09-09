package com.kh.exam6;

public class LoopStatement {

	public static void sample1() {
		// 기본 반복
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + " 번째 반복");
		}
		// System.out.println(i);
	}
	
	public static void sample2() {
		// 거꾸로 반복
		for(int i = 5; i >= 1; i--) {
			System.out.println(i + " 번째 반복");
		}
	}
	
	public static void sample3() {
		// 초기식의 위치를 For 문 밖에 배치
		int i = 1;
		
		// 초기식 생략
		for(; i <= 5; i++) {
			System.out.println(i + " 번째 반복");
		}
		System.out.println(i);
	}
	
	public static void sample4() {
		// 증감식 생략
		for(int i = 1; i <= 5;) {
			i++;	// 여기에 증감식을 넣음
			System.out.println(i + " 번째 반복");
		}
	}
	
	public static void sample5() {
		// 조건식 생략
		for(int i = 1;;i++) {
			System.out.println(i + " 번째 반복");
			if(i >= 5) {
				break;	// for 반복을 중단
			}
		}
	}
	
	public static void sample6() {
		for(;;) {
			System.out.println("의도된 무한 반복");
		}
	}
	
	public static void sample7() {
		for(int i = 1; i <= 20; i += 2) {
			System.out.println(i + " 입니다.");
		}
	}
	
	public static void main(String[] args) {
		// sample1();
		// sample2();
		// sample3();
		// sample4();
		// sample5();
		// sample6();
		sample7();
	}

}
