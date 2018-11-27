package com.itheima;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 从文本文件中读取数据到ArrayList集合中，并遍历集合。每一行数据作为一个字符串元素
 * 
 * 分析:
 * 		A: 创建输入缓冲流对象
 * 		B: 创建集合对象
 * 		C: 读取数据，每次读取一行数据，把该行数据作为一个元素存储到集合中
 * 		D: 释放资源
 * 		E: 遍历集合
 */
public class BufferedStreamTest3 {
	public static void main(String[] args) throws IOException {
		// 创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader("array.txt"));
		// 创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		// 读取数据，每次读取一行数据，把该行数据作为一个元素存储到集合中
		String ch;
		while((ch=br.readLine())!=null){
			array.add(ch);
		}
		// 释放资源
		br.close();
		// 遍历集合
		for(int x=0;x<array.size();x++){
			String s = array.get(x);
			System.out.println(s);
		}
	}
}
