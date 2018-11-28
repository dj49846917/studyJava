import java.util.Scanner;
/*
 * 需求:
 * 		 写出一个4位的随机数,并判断是否正确
 * 
 * 分析:
 * 		A： 创建StringBuilder对象
 * 		B: 循环并获取每一位随机数的下标，并得到每一位的字符
 * 		C: 添加到StringBuilder中
 * 		D: 键盘录入一个数据
 * 		E： 判断
 */
public class RandomDemo {
	public static void main(String[] args) {
		getRandom();
	}

    // 生成验证码
	public static void getRandom() {
		char[] array = { '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		// 创建StringBuilder对象
		StringBuilder sb = new StringBuilder();
		// 循环并获取每一位随机数的下标
		for (int x = 0; x < 4; x++) {
			double i = Math.floor(Math.random()*36);
			int index = new Double(i).intValue(); // 将double转换为int
			// 添加到StringBuilder中
			sb.append(array[index]);
		}
		String code = sb.toString();
		System.out.println(code);
		// 键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数据");
		String value = sc.nextLine();
		if(value.equalsIgnoreCase(code)){
			System.out.println("验证成功");
		}else{
			System.out.println("验证失败");
		}
	}

}
