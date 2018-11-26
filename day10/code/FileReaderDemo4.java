package com.itheima;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("StringBuilderDemo.java");
		FileWriter fw = new FileWriter("Copy.java");
		
		// 方法一
//		int chs;
//		while((chs=fr.read())!=-1){
////			System.out.print((char)chs);
//			fw.write(chs);
//		}
		
		// 方法二
		char[] ch = new char[5];
		int chs;
		while((chs=fr.read(ch))!=-1){
			System.out.print(new String(ch,0,chs));
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}
}
