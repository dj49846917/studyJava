package com.itheima_03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求:
 * 		把项目路径下的FileWriterDemo.java中的内容复制到项目路径下的Copy.java中
 */

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("FileWriterDemo1.java");
		FileWriter fw = new FileWriter("Copy.java");
		
		int ch;
		while((ch=fr.read())!=-1){
			System.out.print((char)ch);
			fw.write(ch);
		}
		
		fw.close();
	}
}
