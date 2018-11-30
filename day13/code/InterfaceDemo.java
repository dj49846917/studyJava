package com.itheima_01;
/*
 * Java语言的继承是单一继承，一个子类只能有一个父类(一个儿子只能有一个亲爹)
 * Java语言给我们提供了一个机制，用于处理继承单一的局限性的，接口
 * 
 * 接口: 接口是一个比抽象类还要抽象的类，接口里所有的方法全是抽象方法，接口和类的关系是实现，implements
 * interface
 * 
 * 格式:
 * 		interface 接口名{
 * 
 * 		}
 * 
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		BillGates gates = new BillGates();
		gates.code(); // 输出: "写代码"
		gates.manage(); // 输出: "管理公司"
	}
}

/*class Boss{
	public void manage(){
		System.out.println("管理公司");
	}
}

class Programmer{
	public void code(){
		System.out.println("写代码");
	}
}
// 比尔盖茨既写代码又管理公司用继承就无法实现
class BillGates extends Programmer {}*/

interface Work{ // 接口
	public abstract void manage();
	public abstract void code();
}

class BillGates implements Work{

	@Override
	public void manage() {
		System.out.println("管理公司");
	}

	@Override
	public void code() {
		System.out.println("写代码");
    }
}