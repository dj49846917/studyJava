## 1.面向对象
    <1>.概念：
        面向对象思想就是不断的创建对象，使用对象，指挥对象做事情。（如果有对象，直接用对象，对我们直接提供服务）

    <2>.特点:
        是一种更符合我们思想习惯的思想(懒人思想，我把事情自己不做，交给别人去做)
        可以将复杂的事情简单化（对使用者来说简单了，对象里面还是很复杂的）
        将我们从执行者变成了指挥者角色发生了转换

    <3>.举例:
            买电脑：
                面向过程：我要买电脑--我要明确买电脑的意义--上网查对应的参数信息--去中关村买电脑--讨价还价--买回电脑
                面向对象：我要买电脑--班长去给我买电脑--买回电脑
            洗衣服：
                面向过程：把衣服脱下来--找一个盆--放点洗衣粉--加点水--浸泡10分钟--揉一揉--清洗衣服--拧干--晾起来
                面向对象：把衣服脱下来--打开全自动洗衣机--扔衣服--按钮--晾起来

## 2.类
    <1>.概念：
        类:是一组相关的属性和行为的集合
        对象: 就是该事物的具体体现

    <2>.举例:
            类          学生
            对象        班长

    <3>.定义:
            类是用来描述现实世界的事物的

    <4>. 事物:
            属性	事物的描述信息
            行为	事物能够做什么

    <5>.类是如何和事物进行对应的呢？
            类:
                成员变量
                成员方法

    <6>.举例: 写一个学生类
            1).学生事物:
                属性: 姓名,年龄...
                行为: 学习,吃饭

            2).学生类:
                成员变量: 姓名,年龄
                成员方法: 学习,吃饭

            3).成员变量:和我们前面学习过的变量的定义是一样的
                位置不同: 类中，方法外
                初始化值: 不需要给初始值

            4).成员方法: 和我们前面学习过的方法的定义是一样的
 		        去掉static关键字

            5).举例:
                public class Student {
                    // 成员变量
                    // 姓名
                    String name;
                    // 年龄
                    int age;
                    
                    // 成员方法
                    // 学习的方法
                    public void study(){
                        System.out.println("好好学习,天天向上");
                    }
                    // 吃饭的方法
                    public void eat(){
                        System.out.println("学习饿了要吃饭");
                    }
                }

            6).如何创建对象？
		        格式: 类名 对象名 = new 类名()

            7).对象如何访问成员呢？
                    成员变量: 对象名.变量名
                    成员方法: 对象名.方法名(...)

            8).调用Student类
                public class StudentDemo {
                    public static void main(String[] args) {
                        // 格式: 类名 对象名 = new 类名()
                        Student st = new Student();
                //		System.out.println(st); // 输出com.itheima2.Student@19bb25a
                        
                        System.out.println("姓名:" + st.name);
                        System.out.println("年龄:" + st.age);
                        
                        // 给成员变量赋值
                        st.name = "哥哥";

                        // 再次输出
                        System.out.println(st.name)
                    }
                }
        
        <7>.成员变量与局部变量的区别:
                {1}: 在类中的位置不同
                        成员变量: 类中,方法外
                        局部变量: 方法中或者方法声明上(形式参数)

                {2}: 在内存中的位置不同
                        成员变量: 堆内存
                        局部变量: 栈内存		
        
                {3}: 生命周期不同
                        成员变量: 随着对象的创建而存在,随着对象的消失而消失
                        局部变量: 随着方法的调用而存在,随着方法的调用完毕而消失
        
                {4}: 初始化值的问题
                        成员变量: 有默认值
                        局部变量: 没有默认值。必须先定义,赋值，最后再使用

                {5}: 举例:
                        public class Variable {
                            int x; // 成员变量
                            
                            public void study(){
                                int y; // 局部变量(错误，必须赋值)
                                System.out.println(x);
                        //		System.out.println(y); // 局部变量没有赋值，会报错
                            }
                        }

        <8>.私有变量：private
                {1}.private:
                    是一个修饰符
                    可以修饰成员变量，也可以修饰成员方法
                    被private修饰的成员只能在本类中被访问

                {2}.针对private修饰的成员变量，我们会相应的提供getxxx()和setxxx()用于获取和设置成员变量的值，方法用public修饰

                {3}.举例:
                        Student.java

                        public class Student{
                            String name;
                            private int age;

                            public void setAge(int a){ // 这样写就可以在设置时做校验
                                if(a<0 || a>=200){
                                    System.out.println("输入年龄有误");
                                }else{
                                    age = a;
                                }
                            }
                            
                            public int getAge(){
                                return age;
                            }
                            
                            public void show(){
                                System.out.println("姓名是:" + name + ",年龄是:" + age);
                            }
                        }

                        StudentDemo.java

                        public class StudentDemo{
                            public static void main(String[] args){
                                s.show() // 输出：  姓名是:null,年龄是0
                                
                                s.name = "张国荣";
                                s.age = 18; // 报错
                                s.setAge(-18); 
                                s.show(); // 输出：   姓名是:张国荣,年龄是0

                                s.setAge(20);
                                s.show(); // 输出：   姓名是:张国荣,年龄是20
                            }
                        }

## 3.this: 
        代表所在类的对象引用
        方法被哪个对象调用,this就代表那个对象

        举例:
                Student.java

                public class Student {
                    private String name;
                    private int age;
                    
                    public void setName(String name){
                        this.name = name;
                    }
                    
                    public String getName(){
                        return name;
                    }
                    
                    public void setAge(int age){
                        this.age = age;
                    }
                    
                    public int getAge(){
                        return age;
                    }	
                }

                StudentDemo.java

                public class StudentDemo {
                    public static void main(String[] args) {
                        Student s = new Student();
                        System.out.println(s.getName() +"-------" +s.getAge());
                        s.setName("张国荣");
                        s.setAge(20);
                        System.out.println(s.getName() +"-------" +s.getAge());
                    }
                }

## 4.构造方法
        <1>.构造方法:
     		    给对象的数据进行初始化

        <2>.格式:
                方法名和类名相同
                没有返回类型,连void都不能写
                没有具体的返回值

        <3>.举例:
                Student.java
                
                public class Student {
                    public Student(){
                        System.out.println("这是构造方法");
                    }
                }

                StudentDemo.java

                public class StudentDemo {
                    public static void main(String[] args) {
                        // 如何调用构造方法呢？
                        // 通过new 关键字
                        // 格式: 类名 对象名 = new 构造方法(...)
                        
                        Student s = new Student();
                    }
                }

        <4>.构造方法注意事项:
                {1}: 如果我们没有给出构造方法，系统将会提供一个默认的无参构造方法给我们使用
                
                {2}: 如果我们给出了构造方法,系统将不再提供默认的无参构造方法给我们使用
                    这个时候,如果我们想使用无参构造方法，就必须自己提供
                    推荐: 自己给无参构造方法

                {3}.成员变量赋值:
                        [1]: setXxx()方法
                        [2]: 带参构造函数

                {4}.举例:
                        Student.java

                        public class Student {
                            // 注释了，在Student.java里不会报错，因为系统会提供一个
                            /*
                            * public Student(){ System.out.println("这是构造方法"); }
                            */

                            private String name;
                            private int age;

                            // public Student(){}

                            public Student(String name) {
                                this.name = name;
                            }

                            public Student(int age) {
                                this.age = age;
                            }

                            public Student(String name, int age) {
                                this.name = name;
                                this.age = age;
                            }

                            public void show() {
                                System.out.println(this.name + "-------" + this.age);
                            }
                        }

                        StudentDemo.java

                        public class StudentDemo {
                            public static void main(String[] args) {
                                // 如何调用构造方法呢？
                                // 通过new 关键字
                                // 格式: 类名 对象名 = new 构造方法(...)
                                
                                Student s = new Student("哥哥",20); // 输出: 哥哥 20
                                Student s = new Student("哥哥"); // 输出: 哥哥 0
                                Student s = new Student(20); // 输出: null 0
                                s.show();
                            }
                        }

            <5>.类名作为形式参数：其实这里需要的是该类对象。
                    详细代码请看: day07/code/对象做形参

            <6>.如果方法的返回值是类名：其实返回的是该类的对象
                    详细代码请看: day07/code/返回值做类





