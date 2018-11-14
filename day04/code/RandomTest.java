package com.itheima;
import java.util.Scanner;
import java.util.Random;
/*
 * 系统生成1个0-100的随机数，猜猜这个数据是多少？
 * 		大了: 提示大了
 * 		小了: 提示小了
 * 		猜中了： 恭喜你答对了
 */
public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int a = r.nextInt(100); // 随机数
		System.out.println("正确答案是：" + a);
		for(int x =0;x<10;x++){
			System.out.println("请输入一个数据");
			int b = sc.nextInt();
			if(b == a){
				System.out.println("恭喜你答对了");
				break;
			}else if(b < a){
				System.out.println("值小了");
			}else{
				System.out.println("值大了");
			}
		}
	}
}
