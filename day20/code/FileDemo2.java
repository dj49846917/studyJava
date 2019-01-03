package com.itheima;

import java.io.File;
import java.io.IOException;

/*
 * 创建功能:
 *		boolean createNewFile(): 当指定文件不存在时，创建文件并返回true,否则返回false
 * 		boolean mkdir(): 当指定文件夹不存在时，创建文件夹并返回true,否则返回false
 * 		boolean mkdirs(): 创建指定文件夹，当文件夹所在的目录不存在，则顺道一块儿创建了			
 * 
 * 删除功能:
 * 		boolean delete(): 当指定的文件或文件夹存在时，删除文件或文件夹并返回true,否则返回false
 * 
 * 绝对路径: 固定不可改变的路径，以盘符开头
 * 相对路径: 相对某个参照物，不能以盘符开头
 * 			在eclipse中相对路径相对应当前项目的根目录
 * 
 * 注意: 删除一个文件夹，这个文件夹下面不能有其他的文件或文件夹
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
//		File f = new File("D:\\b.txt"); // 绝对路径
		File f2 = new File("b.txt"); // 相对路径
		
		// boolean createNewFile(): 当指定文件不存在时，创建文件并返回true,否则返回false
		System.out.println(f2.createNewFile());
		
		// boolean mkdir(): 当指定文件夹不存在时，创建文件夹并返回true,否则返回false
		File f3 = new File("b");
		System.out.println(f3.mkdir());
		
		// boolean mkdirs(): 创建指定文件夹，当文件夹所在的目录不存在，则顺道一块儿创建了
		File f4 = new File("c\\d\\e");
		System.out.println(f4.mkdir()); // 输出: false
		System.out.println(f4.mkdirs()); // 输出: true
		
		// boolean delete(): 当指定的文件或文件夹存在时，删除文件或文件夹并返回true,否则返回false
		System.out.println(f2.delete()); // 返回:true
		System.out.println(f3.delete()); // 返回:true
		
		System.out.println(f4.delete());
		
		File f6 = new File("c");
		System.out.println(f6.delete()); // 输出:false 因为c有子文件或者子文件夹，不能删除
	}
}
