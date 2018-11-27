package com.itheima;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 把上一题的文本文件中的学生信息读取出来并存储到集合中，然后遍历集合，在控制台输出
 * 
 * 分析:
 * 		A： 定义学生类
 * 		B： 创建输入流对象
 * 		C： 创建集合对象
 * 		D: 读取文件数据，并把数据按照一定的格式进行分割赋值给学生对象，然后把学生对象作为元素存储到集合
 * 				heima001,向问天,30,北京
 * 		E: 释放资源
 * 		F: 遍历集合
 */
public class FileToArrayList {
	public static void main(String[] args) throws IOException {
		//  创建输入流对象
		BufferedReader br = new BufferedReader(new FileReader("array.txt"));
		// 创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();
		// 读取文件数据，并把数据按照一定的格式进行分割赋值给学生对象，然后把学生对象作为元素存储到集合
		String line;
		while((line=br.readLine())!=null){
			String[] toArray = line.split(",");
			Student s = new Student();
			s.setId(toArray[0]);
			s.setName(toArray[1]);
			s.setAge(toArray[2]);
			s.setAddress(toArray[3]);
			array.add(s);
		}
		// 释放资源
		br.close();
		// 遍历集合
		for(int x=0;x<array.size();x++){
			Student s = array.get(x);
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
}
