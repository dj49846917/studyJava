package com.itheima_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求:
 * 		把项目路径下的FileWriterDemo.java中的内容复制到项目路径下的Copy.java中
 */
public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo1.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy1.java"));

		// 方法一
		// int ch;
		// while((ch=br.read())!=-1){
		// System.out.print((char)ch);
		// bw.write(ch);
		// }

		// 方法二
		char[] arc = new char[1024];
		int ch;
		while ((ch = br.read(arc)) != -1) {
			System.out.print(new String(arc, 0, ch));
			bw.write(new String(arc, 0, ch));
		}

		br.close();
		bw.close();
	}
}
