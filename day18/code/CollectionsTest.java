package com.itheima_03;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 模拟斗地主发牌
 * 
 * 买牌
 * 洗牌
 * 发牌
 * 
 */
public class CollectionsTest {
	public static void main(String[] args) {
		// 买牌
		String[] arr = { "黑桃", "红桃", "梅花", "方块" };
		String[] arr2 = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		ArrayList<String> box = new ArrayList<String>();
		// 添加每张牌
		for (int i = 0; i < arr.length; i++) {
			// 获取每一个花色
			for (int j = 0; j < arr2.length; j++) {
				// 获取每一个点
				box.add(arr[i] + arr2[j]);
			}
		}
		box.add("大王");
		box.add("小王");
		// System.out.println(box.size()); // 输出: 54

		// 洗牌
		Collections.shuffle(box); // 随机置换
		// System.out.println(box);

		// 发牌
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		ArrayList<String> c = new ArrayList<String>();

		// 留三张底牌给地主
		for (int i = 0; i < box.size() - 3; i++) {
			/*
			 * i = 0; i % 3 = 0; 
			 * i = 1; i % 3 = 1; 
			 * i = 2; i % 3 = 2;
			 * 
			 */
			if(i % 3 == 0){
				a.add(box.get(i));
			}
			if(i % 3 == 1){
				b.add(box.get(i));
			}
			if(i % 3 == 2){
				c.add(box.get(i));
			}
		}
		System.out.println("李沁:" + a);
		System.out.println("金莎:" + b);
		System.out.println("刘亦菲:" + c);
		
		// 查看最后三张牌
		/*System.out.println(box.get(box.size()-1));
		System.out.println(box.get(box.size()-2));
		System.out.println(box.get(box.size()-3));*/
		
		// 优化
		System.out.println("底牌:");
		for(int i=box.size()-3;i<box.size();i++){
			System.out.println(box.get(i));
		}
	}
}
