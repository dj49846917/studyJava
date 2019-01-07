package com.itheima_02;

import java.io.File;

/*
 * 需求: 删除指定的目录(包含子目录)
 * 
 * 注意: 如果要删除一个目录，则需要先删除这个目录下的所有子文件和目录
 */
public class FileTest2 {
	public static void main(String[] args) {
		File f = new File("F:\\软件安全下载目录");
		method(f);
	}
	
	public static void method(File file){
		if(file.isDirectory()){
			// 干掉自己所有的子文件和子目录
			File[] files = file.listFiles();
			for(File f: files){
				if(f.isFile()){
					System.out.println(f.getName());
					// 直接干掉他
					f.delete();
				}else if(f.isDirectory()){
					// 继续查看是还有文件或目录
					method(f);
				}
			}
			// 干掉自己
			System.out.println(file.getName());
			file.delete();
		}
	}
}
