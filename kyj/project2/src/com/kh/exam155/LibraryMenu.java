package com.kh.exam155;

import java.util.Date;
import java.util.Scanner;


public class LibraryMenu {

	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);	
	
	public void mainMenu() {
		String txtMenu = "==== 메뉴 ====\n";
		txtMenu += "1. 회원 메뉴\n";
		txtMenu += "2. 회원 전체 조회\n";
		txtMenu += "3. 회원 검색\n";		
		txtMenu += "9. 프로그램 종료하기\n";
		txtMenu += "메뉴 번호 : ";
		
		while(true) {
			System.out.print(txtMenu);
			int numMenu = sc.nextInt();	sc.nextLine();
			if(numMenu == 9) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			switch(numMenu) {
				case 1:
					this.memberMenu();	break;
				case 2:
					this.selectAll();	break;
				case 3:
					this.searchBook();	break;
			}
		}
		
	}
	
	public void memberMenu() {
		String txtMenu = "==== 회원 메뉴 ====\n";
		txtMenu += "1. 회원 가입\n";
		txtMenu += "2. 회원 검색\n";
		txtMenu += "3. 회원 수정\n";
		txtMenu += "4. 회원 삭제\n";		
		txtMenu += "9. 메인 메뉴로 돌아가기\n";
		txtMenu += "메뉴 번호 : ";
		System.out.print(txtMenu);
		
		int numMenu = sc.nextInt();	sc.nextLine();
		
		if(numMenu == 9) {
			System.out.println("메인 메뉴로 돌아갑니다.");
			return;
		}
		
		switch(numMenu) {
			case 1:
				this.joinMember();	break;
			case 2:
				this.searchMember();	break;
			case 3:
				this.updateMember();	break;
			case 4:
				this.deleteMember();	break;
		}
	}
	

	
	public void joinMember() {
		System.out.println("회원 가입을 진행합니다. 메시지에 맞추어 정보를 입력하세요.");
		System.out.print("식별번호 : ");
		int num = sc.nextInt();	sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();	sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("email : ");
		String email = sc.nextLine();
				
		
		Member mem = new Member(num, name, age, gender, email);		
		lc.insertMember(mem);
		
		System.out.println("가입이 완료되었습니다.");
	}
	
	public void searchMember() {
		System.out.println("회원 정보를 검색합니다. 메시지에 맞추어 정보를 입력하세요.");
		System.out.print("회원 이름 : ");
		String name = sc.nextLine();
		
		Member m = lc.myInfo(name);
		if(m != null) {
			System.out.println("회원 이름 : " + m.getName());
			System.out.println("회원 나이 : " + m.getAge());
			System.out.println("가입일자 : " + m.getJoinDate());
			//System.out.println("쿠폰 수 : " + m.getCouponCount());
		} else {
			System.out.println("해당 회원 정보를 찾을 수 없습니다.");
		}
	}
	
	public void updateMember() {
		System.out.println("회원 정보를 수정합니다. 메시지에 맞추어 정보를 입력하세요.");
		System.out.print("회원 입력 : ");
		String name = sc.nextLine();
		
		Member m = lc.myInfo(name);
		if(m != null) {
			System.out.print("나이 : ");
			int age = sc.nextInt();	sc.nextLine();
			
			System.out.print("성별 : ");
			char gender = sc.nextLine().charAt(0);
			
			m.setAge(age);	m.setGender(gender);
			
			System.out.println("회원 정보 수정이 완료되었습니다.");
		} else {
			System.out.println("수정할 회원 정보가 없습니다.");
		}
	}
	
	public void deleteMember() {
		System.out.println("회원 정보를 삭제합니다. 메시지에 맞추어 정보를 입력하세요.");
		System.out.print("회원 입력 : ");
		String name = sc.nextLine();
		
		Member m = lc.myInfo(name);
		if(m != null) {
			lc.deleteMember(m);
			System.out.println("회원정보가 삭제되었습니다.");
		} else {
			System.out.println("삭제할 회원 정보가 없습니다.");
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		int idx = 0;
		for(Book b: bList) {
			System.out.println(idx + "번 도서 : " + b);
			idx++;
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] searchList = lc.searchBook(keyword);
		
		for(Book b: searchList) {
			System.out.println(b);
		}
	}
	
	
	
	public static void main(String[] args) {
		LibraryMenu lm = new LibraryMenu();
		lm.mainMenu();
	}

}
