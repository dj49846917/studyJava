package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * 需求: 读取项目根目录下的FileWriterDemo1.java，并输出到命令行
 * 
 * 由于标准输出流是一个字节输出流，所以只能输出字节或者字节数组，但是我们读取到的数据是字符串，如果想进行输出还需要转换成字符数组
 * 我们要想通过标准输出流输出字符串，把标准输出流转换成一种字符输出流即可
 * 
 * OutputStreamWriter(OutputSteam out)
 * 
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		// method();

		// method2();

		// 创建输入流对象
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo1.java"));
		// 创建输出流对象
		Writer w = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(w);

		// 数据读写
		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}

		br.close();
		bw.close();
	}

	private static void method2() throws FileNotFoundException, IOException {
		// 创建输入流对象
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo1.java"));
		// 创建输出流对象
		Writer w = new OutputStreamWriter(System.out);

		// 数据读写
		String line;
		while ((line = br.readLine()) != null) {
			w.write(line);
			w.write("\r\n");
		}

		br.close();
		w.close();
	}

	private static void method() throws FileNotFoundException, IOException {
		// 创建输入流对象
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo1.java"));
		// 创建输出流对象
		OutputStream os = System.out; // 标准输出流

		String line;
		while ((line = br.readLine()) != null) {
			os.write(line.getBytes());
			os.write("\r\n".getBytes());
		}

		br.close();
		os.close();
	}
}
