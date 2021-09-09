package com.kh.exam155;

import java.io.*;
import java.util.*;

public class readFile {

	public String readFile(String filename) {
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
}


