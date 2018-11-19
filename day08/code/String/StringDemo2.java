public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";
        System.out.println("s1:" + s1); // 输出"s1:hello"
        System.out.println("s2:" + s2); // 输出"s2:hello"
        System.out.println("s1==s2" + (s1==s2));// 输出false
        
        String s3 = "hello";
        System.out.println("s2==s3" + (s2==s3));// 输出true
    }
}