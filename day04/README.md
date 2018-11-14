## 1. 随机数(Random)
    <1>.作用:
        用于产生一个随机数

    <2>.使用步骤:
        1).导包
            import java.util.Random;

        2).创建对象
            Random r = new Random()

        3).获取随机数
            int number = r.nextInt();
            注意：
                产生的数据在0到10之间，包括0，不包括10
                括号里面的10是可以变化的，如果是100，就是0-100之间的数据
            
        4).举例:
            package com.itheima;
            import java.util.Random;

            public class RandomDemo{
                public static void main (String[] args){
                    Random r = new Random();
                    int number = r.nextInt();
                    System.out.println(number);
                }
            }

        练习: 参考day04里面的RandomTest.java

## 2.数组
    <1>.概念:
        存储同一种数据类型的多个元素的容器

    <2>.定义格式:
        {1}.数据类型[] 数组名; (推荐的方式)
                    int[] arr;  // 定义了一个int 类型的数组，数组名是arr;

        {2}.数据类型数组名[];
                    int arr[];  // 定义了一个int类型的变量, 变量名是arr数组;
        
        {3}.举例：
            public class ArrDemo {
                public static void main(String[] args) {
                    // 数据类型[] 数组名 = new 数据类型[数组长度]
                    int[] arr = new int[3];
                    System.out.println(arr); // 输出[I@1774b9b
                    System.out.println(arr[0]); // 输出0
                    
                    arr[0] = 100;// 赋值
                    System.out.println(arr[0]); // 输出100
                }
            }

    <3>.静态初始化的格式:
        {1}.数据类型[] 数组名  = new 数据类型[]{元素1,元素2,元素3...}
            举例:
                int[] arr = new int[]{元素1,元素2,元素3,...}
  		
 		{2}.简化格式:
  			数据类型[] 数组名 = {元素1,元素2,元素3....}
  			int[] arr = {1,2,3}

    <4>.两个常见小问题
        {1}. ArrayIndexOutOfBoundsException： 数组索引越界异常
                产生原因: 我们访问了不存在的索引

        {2}. NullPointerException： 空指针异常
                产生原因: 数组已经不在指向堆内存的数据了，你还使用数组名取访问元素

        {3}.举例：
            public class ArrDemo {
                public static void main(String[] args) {
                    int[] arr = {1,2,3};
                    
                    // 访问数组元素
                    // System.out.println(arr[3]); // 报错
                    
                    // 引用类型: 类、接口、数组
                    // 常量: 空常量,null,是可以赋值给引用类型的
                    arr = null;
                    System.out.println(arr[1]); // 报错
                }
            }

    <5>.数组遍历
        {1}. 举例：
                package com.itheima4;
                public class ArrTest {
                    public static void main(String[] args) {
                        // 定义一个数组
                        int[] arr = { 11, 22, 33, 44, 55 };
                        for (int x = 0; x < arr.length; x++) {
                            System.out.println(arr[x]);
                        }
                    }
                }

        {2}.练习:
                找到数组中的最大值 int[] arr = {1, 34, 65, 23, 67, 80};
                public class ArrTest5{
                    public static void main(String[] args){
                        // 定义数组
                        int[] arr = {1, 34, 65, 23, 67, 80};

                        // 定义参照物
                        int max = arr[0];
                        for(int x = 1; x < arr.length; x++){
                            if (arr[x] > max) {
                                max = arr[x]
                            }
                        }
                        System.out.println(max)
                    }
                }

    <6>.二维数组
        1).概念: 其实就是元素为一维数组的数组

        2).定义格式:
    		A: 数据类型[][] 数组名;(推荐的方式);

        3).初始化：
            A: 动态初始化:
  				数据类型[][] 数组名 = new [m][n];
  				m: 二维数组中一维数组的个数
 				n: 表示的是一维数组中的元素个数
 
            B： 静态初始化:
                    数据类型[][] 数组名 = new 数据类型[][]{{元素...},{},{},...}
                    简化:
                        数据类型[][] 数组名 = {{元素...},{},{},...}

        4).举例:
            public class ArrDemo {
                public static void main(String[] args) {
                    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
                    
                    System.out.println(arr); // 输出[[I@1774b9b
                    System.out.println(arr[0]); // 输出[I@3fa5ac
                    System.out.println(arr[0][0]); // 输出1
                    System.out.println(arr[1][1]); // 输出5
                }
            }
        
        5).遍历：
            public class ArrDemo2 {
                public static void main(String[] args) {
                    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
                    for (int x = 0; x < arr.length; x++) {
                        System.out.println("第一级:" + arr[x]);
                        for (int y = 0; y < arr[x].length; y++) {
                            System.out.println("第二级:" + arr[x][y]);
                        }
                    }
                }
            }

    


## 3.JAVA中的内存分配
    <1>.栈：
            存储局部变量
                局部变量就是定义在方法中的变量
                使用完毕后立即回收

    <2>.堆：
            存储new出来的东西(及对象)
                {1}.每一个对象都有地址值
                {2}.每一个对象的数据都有默认值
                    [1].byte,short,int,long : 0
                    [2].float,double : 0.0
                    [3].char : '\u000'
                    [4].boolean : false
                    [5].引用类型 : null
                {3}.使用完毕后，会在垃圾回收器空闲的时候回收
    <3>.方法区
    <4>.本地方法区:
            和系统相关
    <5>.寄存器:
            给CPU使用
           
            
            