package com.kh.exam17;

import java.net.*;
import java.util.Arrays;

public class Sample1 {

	public static void main(String[] args) throws UnknownHostException{
		byte[] addr = new byte[]{127,0,0,1};
		InetAddress inet = InetAddress.getByAddress(addr);
		System.out.println(Arrays.toString(inet.getAddress()));
		
		//loopback 정보 가져오기
		InetAddress inet2 = InetAddress.getByName("localhost");
		System.out.println(Arrays.toString(inet2.getAddress()));
		
		InetAddress inet3 = InetAddress.getByName("naver.com");
		String naverIP = "";
		for(byte b:inet3.getAddress()) {
			naverIP += ((int)b & 255) + ".";			
		}
		naverIP = naverIP.substring(0, naverIP.length()-1);
		System.out.println(naverIP);
		
		InetAddress inet4 = InetAddress.getLocalHost();
		System.out.println(inet4.getHostAddress());
	}
}
