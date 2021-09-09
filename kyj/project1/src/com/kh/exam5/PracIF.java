package com.kh.exam5;

import java.util.Scanner;

public class PracIF {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void ex1() {
		/*
		 * 다음의 예시를 보고 동일하게 동작하는 코드를 작성
		 * 
		 * 예)
		 * 		1. 입력 메뉴
		 * 		2. 수정 메뉴
		 * 		3. 검색 메뉴
		 * 		4. 삭제 메뉴
		 * 		5. 종료
		 * 
		 * 		메뉴 번호 입력 : 3
		 * 		검색 메뉴를 입력하였습니다.
		 */
		char menuChar;
		String menuStr = "A. 입력 메뉴\n"
				+ "B. 수정 메뉴\n"
				+ "C. 검색 메뉴\n"
				+ "D. 삭제 메뉴\n"
				+ "E. 종료";
		
		System.out.println(menuStr);
		System.out.println();
		System.out.print("메뉴 번호 입력 : ");
		
		menuChar = sc.nextLine().charAt(0);
		
		switch(menuChar) {
			case 'A': case 'a':
				System.out.println("입력 메뉴를 입력하였습니다.");	break;
			case 'B': case 'b':
				System.out.println("수정 메뉴를 입력하였습니다.");	break;
			case 'C': case 'c':
				System.out.println("검색 메뉴를 입력하였습니다.");	break;
			case 'D': case 'd':
				System.out.println("삭제 메뉴를 입력하였습니다.");	break;
			case 'E': case 'e':
				System.out.println("종료 하였습니다.");
		}
		
//		if(menuNum == 1) {
//			System.out.println("입력 메뉴를 입력하였습니다.");
//		} else if(menuNum == 2) {
//			System.out.println("수정 메뉴를 입력하였습니다.");
//		} else if(menuNum == 3) {
//			System.out.println("검색 메뉴를 입력하였습니다.");
//		} else  if(menuNum == 4) {
//			System.out.println("삭제 메뉴를 입력하였습니다.");
//		} else if(menuNum == 5) {
//			System.out.println("종료 하였습니다.");
//		}
	}
	
	public static void ex2() {
		/*
		 * 영문자 알파벳 범위릐 ASCII 코드 번호를 입력받은 경우에만 해당하는 문자를
		 * 출력하고 코드 범위를 벗어난 경우에는 "ASCII 코드 영문자 범위를 벗어났습니다."
		 * 라는 메시지를 출력하도록 하시오.
		 * 
		 * 예 1.)
		 * 		영문자 범위의 ASCII 코드 번호 입력 : 65
		 * 		입력한 ASCII 코드 65 의 영문자는 'A' 입니다.
		 * 
		 * 예 2.)
		 * 		영문자 범위의 ASCII 코드 번호 입력 : 92
		 * 		ASCII 코드 영문자 범위를 벗어났습니다.
		 */
		int code;
		
		System.out.print("영문자 범위의 ASCII 코드 번호 입력 : ");
		code = sc.nextInt();	sc.nextLine();
		
		if((code >= 'A' && code <= 'Z') || (code >= 'a' && code <= 'z')) {
			System.out.printf("입력한 ASCII 코드 %d 의 영문자는 '%c' 입니다.\n",
					code, code);
		} else {
			System.out.println("ASCII 코드 영문자 범위를 벗어났습니다.");
		}
		
//		if(code >= 'A' && code <= 'Z') {
//			System.out.printf("입력한 ASCII 코드 %d 의 영문자는 '%c' 입니다.\n",
//					code, code);
//		} else if(code >= 'a' && code <= 'z') {
//			System.out.printf("입력한 ASCII 코드 %d 의 영문자는 '%c' 입니다.\n",
//					code, code);
//		} else {
//			System.out.println("ASCII 코드 영문자 범위를 벗어났습니다.");
//		}
	}
	
	public static void ex3() {
		/*
		 * 국어, 영어, 수학 세 과목의 시험 점수를 입력 받아 총점과 평균을 구하고
		 * 평균이 60점 이상인 경우에 "합격입니다." 메시지를 출력하고 60점 이상이
		 * 아닌 경우에 "불합격입니다." 메시지를 출력한다.
		 */
		double kor, eng, mth;
		double tot, avg;
		
		String msg = "불합격";
		
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextDouble();	sc.nextLine();
		
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextDouble();	sc.nextLine();
		
		System.out.print("수학 점수 입력 : ");
		mth = sc.nextDouble();	sc.nextLine();
		
		tot = kor + eng + mth;
		avg = tot / 3.0;
		
		System.out.println("총합 : " + tot);
		System.out.println("평균 : " + avg);
		
		// msg = avg >= 60 ? "합격" : "불합격";

		if(avg >= 60) {
			msg = "합격";
		}
		
		System.out.println(msg + "입니다.");
	}

	public static void ex4() {
		/*
		 * 점수를 입력 받아 A ~ D 까지의 등급을 구분하여 출력하는 코드를 작성한다.
		 * 
		 * A 등급은 ~ 90 이상
		 * B 등급은 90 미만 ~ 80 이상
		 * C 등급은 80 미만 ~ 70 이상
		 * D 등급은 70 미만 ~ 60 이상
		 * F 등급은 60 미만 ~
		 *
		 * 점수는 100 ~ 0 점 사이의 값을 입력받아야 하며, 이 범위를 벗어나는 경우 
		 * "점수 입력 범위를 벗어났습니다." 라는 메시지를 출력한다.
		 */
		double jumsu;
		String msg;
		
		System.out.print("점수 입력(0 ~ 100) : ");
		jumsu = sc.nextDouble();	sc.nextLine();
		
		if(jumsu >= 0 && jumsu <= 100) {
//			if(jumsu >= 90) {
//				msg = "A 등급";
//			} else if(jumsu >= 80 && jumsu < 90) {
//				msg = "B 등급";
//			} else if(jumsu >= 70 && jumsu < 80) {
//				msg = "C 등급";
//			} else if(jumsu >= 60 && jumsu < 70) {
//				msg = "D 등급";
//			} else {
//				msg = "F 등급";
//			}
			
			if(jumsu / 10 >= 9) {
				msg = "A 등급";
			} else if(jumsu / 10 >= 8) {
				msg = "B 등급";
			} else if(jumsu / 10 >= 7) {
				msg = "C 등급";
			} else if(jumsu / 10 >= 6) {
				msg = "D 등급";
			} else {
				msg = "F 등급";
			}
			
			System.out.println(msg + " 입니다.");
		} else {
			System.out.println("점수 입력 범위를 벗어났습니다.");
		}
	}

	public static void ex5() {
		/*
		 * 1 ~ 31 까지의 일자 정보를 입력 받고 해당 일자의 요일을 출력하게 한다.
		 * 2021년 7월에 한정한 요일 정보를 출력하게 하면 된다.
		 * 
		 * 예 1.)
		 * 		일자 입력 : 9
		 * 		금요일 입니다.
		 * 
		 * 예 2.)
		 * 		일자 입력 : 32
		 * 		입력 범위를 벗어났습니다. 1 ~ 31 까지만 입력하세요.
		 */
		//kyj : 8월 기준으로 변경
		int day;
		
		System.out.print("일자 입력 : ");
		day = sc.nextInt();	sc.nextLine();
		
		if(day >= 1 && day <= 30) {
			switch(day % 7) {
				case 0:	System.out.println("토요일 입니다.");	break;
				case 1:	System.out.println("일요일 입니다.");	break;
				case 2:	System.out.println("월요일 입니다.");	break;
				case 3:	System.out.println("화요일 입니다.");	break;
				case 4:	System.out.println("수요일 입니다.");	break;
				case 5:	System.out.println("목요일 입니다.");	break;
				case 6:	System.out.println("금요일 입니다.");
			}
			
//			if(day % 7 == 0) {
//				System.out.println("수요일 입니다.");
//			} else if(day % 7 == 1) {
//				System.out.println("목요일 입니다.");
//			} else if(day % 7 == 2) {
//				System.out.println("금요일 입니다.");
//			} else if(day % 7 == 3) {
//				System.out.println("토요일 입니다.");
//			} else if(day % 7 == 4) {
//				System.out.println("일요일 입니다.");
//			} else if(day % 7 == 5) {
//				System.out.println("월요일 입니다.");
//			} else if(day % 7 == 6) {
//				System.out.println("화요일 입니다.");
//			}
		} else {
			System.out.println("입력 범위를 벗어났습니다. 1 ~ 31 까지만 입력하세요.");
		}
	}
	
	public static void ex6() {
		String str;
		
		System.out.println("더하기, 빼기, 나누기, 곱하기 중 하나를 입력하시오.");
		System.out.print(": ");
		
		str = sc.nextLine();
		
		switch(str) {
			case "더하기":
				System.out.println("더하기는 + 기호를 사용합니다.");	break;
			case "빼기":
				System.out.println("빼기는 - 기호를 사용합니다.");		break;
			case "곱하기":
				System.out.println("곱하기는 * 기호를 사용합니다.");	break;
			case "나누기":
				System.out.println("나누기는 / 기호를 사용합니다.");	break;
			default:
				System.out.println("더하기, 빼기, 곱하기, 나누기중 하나를 입력하세요.");
		}
	}
	
	public static void ex7() {
		/*
		 * 시간과 분을 따로 입력받고 추가로 분을 더 입력받아 입력받은 시간에서 추가로 입력한 분의
		 * 더한 시간을 출력하도록 한다. 입력 시간은 24시간 형식을 입력 받고 출력 시간은 오전/오후
		 * 를 구분하는 12시간 형식을 출력하도록 한다.
		 * 		- 24시간 형식의 12시 30분은 12시간 형식의 오후 12시 30분 이다.
		 * 		- 24시간 형식의 00시 30분은 12시간 형식의 오전 12시 30분 이다.
		 * 		- 24시간 형식의 23시 30분은 12시간 형식의 오후 11시 30분 이다.
		 * 		- 24시간 형식의 11시 30분은 12시간 형식의 오전 11시 30분 이다.
		 * 
		 * 예 1.)
		 * 		시간 입력 : 23
		 * 		분 입력 : 50
		 * 		추가 분 입력 : 20
		 * 		입력 시간에서 20분을 추가한 시간은 오전 12시 10분 입니다.
		 * 
		 * 0 ~ 23 시간의 입력 범위를 넘기면 지정한 범위의 값을 입력하도록하는 메시지 출력
		 */
		int hour, minute, addMinute;

		System.out.print("시간 입력 : ");
		hour = sc.nextInt();	sc.nextLine();

		System.out.print("분 입력 : ");
		minute = sc.nextInt();	sc.nextLine();

		System.out.print("추가 분 입력 : ");
		addMinute = sc.nextInt();	sc.nextLine();

		if(hour >= 0 && hour <= 23) {
			if(minute >= 0 && minute < 60) {
				
				// 입력 분에 추가분 더함.
				minute = minute + addMinute;
				
				// 추가분을 더한 결과가 60을 넘으면 시간으로 환원시키기 위해 작성된 코드
				if(minute >= 60) {
					hour = hour + (minute / 60);
					minute = minute % 60;
				}
				
				// 24 시간이 넘어가면 24로 나머지 계산하여 나머지 값만 취함.
				if(hour >= 24) {
					hour = hour % 24;
				}

				if(hour == 0) {
					System.out.printf("입력 시간에서 %d 분을 추가한 시간은 오전 12시 %d분 입니다.",
							addMinute, minute);
				} else if(hour == 12) {
					System.out.printf("입력 시간에서 %d 분을 추가한 시간은 오후 12시 %d분 입니다.",
							addMinute, minute);
				} else if(hour >= 1 && hour <= 11) {
					System.out.printf("입력 시간에서 %d 분을 추가한 시간은 오전 %d시 %d분 입니다.",
							addMinute, hour, minute);
				} else if(hour >= 13 && hour <= 23) {
					System.out.printf("입력 시간에서 %d 분을 추가한 시간은 오후 %d시 %d분 입니다.",
							addMinute, hour - 12, minute);
				}

			} else {
				System.out.println("0 ~ 59 사이의 분을 입력하세요.");
			}
		} else {
			System.out.println("0 ~ 23 사이의 시간을 입력하세요.");
		}
	}
	
	public static void main(String[] args) {
		// ex1();
		// ex2();
		// ex3();
		// ex4();
		// ex5();
		// ex6();
		ex7();
	}

}
