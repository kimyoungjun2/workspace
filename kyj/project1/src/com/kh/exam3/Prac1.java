package com.kh.exam3;

import java.util.Scanner;

public class Prac1 {

	/*
	 * Scanner 로 사용자 입력을 받아 다음의 결과가 출력될 수 있도록 한다.
	 * 
	 * 이름을 입력하세요. : 홍길동
	 * 성별을 입력하세요.(남/여) : 남
	 * 나이를 입력하세요. : 32
	 * 키를 입력하세요.(cm) : 175.4
	 * 
	 * 홍길동님의 나이는 32세 입니다.
	 * 키는 약 175cm 이고 성별은 남자 입니다.
	 */
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String name;
		char gender;
		int age;	double tall;

		System.out.print("이름을 입력하세요. : ");
		name = sc.next();				sc.nextLine();
		
		System.out.print("성별을 입력하세요.(남/여) : ");
		gender = sc.next().charAt(0);	sc.nextLine();
		
		System.out.print("나이를 입력하세요. : ");
		age = sc.nextInt();				sc.nextLine();
		
		System.out.print("키를 입력하세요.(cm) : ");
		tall = sc.nextDouble();
		
		String msg = "%s님의 나이는 %d세 입니다.\n"
				+ "키는 약 %.0f cm 이고 성별은 %c자 입니다.\n";
		
		//System.out.printf("%s님의 나이는 %d세 입니다.\n", name, age);
		//System.out.printf("키는 약 %.0f cm 이고 성별은 %c자 입니다.\n", tall, gender);
		System.out.printf(msg, name, age, tall, gender);
	}

}
