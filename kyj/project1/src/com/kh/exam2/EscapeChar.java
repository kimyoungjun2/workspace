package com.kh.exam2;

public class EscapeChar {

	public static void main(String[] args) {
		/*
		 * 이스케이프 문자
		 *   프로그래밍 코드에서 사용하는 문자가 문자열에 사용하는 문자와 중첩되는 경우
		 *   프로그램이 중첩된 의미를 제대로 구분하지 못하기 때문에 구분할 수 있는 추가 문자로
		 *   이스케이프 문자라는 것을 사용한다.
		 *   
		 *   이스케이프 문자는 \(역슬래쉬) 문자와의 조합으로 만들어진다.
		 *   
		 *   \n : 문자열 안에서 개행(엔터) 의 기능을 사용하기 위해 쓰인다.
		 *   \r : 문자열 안에서 커서의 위치를 해당 줄의 앞으로 이동시키기 위해 쓰인다.
		 *   \t : 문자열 안에서 탭 공백(8칸의 공백)을 사용하기 위해 쓰인다.
		 *   \" : 문자열 안에서 쌍따옴표 문자를 사용하기 위해 쓰인다.
		 *   \' : 문짜열 안에서 홑따옴표 문자를 사용하기 위해 쓰인다.
		 *   \\ : 문자열 안에서 역슬래쉬 문자를 사용하기 위해 쓰인다.
		 */
		
		System.out.print("안녕하세요.\n반갑습니다.\n");
		
		System.out.println("abcd\r12");  // Eclipse의 콘솔에서는 적용이 안되어 확인 안됨.
		
		System.out.println("abcd\t");
		System.out.println("abc\t");
		System.out.println("ab\t");
		
		System.out.println("안녕하세요. \"자바\" 프로그래밍 수업을 시작 합니다.");
		
		System.out.println("안녕하세요. '자바' 프로그래밍 수업을 시작 합니다.");
		System.out.println('\'');
		
		System.out.println("C:\\Program Files\\AdoptOpenJDK\\jdk-8.0.292.10-hotspot\\bin");
		System.out.println("\\n");

	}

}
