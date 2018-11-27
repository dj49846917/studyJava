package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 复制文件（5种）
 * 		StudentManager.java => Copy.java
 */
public class BufferedStramTest {
	public static void main(String[] args) throws IOException {
		String srcFileName = "StudentManager.java";
		String toFileName = "Copy.java";
		method1(srcFileName, toFileName);
		method2(srcFileName, toFileName);
		method3(srcFileName, toFileName);
		method4(srcFileName, toFileName);
		method5(srcFileName,toFileName);
	}
	
	// 缓冲流特殊功能读写一个字符串
	public static void method5(String srcFileName, String toFileName) throws IOException {
		// 创建缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		// 创建缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter(toFileName));
		// 一次读写一个字符串
		String ch;
		while ((ch=br.readLine())!=null) {
			System.out.println(ch);
			bw.write(ch);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
	
	// 缓冲流一次读写一个字符数组
	public static void method4(String srcFileName, String toFileName) throws IOException {
		// 创建缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		// 创建缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter(toFileName));
		// 一次读写一个字符
		char[] arr = new char[1024];
		int ch;
		while ((ch = br.read(arr)) != -1) {
			System.out.println(new String(arr));
			bw.write(arr, 0, ch);
		}

		br.close();
		bw.close();
	}

	// 缓冲流一次读写一个字符
	public static void method3(String srcFileName, String toFileName) throws IOException {
		// 创建缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		// 创建缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter(toFileName));
		// 一次读写一个字符
		int ch;
		while ((ch = br.read()) != -1) {
			System.out.print((char) ch);
			bw.write(ch);
		}

		br.close();
		bw.close();
	}

	// 基本流一次读写一个字符数组
	public static void method2(String srcFileName, String toFileName) throws IOException {
		// 创建输入流对象
		FileReader fr = new FileReader(srcFileName);
		// 创建输出流对象
		FileWriter fw = new FileWriter(toFileName);
		// 一次读写一个字符数组
		char[] arr = new char[1024];
		int ch;
		while ((ch = fr.read(arr)) != -1) {
			System.out.print(new String(arr, 0, ch));
			fw.write(new String(arr, 0, ch));
		}
		fr.close();
		fw.close();
	}

	// 基本流一次读写一个字符
	public static void method1(String srcFileName, String toFileName) throws IOException {
		// 创建输入流对象
		FileReader fr = new FileReader(srcFileName);
		// 创建输出流对象
		FileWriter fw = new FileWriter(toFileName);
		// 一次读写一个字符
		int ch;
		while ((ch = fr.read()) != -1) {
			System.out.print((char) ch);
			fw.write(ch);
		}
		// 释放资源
		fr.close();
		fw.close();
	}
}
