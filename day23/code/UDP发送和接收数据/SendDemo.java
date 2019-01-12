package com.itheima_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 使用UDP协议发数据
 * 
 * 步骤:
 * 		1.创建发送端Socket对象
 * 		2.创建数据并打包
 * 		3.发送数据
 * 		4.释放资源
 * 
 * DatagramSocket： 此类表示用来发送和接收数据，基于UDP的
 * 
 * 构造方法:
 * 		DatagramSocket(): 创建Socket对象并随机分配端口号
 * 		DatagramSocket(int port): 创建Socket对象并制定端口号
 * 
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		// 创建发送端Socket对象
		DatagramSocket ds = new DatagramSocket();
		// 创建数据并打包
		/*
		 * DatagramPacket: 此类表示数据报包
		 * 数据byte[]
		 * 设备的地址ip
		 * 
		 */
		String p = "hello world UDP";
		byte[] bys = p.getBytes(); // 内容
		int length = bys.length; // 长度
		InetAddress address = InetAddress.getByName("MS-20170215AKCC"); // 发送给当前设备(地址)
		System.out.println(address);
		int port = 8080; // 端口号
		// 打包
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);
		
		// 发送数据
		ds.send(dp);
		// 释放资源
		ds.close();
	}
}
