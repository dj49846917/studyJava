package myObjectArray;
/*
 * 创建一个学生数组,存储三个学生对象并遍历
 * 
 * 分析:
 * 		A: 定义学生类
 * 		B: 创建学生数组
 * 		C: 创建学生对象
 * 		D: 把学生对象作为元素赋值给学生数组
 * 		E: 遍历学生数组
 */
public class StudentDemo {
	public static void main(String[] args) {
		// 创建学生数组
		Student[] Students = new Student[3];
		// 创建学生对象
		Student s1 = new Student("曹操",40);
		Student s2 = new Student("刘备",35);
		Student s3 = new Student("孙权",30);
		// 赋值
		Students[0] = s1;
		Students[1] = s2;
		Students[2] = s3;
		
		for(int x=0;x<Students.length;x++){
			Student s = Students[x];
//			System.out.println(s);
			System.out.println(s.getName()+"-----"+s.getAge());
		}
	}
	
}
