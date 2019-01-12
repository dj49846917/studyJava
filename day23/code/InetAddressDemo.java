package com.itheima;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress: 此类表示互联网协议(IP)地址
 * 
 * static InetAddress getByName(String host): 返回主机名/IP地址
 * String getHostName(): 返回主机名
 * String getHostAddress(): 返回IP地址
 * 
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
//		method();
		
//		method2();
		
		method3();
	}

	private static void method3() throws UnknownHostException {
		// String getHostName(): 返回主机名
		InetAddress address = InetAddress.getByName("MS-20170215AKCC");
		String hostname = address.getHostName();
		System.out.println(hostname); // 返回主机名
	}

	private static void method2() throws UnknownHostException {
		// String getHostAddress(): 返回IP地址
		InetAddress address = InetAddress.getByName("MS-20170215AKCC");
		String host = address.getHostAddress();
		System.out.println(host); // 输出: 192.168.8.106
	}

	private static void method() throws UnknownHostException {
		// static InetAddress getByName(String host): 返回主机名/IP地址
//		InetAddress address = InetAddress.getByName("MS-20170215AKCC");
//		System.out.println(address); // 输出: MS-20170215AKCC/192.168.8.106
		
		InetAddress address = InetAddress.getByName("192.168.8.106");
		System.out.println(address); // 输出: /192.168.8.106
	}
}
