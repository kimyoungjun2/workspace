package com.kh.exam6;

import java.util.Scanner;

public class PracWHILE {

	static Scanner sc = new Scanner(System.in);
	
	public static void ex1() {
		/*
		 * 아스키 코드를 활용하여 영문자 소문자를 출력하시오.
		 * 
		 * a, b, c, d, e, f, g ... x, y, z
		 */
		System.out.println("for 문으로 출력함!");
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
			if(c == 'z') {
				System.out.print("");
			} else {
				System.out.print(", ");
			}
		}
		
		System.out.println("\nwhile 문으로 출력함!");
		char c = 'a';
		while(c <= 'z') {
			System.out.print(c);
			if(c == 'z') {
				System.out.print("");
			} else {
				System.out.print(", ");
			}
			c++;
		}
		
		System.out.println("\nDo~While 문으로 출력함!");
		c = 'a';
		do {
			System.out.print(c);
			if(c == 'z') {
				System.out.print("");
			} else {
				System.out.print(", ");
			}
			c++;
		} while(c <= 'z');
	}
	
	public static void ex2() {
		/*
		 * 아스키 코드를 활용하여 영문자 대문자를 출력하시오.
		 * (단, 역순으로 출력한다.)
		 * 
		 * Z, Y, X, ... D, C, B, A
		 */
		System.out.println("for 반복문 사용!");
		for(char c = 'Z'; c >= 'A'; c--) {
			System.out.print(c);
			if(c == 'A') {
				System.out.print("");
			} else {
				System.out.print(", ");
			}
		}
		
		System.out.println("\nwhile 반복문 사용!");
		char c = 'Z';
		while(c >= 'A') {
			System.out.print(c);
			if(c == 'A') {
				System.out.print("");
			} else {
				System.out.print(", ");
			}
			c--;
		}
	}
	
	public static void ex3() {
		/*
		 * ex1() 문제와 같이 출력을 한다.
		 * 단, 한 줄에 영문자 소문자가 5개씩 출력이 되도록 한다.
		 * 
		 * a, b, c, d, e
		 * f, g, h, i, j
		 * ...
		 */
		System.out.println("for 문으로 출력함!");
		int cnt = 0;
		char c;
		for(c = 'a'; c < 'z'; c++) {
			System.out.print(c);
			cnt += 1;
			if(cnt == 5) {
				System.out.print("\n");
				cnt = 0;
			} else {
				System.out.print(", ");
			}
		}
		System.out.print(c);
		
		System.out.println("\nwhile 문으로 출력함!");
		cnt = 0;
		c = 'a';
		while(c < 'z') {
			System.out.print(c);
			cnt += 1;
			if(cnt == 5) {
				System.out.print("\n");
				cnt = 0;
			} else {
				System.out.print(", ");
			}
			c++;
		}
		System.out.print(c);
		
	}
	
	public static void ex4() {
		/*
		 * ex3() 문제와 같이 출력을 한다.
		 * 단, 중첩반복문을 사용하여 출력을 하도록 한다.
		 */
		System.out.println("for 중첩 반복문으로 출력함!");
		char code = 'a' - 1;
		boolean stop = false;	// flag(깃발)
		for(;;) {
			for(int i = 1; i <= 5; i++) {
				code++;
				System.out.print(code);
				// 문자가 'z' 면 stop 변수의 값을 true 변경
				stop = code == 'z' ? true : false;
				if(stop) { break; }
				if(i != 5) {
					System.out.print(", ");
				}
			}
			if(stop) { break; }
			System.out.print("\n");
		}
		
		System.out.println("\nwhile 중첩 반복문으로 출력함!");
		code = 'a' - 1;
		stop = false;	// flag(깃발)
		while(true) {
			int i = 1;
			while(i <= 5) {
				code++;
				System.out.print(code);
				// 문자가 'z' 면 stop 변수의 값을 true 변경
				stop = code == 'z' ? true : false;
				if(stop) { break; }
				if(i != 5) {
					System.out.print(", ");
				}
				i++;
			}
			if(stop) { break; }
			System.out.print("\n");
		}
	}
	
	public static void ex5() {
		/*
		 * 사용자가 입력한 정수값 범위에 해당하는 값만 출력하시오.
		 * 
		 * 예)
		 * 		최소값 : 11
		 * 		최대값 : 99
		 * 		열 수 : 10
		 * 
		 * 		11	12	13	14	15	16	17	18	19	20
		 * 		21	22	23	24	25	26	27	28	29	30
		 * 		...
		 * 		...
		 * 		91	92	93	94	95	96	97	98	99	
		 */
		int min, max, row;
		
		System.out.print("최소값 : ");
		min = sc.nextInt();	sc.nextLine();
		
		System.out.print("최대값 : ");
		max = sc.nextInt();	sc.nextLine();
		
		System.out.print("열 수 : ");
		row = sc.nextInt();	sc.nextLine();
		
		int cnt = 0;
		for(int i = min; i <= max; i++) {
			System.out.print(i);
			cnt += 1;
			
			if(cnt % 10 == 0) {
				System.out.print("\n");
				// cnt = 0;
			} else {
				System.out.print("\t");
			}
		}
		
		System.out.println();
		
		cnt = 0;
		int i = min;
		while(i <= max) {
			System.out.print(i);
			cnt += 1;
			
			if(cnt % 10 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}
			i++;
		}
		
	}
	
	public static void ex6() {
		/*
		 * 100 ~ 999 범위에 해당하는 배수 값을 출력한다.
		 * 출력할 배수 값은 사용자 입력을 통해 알아낸다.
		 * 
		 * 예)
		 * 		배수 값 : 13
		 * 		104		117		130		143		156	
		 * 		169		...		
		 * 		...
		 * 		...		...		...		988		
		 */
		int num;
		
		System.out.print("배수 값 : ");
		num = sc.nextInt();	sc.nextLine();
		
		int cnt = 0;
		int loop = 1;
		for(int i = 100; i <= 999;) {
			if(i % num == 0) {
				System.out.print(i);
				cnt += 1;
				
				if(cnt % 5 == 0) {
					System.out.print("\n");
				} else {
					System.out.print("\t");
				}
				i += num;
			} else {
				i++;
			}
			loop++;
		}
		System.out.println("\n반복 횟수 : " + loop);
	}
	
	public static void ex7() {
		/*
		 * 사용자로 부터 임의의 문자열을 입력 받은 후
		 * a, e, i, o, u 문자가 얼마나 포함되어 있는지 확인하는 코드를 작성한다.
		 * 
		 * Tip 1.) 사용자가 입력한 문자열의 문자를 탐색하기 위해 .charAt(index) 메서드를
		 * 활용한다.
		 * 		String text = "hello";
		 * 		text.charAt(0); // 'h'
		 * 		text.charAt(1); // 'e'
		 * 		text.charAt(2); // 'l'
		 * 
		 * Tip 2.) 문자열의 길이를 알기 위해 .length() 메서드를 사용한다.
		 * 		String text = "hello";
		 * 		text.length(); // 5
		 */
		String text;
		
		System.out.print("문자열 입력 : ");
		text = sc.nextLine();
		
		int i = 0;
		int cnt = 0;
		while(i <= text.length() - 1) {
			switch(text.charAt(i)) {
				case 'a':	case 'e':	case 'i':	case 'o':	case 'u':
					cnt += 1;
			}
			i++;
		}
		
		/*
		int cnt = 0;
		for(int i = 0; i <= text.length() - 1; i++) {
			switch(text.charAt(i)) {
				case 'a':	case 'e':	case 'i':	case 'o':	case 'u':
					cnt += 1;
			}
		}
		*/
		
		System.out.println("a, e, i, o, u 문자의 수는 " + cnt + " 입니다.");
	}
	
	public static void main(String[] args) {
		// ex1();
		// ex2();
		// ex3();
		// ex4();
		// ex5();
		// ex6();
		ex4();
	}

}
