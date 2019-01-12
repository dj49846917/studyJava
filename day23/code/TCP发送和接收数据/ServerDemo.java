package com.itheima_04;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 使用TCP协议接收数据
 * 
 * 步骤:
 * 		1.创建接收端Socket对象
 * 		2.监听(阻塞)
 * 		3.获取输入流对象
 * 		4.获取数据
 * 		5.输出数据
 * 		6.释放资源
 * 
 * 	ServerSocket: 接收端，服务端socket
 * 	ServerSocket(int port)
 * 
 * 	Socket accept()
 * 
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 创建接收端Socket对象
		ServerSocket ss = new ServerSocket(3000);
		
		// 监听(阻塞)
		Socket s = ss.accept();
		
		// 获取输入流对象
		InputStream is = s.getInputStream();
		
		// 获取数据
		byte[] bys = new byte[1024];
		int len;
		len = is.read(bys);
		
		// 输出数据
		InetAddress address = s.getInetAddress();
		System.out.println("clienter-->" + address.getHostName());
		System.out.println(new String(bys,0,len));
		
		// 释放资源
		s.close();
//		ss.close();
	}
}
