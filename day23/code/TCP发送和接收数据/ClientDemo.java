package com.itheima_04;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
 * 使用TCP协议发送数据
 * 		步骤:
 * 			1.创建发送端Socket对象(创建连接)
 * 			2.获取输出流对象
 * 			3.发送数据
 * 			4.释放资源
 * 
 * Socket(InetAddress address, int prot)
 * 	Exception in thread "main" java.net.ConnectException: Connection refused: connect(还没创建接收端，连接拒绝)
 * 
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException, IOException {
		// 创建发送端Socket对象(创建连接)
		Socket s = new Socket(InetAddress.getByName("MS-20170215AKCC"), 3000);
		// 获取输出流对象
		OutputStream os = s.getOutputStream();
		// 发送数据
		String str = "hello, TCP";
		os.write(str.getBytes());	
		// 释放资源
		// os.close();
		s.close();
	}
}
