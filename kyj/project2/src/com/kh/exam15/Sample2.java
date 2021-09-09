package com.kh.exam15;

import java.io.*;

public class Sample2 {

	public static void main(String[] args) {
		//(이미지, 비디오, 일반 텍스트 파일 등의 파일을 읽고 쓰기 위해 사용)
		//바이트 기반 파일 쓰기 작업
		try {
			
			File f = new File("./fileoutput.txt");
			FileOutputStream fos = new FileOutputStream(f);
			byte[] bArr = new byte[] {65,66,67,68,69};
			
			fos.write(bArr);
			fos.close();
		} catch (FileNotFoundException e) {		
			System.out.println("파일 출력 스트림에 문제가 발생하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 쓰기 작업에 문제가 발생하였습니다.");			
		}
		
		//바이트 기반 파일 읽기 작업
		try {
			FileInputStream fis = new FileInputStream("./fileoutput.txt");
			char[] text = new char[0];
			while(true) {
				int r = fis.read();								
				if(r == -1) {
					break;
				}
				char[] temp = new char[text.length + 1];
				System.arraycopy(text,0,temp,0,text.length);
				temp[temp.length - 1] = (char)r;
				text = temp;				
			}			
			System.out.println(text);
			fis.close();
		}catch(FileNotFoundException e){
			System.out.println("파일 입력 스트림에 문제가 발생하였습니다.");
		}catch(IOException e){
			System.out.println("파일 읽기 작업에 문제가 발생하였습니다.");
		}
	}

}
