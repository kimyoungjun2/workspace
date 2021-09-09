package com.kh.exam6;

import java.util.Scanner;

public class PracFOR {

	static Scanner sc = new Scanner(System.in);
		
	public static void ex1() {
		/*
		 * 정수값을 입력받아 1 부터 입력받은 값까지의 1씩 증가된 값을 출력하는 코드 작성
		 * 
		 * 예)
		 * 		정수 입력 : 3
		 * 		1
		 * 		2
		 * 		3
		 */
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();	sc.nextLine();
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void ex2() {
		/*
		 * 정수값을 입력받고 입력받은 값부터 1씩 감소된 값을 출력하는 코드 작성
		 * 
		 * 예)
		 * 		정수 입력 : 3
		 * 		3
		 * 		2
		 * 		1
		 */
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();	sc.nextLine();
		
		for(int i = num; i >= 1; i--) {
			System.out.println(i);
		}
		
		// for(int i = num; ; i--) {
		// 	System.out.println(i);
		// 	if(i == 1) {
		// 		break;
		// 	}
		// }
	}
	
	public static void ex3() {
		/*
		 * 정수값을 입력받을 때 지정된 범위의 입력값이 아닌 경우 최대 3번까지 다시
		 * 입력 받을 수 있도록하는 코드 작성(범위는 1 ~ 99 사이의 값)
		 */
		int num;
		
		for(int i = 1; i <= 3; i++) {
			System.out.print("정수 입력(1 ~ 99) : ");
			num = sc.nextInt();	sc.nextLine();
			
			if(num >= 1 && num <= 99) {
				System.out.println("입력값 " + num + " 확인하였습니다.");
				break;
			}
		}
	}
	
	public static void ex4() {
		/*
		 * ex1() 처럼 동작하는 코드를 작성한다. 단, 출력 메시지는 다음과 같이 나오도록 한다.
		 * 
		 * 예)
		 * 		정수 입력 : 3
		 * 		1 2 3 
		 */
		int num;
		String text = "";
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();	sc.nextLine();
		
		for(int i = 1; i <= num; i++) {
			text = text + i + " ";
		}
		
		System.out.println(text);
	}
	
	public static void ex5() {
		/*
		 * ex4() 처럼 동작하는 코드를 작성한다. 단, 1 부터 시작하는 값이 아닌 100 부터 시작하는
		 * 형태로 나오게 한다.
		 * 
		 * 예)
		 * 		정수 입력 : 3
		 * 		100 101 102
		 */
		int num;
		String text = "";
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();	sc.nextLine();
		
		for(int i = 100; i < num + 100; i++) {
			text = text + i + " ";
		}
		
		System.out.println(text);
	}
	
	public static void ex6() {
		/*
		 * ex4() 처럼 출력을 하는 코드를 작성한다. 단, 3의 배수에 해당하는 값만을 출력하도록 한다.
		 * 
		 * 예)
		 * 		정수 입력 : 10
		 * 		3 6 9
		 */
		int num;
		String text = "";
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();	sc.nextLine();
		
		for(int i = 3; i <= num; i+=3) {
			text = text + i + " ";
		}
		
		System.out.println(text);
	}
	
	public static void ex7() {
		/*
		 * ex6() 처럼 출력을 하는 코드를 작성한다. 단, 짝수에 해당하는 값만을 출력하고 역순으로 출력
		 * 하도록 한다.
		 * 
		 * 예)
		 * 		정수 입력 : 10
		 * 		10 8 6 4 2 
		 */
		int num;
		String text = "";
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();	sc.nextLine();
		
		num = num % 2 == 1 ? num - 1 : num;
		
		for(int i = num; i >= 1; i-=2) {
			text = text + i + " ";
		}
		
		System.out.println(text);
	}
	
	public static void ex8() {
		/*
		 * 정수값을 입력받아 1 부터 입력받은 값까지 1씩 증가된 값을 누적하여 합을 구하는 코드를
		 * 작성한다.
		 * 
		 * 예 1.)
		 * 		정수 입력 : 3
		 * 		누적합 : 6
		 * 
		 * 예 2.)
		 * 		정수 입력 : 5
		 * 		누적합 : 15
		 * 
		 * 예 3.)
		 * 		정수 입력 : 10
		 * 		누적합 : 55
		 */
		int num;
		int tot = 0;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();	sc.nextLine();
		
		for(int i = 1; i <= num; i++) {
			tot += i;	// tot = tot + i;
		}
		
		System.out.println("누적합 : " + tot);
	}
	
	public static void ex9() {
		/*
		 * ex9() 와 동일하게 동작하는 코드를 작성한다. 단, 출력 결과는 다음과 같이 나오도록 한다.
		 * 
		 * 예 1.)
		 * 		정수 입력 : 3
		 * 		누적합 결과
		 * 			1 + 2 + 3 = 6
		 * 예 2.)
		 * 		정수 입력 : 10
		 * 		누적합 결과
		 * 			1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		 */
		int num;
		int tot = 0;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();	sc.nextLine();
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i);
			
			if(i == num) {
				System.out.print(" = ");
			} else {
				System.out.print(" + ");
			}
			
			tot += i;	// tot = tot + i;
		}
		
		System.out.println(tot);
	}
	
	public static void ex10() {
		/*
		 * 사용자가 입력한 문자열을 기반으로 파일명이 자동으로 생성되는 프로그램을 만들려고 한다.
		 * 다음의 요구 사항을 파악하여 사용자가 원하는 기능이 동작하도록 코드를 작성하시오.
		 * 
		 * 1. 임의의 파일명을 입력할 수 있어야 한다.
		 * 2. 파일은 1개를 생성할 수도 있지만 원하는 경우 2개 이상도 생성할 수 있다.
		 * 3. 만약 2개 이상의 파일을 생성하는 경우 2번째 파일 부터는 파일명 뒤에 "[2]" 접미사가 붙는다.
		 * 4. 3번 요구사항의 접미사 숫자값은 2 로 고정하는 것이 아니라 파일 수에 맞추어 1씩 증가해야 한다.
		 * 
		 * 예 1.)
		 * 		파일명 입력 : newFile
		 * 		생성 파일수 : 1
		 * 		결과
		 * 			newFile 생성 완료!
		 * 
		 * 예 2.)
		 * 		파일명 입력 : newFile
		 * 		생성 파일수 : 3
		 * 		결과
		 * 			newFile 생성 완료!
		 * 			newFile[2] 생성 완료!
		 * 			newFile[3] 생성 완료!
		 */
		String fileName;
		int count;
		
		System.out.print("파일명 입력 : ");
		fileName = sc.nextLine();
		
		System.out.print("생성 파일수 : ");
		count = sc.nextInt();	sc.nextLine();
		
		if(count >= 1) {
			System.out.println(fileName + " 생성 완료!");
		}
		
		for(int i = 2; i <= count; i++) {
			System.out.println(fileName + "[" + i +"] 생성 완료!");
		}
	}
	
	public static void ex11() {
		/*
		 * 사칙연산 계산기 프로그램
		 * 간단한 사칙 연산을 수행하는 계산기 프로그램 코드를 작성하시오.
		 * 이 프로그램은 계속 동작이 이루어 지도록 한다. 필요한 경우
		 * 연산자 입력에서 z 를 입력하면 종료가 되도록 한다.
		 * 
		 * 예 1.)
		 * 		숫자 입력1 : 10
		 * 		연산자 입력 : +
		 * 		숫자 입력2 : 20
		 * 		결과
		 * 			10 + 20 = 30
		 * 
		 * 예 2.)
		 * 		숫자 입력1 : 10
		 * 		연산자 입력 : /
		 * 		숫자 입력2 : 20
		 * 		결과
		 * 			10 / 20 = 0.5
		 */
		int num1, num2, res;
		char op;
		double res1;
		
		for(;;) {
			for(;;) {
				System.out.print("숫자 입력 1 : ");
				if(sc.hasNextInt()) {
					num1 = sc.nextInt();	sc.nextLine();
					break;
				} else {
					System.out.println("숫자만 입력하세요.");
					sc.nextLine();	// 입력 버퍼에 저장된 값을 지우기 위해 사용.
				}
			}
			
			System.out.print("연산자 입력 : ");
			op = sc.nextLine().charAt(0);
			
			if(op == 'z') {
				break;
			}
			
			System.out.print("숫자 입력 2 : ");
			num2 = sc.nextInt();	sc.nextLine();
			
			switch(op) {
				case '+':
					res = num1 + num2;
					System.out.printf("%d + %d = %d\n", num1, num2, res);
					break;
				case '-':
					res = num1 - num2;
					System.out.printf("%d - %d = %d\n", num1, num2, res);
					break;
				case '*':
					res = num1 * num2;
					System.out.printf("%d * %d = %d\n", num1, num2, res);
					break;
				case '%':
					res = num1 % num2;
					System.out.printf("%d %% %d = %d\n", num1, num2, res);
					break;
				case '/':
					res1 = (double)num1 / num2;
					System.out.printf("%d / %d = %.1f\n", num1, num2, res1);
			}
		}
	}
	
	public static void main(String[] args) {
		// ex1();
		// ex2();
		// ex3();
		// ex4();
		ex11();
		// ex6();
		// ex7();
		// ex8();
		// ex9();
		// ex10();
		// ex11();
	}

}
