package com.kh.exam4;

/*
 * 1. 편의점에서 판매하는 커피 상품에 대해 클래스를 작성
 * 		- 구체화된 기능은 필요 없음, 멤버 필드, 생성자 정도만 만들면 됨.
 * 		- 멤버 필드는 5개 정도 정의하면 됨.
 * 		- 캡술화가 될 수 있게 만든다.
 * 		- 생성자는 반드시 기본생성자와 매개변수가 있는 생성자로 만든다.
 * 		- 매개변수가 있는 생성자는 최대 2개의 초기값을 받아서 초기화 할 수 있게 한다.
 */
class 커피 {
	private String 상품명;
	private int 가격;
	private int 용량;
	private int 칼로리;
	private String 원두;
	
	public 커피() {
		System.out.println("기본 생성자로 초기화가 잘 진행되었습니다.");
	}
	public 커피(String 상품명, int 가격) {
		this.상품명 = 상품명;
		this.가격 = 가격;
		System.out.println("매개변수가 있는 생성자로 초기화가 잘 진행되었습니다.");
	}
	
	public String get상품명() {
		return this.상품명;
	}
	public int get가격() {
		return this.가격;
	}
}


/*
 * 2. 임의의 직업에 대한 클래스 작성
 * 		- 구체화된 기능은 필요 없음, 멤버 필드, 생성자 정도만 만들면 됨.
 * 		- 멤버 필드는 5개 정도 정의하면 됨.
 * 		- 캡술화가 될 수 있게 만든다.
 * 		- 생성자는 반드시 기본생성자와 매개변수가 있는 생성자로 만든다.
 * 		- 매개변수가 있는 생성자는 최대 2개의 초기값을 받아서 초기화 할 수 있게 한다.
 */

public class Prac1 {

	public static void main(String[] args) {
		int x = 1;
		커피 아메리카노 = new 커피();
		커피 콜드브루 = new 커피("콘트라베이스", 4000);
		// System.out.println(콜드브루.상품명 + "|" + 콜드브루.가격);
		System.out.println(콜드브루.get상품명() + "|" + 콜드브루.get가격());
	}

}
