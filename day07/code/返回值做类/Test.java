/*
    需求： 通过Teacher得到Student对象，然后调用Student类的方法
    如果方法的返回值是类名：其实返回的是该类的对象
*/ 
public class Test{
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = t.getStudent();
        s.study(); // 输出: "好好学习,天天向上";
    }
}