public class Student{
    // 定义变量
    private String name;
    private int age;

    public Student(){};
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAgw(int age){
        this.age = age; 
    }

    public int getAge(){
        return age;
    }
}