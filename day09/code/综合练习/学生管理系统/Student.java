package myStudentManager;

import java.util.Scanner;

/*
 * 这是我的学生管理系统的主类
 * 
 * 步骤如下:
 * 		A: 定义学生类
 * 		B: 学生管理系统的主页面的代码编写
 * 		C: 学生管理系统的查看所有学生的代码编写
 * 		D: 学生管理系统的添加学生的代码编写
 * 		E: 学生管理系统的删除学生的代码编写
 * 		F: 学生管理系统的修改学生的代码编写
 */
public class StudentManager {
	public static void main(String[] args) {
		// 为了让程序能过回到这里来，我们使用循环
		while(true) {
			// 这是学生管理系统的主界面
			System.out.println("--------欢迎来到学生管理系统--------");
			System.out.println("1 查看所有学生");
			System.out.println("2 添加学生");
			System.out.println("3 删除学生");
			System.out.println("4 修改学生");
			System.out.println("5 退出");
			System.out.println("请输入你的选择");
			// 创建键盘录入对象
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();
			// 用switch来实现选择
			switch (choiceString) {
			case "1":
				// 查看所有学生
				break;
			case "2":
				// 添加学生
				break;
			case "3":
				// 删除学生
				break;
			case "4":
				// 修改学生
				break;
			case "5":
				// 退出
				// break;
			default:
				System.out.println("谢谢你的使用");
				System.exit(0); // JVM退出
				break;
			}
		}
	}
}
