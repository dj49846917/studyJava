package com.itheima_09;

/*
 * 把数组拼接成一个字符串
 * 举例：
 * 		int[] arr = {1,2,3}
 * 结果:
 * 		[1,2,3]
 */
public class StringBuilderTest{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		String s = toStringArray(arr);
		System.out.println(s);
	}
	
	public static String toStringArray(int[] arr){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int x=0;x<arr.length;x++){
			if(x == (arr.length-1)){
				sb.append(arr[x]);
			}else{
				sb.append(arr[x]).append(",");
			}
		}
		sb.append("]");
		String result = sb.toString();
		return result;
	}
}

//public class StringBuilderTest {
//	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4 };
//
//		String s = toStringArray(arr);
//		System.out.println(s);
//	}
//
//	public static String toStringArray(int[] arr) {
//		String s = "";
//		s += "[";
//		for (int x = 0; x < arr.length; x++) {
//			if (x == arr.length - 1) {
//				s += arr[x];
//			} else {
//				s += arr[x];
//				s += ",";
//			}
//		}
//		s += "]";
//		return s;
//	}
//}
