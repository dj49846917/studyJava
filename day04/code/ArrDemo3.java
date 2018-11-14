public class ArrDemo {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		// 访问数组元素
//		System.out.println(arr[3]); // 报错
		
		// 引用类型: 类、接口、数组
		// 常量: 空常量,null,是可以赋值给引用类型的
		arr = null;
		System.out.println(arr[1]);
	}
}