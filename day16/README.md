#  常用API
##  1. Object.toString 
        <1>.string toString():	返回该对象的字符表示

        <2>.重写的快捷键:
                代码区域右键 ==》 source ==> Generate toString()...

        <3>.举例:
                public class ObjectDemo {
                    public static void main(String[] args) {
                        Student s = new Student();
                        s.name = "张三";
                        s.age = "18";
                        System.out.println(s.toString()); // 输出: com.itheima.Student@3fa5ac
                        System.out.println(s); // 说明默认就是toString()方法
                    }
                }

                class Student extends Object{
                    String name;
                    String age;
                    /* 方法一:
                    public String toString(){
                        return name + "@" + age;
                    }*/
                    // 方法二:
                    @Override
                    public String toString() {
                        return "Student [name=" + name + ", age=" + age + "]";
                    }
                }

##  2. Object.equals
            <1>.boolean equals(Object obj): 使用==来比较两个对象是否相等，则比较地址值是否相等

            <2>.方法重写的快捷键:
                    代码区域右键 ==》 source ==> Generate hashCode() and equals...

            <3>.举例:
                    public class ObjectDemo2 {
                        public static void main(String[] args) {
                            Person p = new Person("张三",18);
                            Person p2 = new Person("张三",18);
                    //		boolean flag = p.equals(p2);
                            
                            boolean flag = p.equals(new ArrayList());
                            System.out.println(flag); // 输出: false  因为对象是比较地址值，new出来的肯定地址值不同
                        }
                    }

                    class Person{
                        String name;
                        int age;
                        public Person(String name, int age) {
                            this.name = name;
                            this.age = age;
                        }
                        
                        @Override
                        public boolean equals(Object obj) {
                            // 提高效率
                            if (this == obj)
                                return true;
                            if (obj == null)
                                return false;
                            // 提高健壮性
                            if (getClass() != obj.getClass())
                                return false;
                            // 向下转型
                            Person other = (Person) obj;
                            if (age != other.age)
                                return false;
                            if (name == null) {
                                if (other.name != null)
                                    return false;
                            } else if (!name.equals(other.name))
                                return false;
                            return true;
                        }
                    }

##  3.System类
        <1>.static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)： 
                复制数组
            
                {1}.举例:
                        /*
                        * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
                        * 复制数组
                        * 参数1: 源数组
                        * 参数2: 源数组的起始索引位置
                        * 参数3: 目标数组
                        * 参数4: 目标数组的起始索引位置 参数5: 指定接收的元素个数
                        */
                        int[] src = { 1, 2, 3, 4, 5 };
                        int[] dest = new int[5];
                        System.arraycopy(src, 0, dest, 0, 5); // 输出: 1,2,3,4,5,
                //		System.arraycopy(src, 2, dest, 0, 3); // 输出: 3,4,5,0,0,
                //		System.arraycopy(src, 2, dest, 2, 3); // 输出: 0,0,3,4,5,

                        for (int i = 0; i < dest.length; i++) {
                            System.out.print(dest[i]);
                        }
        
        <2>.static long currentTimeMillis():
                系统时间(相对于1970-1-1 00:00:00)

                {1}.举例:
                        /*
                        * static long currentTimeMillis()： 以毫秒值返回当前系统时间
                        * 这个毫秒的时间是相对时间，相对于1970-1-1 00:00:00:0
                        * 1970-1-1 00:00:01 : 1000
                        * 1970-1-1 00:01:00 : 1000*60
                        * 1970-1-1 01:00:00 : 1000*60*60
                        * 1000毫秒 = 1秒
                        * 
                        */
                //		System.out.println(System.currentTimeMillis()); // 输出： 1544420979524
                        
                        // 应用: 用来计算所用时间（毫秒数）
                        long start = System.currentTimeMillis();
                        for(int i=0;i<100000;i++){
                            System.out.println(i);
                        }
                        long end = System.currentTimeMillis();
                        System.out.println(end - start);

        <3>.static void exit(int status)：
                终止虚拟机
                
                {1}.举例:
                        // static void exit(int status) : 终止虚拟机
                        for(int i=0;i<100000;i++){
                            if(i==1000){
                                System.exit(0); // 终止
                            }
                        }

        <4>.static void gc()： 
                垃圾回收机制(系统自动调用)

        <5>.具体代码请看:
                day16/code/SystemDemo.java

##  4.Date类
        <1>.Date: 表示特定的瞬间，精确到毫秒，他可以通过方法来设定自己所表示的时间，可以表示任意的时间

            System.currentTimeMills() : 返回的是当前系统时间，1970-1-1至今的毫秒数

        <2>.构造方法:
                {1}.Date() : 创建的是一个表示当前系统时间的Date对象

 		        {2}.Date(long date) : 根据"指定时间"创建Date对象

        <3>.举例:
                public class DateDemo {
                    public static void main(String[] args) {
                        // Date()
                //		Date d = new Date();
                //		System.out.println(d); // 输出: Mon Dec 10 14:33:32 CST 2018
                //		System.out.println(d.toLocaleString()); // 输出: 2018-12-10 14:36:49(过时，不推荐用)
                        
                        
                        // 有参构造: Date(long date)
                //		Date d2 = new Date(1000*60*60*24); // 时区有时差
                //		System.out.println(d2.toLocaleString());
                    }
                }

##  5.Date类的常用用法:
        <1> Date的常用方法
                {1}.毫秒值 =》 Date
                        设置
                        返回值是void,参数long
                        void setTime(long time)
                        Date(long date)
        
                {2}.Date =》毫秒值
                        获取
                        返回long,无参数
                        long getTime()

        <2>.举例:
                public class DateDemo2 {
                    public static void main(String[] args) {
                        // 当前时间
                        Date d = new Date();
                //		d.setTime(1000*60*60);
                        System.out.println(d.toLocaleString()); // 输出: 2018-12-10 14:55:40
                        System.out.println(d.getTime()); // 输出: 1544424940087
                        
                        // 设置时间
                        d.setTime(360000L);
                        System.out.println(d.toLocaleString()); // 输出: 1970-1-1 8:06:00
                        System.out.println(d.getTime()); // 输出: 360000
                    }
                }

##  6.SimpleDateFormat(日期的转换)
        <1>.SimpleDateFormat:
                {1}.格式化:
                    Date => String
                    2049-8-26 => 2049年8月26日	
                    String format(Date date)		
        
                {2}.解析:
                    String => Date
                    "2049-8-26"
                    Date parse(String source)

        <2>.构造方法:
                {1}.SimpleDateFormat(): 使用默认的模式进行对象的构造
                {2}.SimpleDateFormat(String pattern): 使用的指定的模式进行对象的构建

        <3>.注意: Exception in thread "main" java.text.ParseException: Unparseable date: "18年12月9日 下午3:29"： 解析的字符串，模式必须和构建对象的模式一样

        <4>.举例:
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

##  7.Calendar类:
        <1>.Clendar: 日历，提供了一些操作年月日时的方法

        <2>.构造方法：
                static Calendar.getInstance()
            
            举例:
                Calendar c = Calendar.getInstance();

        <3>.获取指定的Calendar日历
                {1}.int get(int field): 返回给定的日历字段的值

                {2}.举例:
                        Calendar c = Calendar.getInstance();
                        int year = c.get(Calendar.YEAR);
                        int month = c.get(Calendar.MONTH);
                        int day = c.get(Calendar.DATE);
                        System.out.println(year); // 输出: 2018
                        System.out.println(month); // 输出: 11
                        System.out.println(day); // 输出: 11

        <4>.添加：
                {1}.void add(int field, int amount): 在指定的字段上加上指定的值

                {2}.举例:
                        Calendar c = Calendar.getInstance();
                        c.add(Calendar.MONTH, 2);
                        int month = c.get(Calendar.MONTH);
                        System.out.println(month); // 输出: 1(月从0开始赋值)

        <5>.修改：
                {1}.void set(int field, int value): 把指定的字段修改成指定的

                {2}.举例:
                        Calendar c = Calendar.getInstance();
                        c.set(Calendar.DATE, 20); // 后面的day输出:20
                        int day = c.get(Calendar.DATE);
                        System.out.println(day); // 输出: 20

        <6>.具体代码请看:
                day16/code/CalendarDemo.java

##  8.Integer类:
        <1>.构造方法:
                Integer(int value)
                Integer(String s)

        <1>.将String转换为int
                {1}.方法1： Integer(int value)

                        举例:
                            String s = "40";
                            Integer i = new Integer(s);
                            int ii = i.intValue();
                            System.out.println(i); // 输出: 40

                {2}.方法2： static int parseInt(String s)

                        举例:
                            String s = "40";
                            int i = Integer.parseInts(s);
                            System.out.println(i); // 输出: 40

        <2>.将int 转换为String
                {1}. 方法一:  Integer(int value)

                        举例:
                            Integer i2 = new Integer(60);
		                    System.out.println(i2.toString()); // 输出: "60"

                {2}.方法二： Static String toString(int i)

                        举例:
                            String i2 = Integer.toString(60);
                            System.out.println(i2); // 输出: "60"

        <3>.具体代码如下:
                public class IntegerDemo {
                    public static void main(String[] args) {
                        // 字符串转换为数字：
                        
                        // 方法1： Integer(int value)
                        Integer i = new Integer("10"); // 将字符串转换为数字
                        System.out.println(i);
                        
                        
                        // 方法2： int intValue()
                        int b = i.intValue();
                        System.out.println(i+b); // 输出：20
                        
                        // 方法3： static int parseInt(String s)
                        int k = Integer.parseInt("40");
                        System.out.println(k); // 输出: 40
                        
                        //--------------------------------
                        // 数字转换为字符串:
                        
                        // 方法1： Integer(int value)
                        Integer i2 = new Integer(60);
                        System.out.println(i2.toString()); // 输出: "60"
                        
                        // 方法2: Static String toString(int i)
                        String ss = Integer.toString(70);
                        System.out.println(ss); // 输出: "70"
                    }
                }

##  8.JDK1.5特性: 自动装箱和拆箱(没什么用)
        详细代码如下:
                public class IntegerDemo2 {
                    public static void main(String[] args) {
                        // Integer i = new Integer(10);
                        
                        // 自动装箱
                        // 相当于: Integer i = new Integer(10);
                        Integer i = 10;
                        
                        //自动拆箱
                        // 相当于: int i = 
                        Integer j = 20;
                        int k = j;
                    }
                }

##  9.正则表达式:
        <1>.需求:
                校验qq号码:
                    要求必须是5-15位
                    0不能开头
                    必须是数字

        <2>.正则表达式: 就是一套规则，可以用于匹配字符串

        <3>.boolean matches(String regex) : 判断当前字符串是否匹配指定的正则表达式，如果匹配则返回true,否则返回false

        <4>.举例:
                public class RegexDemo {
                    public static void main(String[] args) {
                        String qq = "123";
                        /*boolean flag = checkQQ(qq);
                        System.out.println(flag);*/
                        
                        boolean flag = qq.matches("[1-9][0-9]{4,14}");
                        System.out.println(flag);
                    }
                    
                    public static boolean checkQQ(String qq){
                        int length = qq.length();
                        // 要求必须是5-15位
                        if(length<5 || length>15){
                            return false;
                        }
                        
                        // 0不能开头
                        if(qq.startsWith("0")){
                            return false;
                        }
                        
                        // 必须是数字
                        for(int i=0; i<length;i++){
                            // 得到每一个字符
                            char c = qq.charAt(i);
                            if(c<'0'||c>'9'){
                                return false;
                            }
                        }
                        return true;
                    }
                }
