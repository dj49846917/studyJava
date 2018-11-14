## 1.方法
    <1>.其实就是完成特定功能的代码块

    <2>.定义格式:
 		修饰符 返回值类型方法名(参数类型 参数名1,参数类型2 参数名2...){
			方法体;
 			return 返回值;
		}

    <3>.格式解释:
 		A: 修饰符		目前记住public static
 		B: 返回值类型		用于限定返回值的数据类型
		C: 方法名		为了方便我们调用的方法的名字
		D: 参数类型	用于限定调用方法时传入的数据的类型
		E： 参数名		用于接收调用方法时传入的数据的数量
		F： 方法体		完成功能的代码
		G： return	结束方法，并且把返回值带给调用者

    <4>.写一个方法有两个明确：
 		A： 返回值类型		明确功能结果的数据类型
		B： 参数列表		明确有几个参数，以及参数的数据结构

    <5>.方法的调用:(有明确返回值的方法调用)
		A： 单独调用，没有意义
 		B: 输出调用，有意义，但是不够好，因为我可能要做进一步操作
 		C： 赋值调用（推荐）
    
    <6>.案例：
		写一个方法求和;
        public class MethodDemo2 {
            public static void main(String[] args) {
                // 输出调用
                sum(10,20);
                
                // 输出调用
                //	System.out.println(sum(10,20));
                
                // 赋值调用
                int c = sum(10,20);
                // 可以继续进行操作
                c +=10;
                System.out.println(c);
            }
            /*求和方法
            * 
            * 两个明确:
            * 		返回值类型: int
            * 		参数列表:int a, int b;
            */
            public static int sum(int a, int b){
                int c = a + b;
                return c;
            }
        }

    <7>. 方法重载:
            在同一类中，出现了方法名相同的情况

        1).特点：
            方法名相同，参数列表不同,与返回值无关。
                A：参数的个数不同
                B：参数对应的数据类型不同
                C：不能出现参数个数相同，参数对应的数据类型也一样，会报错

        2). 注意:
 		    在调用方法的时候，java虚拟机会通过参数列表的不同来区分同名的方法

        3).举例:
            public class MethodDemo {
                public static void main(String[] args) {
                    int a = 10;
                    int b = 20;
                    int c = 30;
                    
                    // int result = sum(a,b,c);  // 输出60
                    int result = sum(a,b); // 输出30
                    System.out.println(result); 
                }

                public static int sum(int a, int b){
                    return a + b;
                }

                public static int sum(int a, int b, int c){
                    return a + b + c;
                }

                // 数据类型不同，参数个数相同的情况
                public static double sum(double a, double b){
                    return a + b;
                }
            }

        <8>.方法的参数如果是基本参数类型，形式参数的改变不影响实际参数
                形式参数:用于接收实际参数的变量
                实际参数:实际参与运算的变量

                举例:
                public class MethodDemo {
                    public static void main(String[] args) {
                        // 实际参数
                        int a = 10;
                        int b = 20;
                        System.out.println("a:" + a + ",b:" + b); // 输出 a:10,b:20
                        change(a, b);
                        System.out.println("a:" + a + ",b:" + b); // 输出a:10,b:20
                    }
                    public static void change(int a, int b){ // 方法旁边的这个int a,int b是形参
                        System.out.println("a:" + a + ",b:" + b); // 输出 a:10,b:20
                        a = b; // a=20
                        b = a + b; // b=40
                        System.out.println("a:" + a + ",b:" + b);// 输出 a:20,b:40
                    }
                }

        <9>.如果参数是引用数据类型：
                形式参数的改变直接影响实际参数

                举例：
                    public class MethodDemo2 {
                        public static void main(String[] args) {
                            int[] arr = {1,2,3,4,5};
                            for(int x=0;x<arr.length;x++){
                                System.out.println(arr[x]); // 输出1,2,3,4,5
                            }
                            change(arr);
                            for(int x=0;x<arr.length;x++){
                                System.out.println(arr[x]); // 输出1,4,3,8,5
                            }
                        }

                        public static void change(int[] arr) {
                            for (int x = 0; x < arr.length; x++) {
                                if(arr[x]%2 ==0){
                                    arr[x] *= 2;
                                }
                            }
                        }
                    }
        
    