package com.kh.exam155;

import java.io.*;
import java.util.*;

public class LibraryController {
	
	public static String readFile(String filename) {
		StringBuffer sb = new StringBuffer();
		
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			
			char[] cArr = new char[8];
			while(true) {
				int res = br.read(cArr);
				if(res == -1) {
					break;
				}
				sb.append(cArr, 0, res);
			}
			
			br.close();
			fr.close();
		} catch(FileNotFoundException e) {
			System.out.println("읽기 작업을 수행할 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("읽기 작업중 문제가 발생하였습니다.");
		}		
		return sb.toString();
	}
	
	private List<Member> members = new ArrayList<Member>();
			
	String[] strTemp = readFile("./file55.txt").split("\r\n");	//전체 값 저장
	String[] strColumn = strTemp[0].split("\\|");			//첫번째 타이틀 배열
	
	List<Member> mem2 = new ArrayList<Member>();	//최종 출력값에 담기 위한 ArrayList
	
	for(int i = 1; i < strTemp.length; i++) {			//전체 값 반복
		String[] data = strTemp[i].split("\\|");			//전체 값 "|"기준으로 배열 저장
		Member mem1 = new Member();				//mem1(Member) 객체 0번 배열에 타이틀 배열 저장
		for(int j = 1; j < data.length; j++) {			//전체 값 반복
			mem1.setValue(strColumn[j]);	//std(Student)객체에 과목 및 점수입력
		}
		mem2.add(mem1);								//최종 students ArrayList에 값 저장
	}
	public Member myInfo(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	System.out.println(students);	
}