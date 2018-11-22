package myObjectArray;
/*
 * 自动生成构造方法: 
 * 		代码区域右键 ==> Source ==> Generate Constructors from Superclass...	无参构造方法
 * 		代码区域右键 ==> Source ==> Generate Constructor using Fields...		带参构造方法
 * 
 * 自动生成getXxx()/setXxx()
 * 		代码区域右键 ==> Source ==> Genrate Getters and Setters...		
 */
public class Student {
	private String name;
	private int age;
	
	// 构造方法
	public Student() {}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 成员方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
