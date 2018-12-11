public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
//		默认格式化日期
//		method();
		
		// 日期格式化自定义方法
//		method2();
		
		// 使用指定的模式进行对象的构建
		method3();
	}

	private static void method3() throws ParseException {
		// 1999年9月1日 10:10:10 
		// 简单记就是:4个小姨(yyyy)2个大美眉(MM)2个小弟弟(dd);
		
		// 格式化
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date d = new Date();
		System.out.println(sdf.format(d)); // 输出:2018年12月11日 12:05:23
		
		// 解析
		Date date = sdf.parse("2018年12月11日 12:05:23");
		System.out.println(date);
	}

	private static void method2() throws ParseException {
		// 使用指定的模式进行对象的构建
		
		// 1990年9月9日
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		// 格式化
		Date date = new Date();
		String s = sdf.format(date);
		System.out.println(s); // 输出: "2018年12月10日"
		
		// 解析
		Date d = sdf.parse("2018年1月1日");
		System.out.println(d.toLocaleString()); // 输出: 2018-1-1 0:00:00
	}

	private static void method() throws ParseException {
		// 使用默认模式进行对象的构建
		SimpleDateFormat sdf = new SimpleDateFormat();
		// 创建日期对象
		Date d = new Date();
		
		// 格式化 把日期对象转换为字符串
		String s = sdf.format(d);
		System.out.println(s); // 输出: 18-12-10 下午3:29
		
		// 解析  把字符串转换成日期对象
//		Date date = sdf.parse("18年12月9日 下午3:29"); // 报错
		Date date = sdf.parse("18-12-10 下午3:29");
		System.out.println(date.toLocaleString()); // 输出: 2018-12-9 15:29:00
	}
}