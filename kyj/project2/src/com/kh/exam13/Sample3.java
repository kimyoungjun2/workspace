package com.kh.exam13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Sample3 {

	public static void main(String[] args) {		
		
		Date dt = new Date();
		//Calendar cd = Calendar.getInstance();
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");
		String dateStr = df.format(dt.getTime());
		System.out.println(dateStr);		
		
//		try {
//			int result = 10/0;
//			System.out.println(result);
//			} catch(ArithmeticException e) {
//			e.printStackTrace();
//			}
		
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
