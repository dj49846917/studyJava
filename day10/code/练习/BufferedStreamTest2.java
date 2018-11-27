package com.itheima;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 把ArrayList集合中的字符串数据存储到文本文件中，每一个字符串元素作为文件中的一部分
 * 
 * 分析:
 * 		A: 创建集合对象
 * 		B: 往集合中添加字符串元素
 * 		C: 创建输出缓冲流对象
 * 		D: 遍历集合，得到每一个字符串元素，然后把该字符串元素作为数据写到文本文件
 * 		E: 释放资源
 */
public class BufferedStramTest2 {
	public static void main(String[] args) throws IOException {
		// 创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		// 往集合中添加字符串元素
		array.add("hello");
		array.add("world");
		array.add("java");
		// 创建输出缓冲流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt"));
		// 遍历集合，得到每一个字符串元素，然后把该字符串元素作为数据写到文本文件
		for (int x = 0; x < array.size(); x++) {
			String s = array.get(x);
			bw.write(s);
			bw.newLine();
		}
		bw.close();
	}
}
