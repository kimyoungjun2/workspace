package com.kh.exam16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test {

	public static void main(String[] args) {
		FileWriter fw = null;
		FileReader fr = null;
		
		try {
			fw = new FileWriter("test.txt");
			fr = new FileReader("test.txt");
			
			char[] cArr = new char[100];
			StringBuffer sb = new StringBuffer();
			while(true) {
				int res = fr.read(cArr);
				if(res == -1) {
					break;
				}
				fw.write(99);
				fw.write(70);			 
				sb.append(cArr,0,res);
			}
			fw.close();
			fr.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
