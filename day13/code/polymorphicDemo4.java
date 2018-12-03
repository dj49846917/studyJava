package com.itheima_01;
/*
 * 多态的优缺点:
 * 		优点： 可以提高可维护性(多态前提所保证的)，提高代码的可扩展性		
 * 
 * 		缺点: 无法直接访问子类持有的成员(只能通过向下转型，强制转换)
 * 
 */
public class polymorphicDemo4 {
	public static void main(String[] args) {
		MiFactory factory = new MiFactory();
		factory.createPhone(new MiNote()); // 输出："打电话"
		factory.createPhone(new RedMi());
	}
}

class MiFactory {
	/*public void createPhone(MiNote mi){
		mi.call();
	}
	
	public void createPhone(RedMi mi){
		mi.call();
	}*/
	public void createPhone(Phone p){
		p.call();
	}
}

interface Phone{
	public abstract void call();
}

// 小米note
class MiNote implements Phone{
	public void call(){
		System.out.println("小米note打电话");
	}
}

// 红米打电话
class RedMi implements Phone{
	public void call(){
		System.out.println("红米打电话");
	}
}

