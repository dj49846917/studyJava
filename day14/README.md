# 包
##  1.包的特点:
        <1>.可以有多层

        <2>.不同包下的文件名可以重复

        <3>.包的声明必须是一行代码

##  2.不同包之间的相互访问
        <1>.不同包之间的互相访问
                {1}.使用类的全名
                {2}.使用关键字import将类导入

        <2>.注意: *代表的是通配符，代表导入了这个包下所有的类，并没有导入子包下的类

        <3>.类的全名： 包名.全名

        <4>.举例:
                package com.itheima_01;
                import java.util.ArrayList;
                public class PackageDemo2 {
                    public static void main(String[] args) {
                        // 相同包下的类可以直接访问，不需要做其他操作
                //		PackageDemo pd = new PackageDemo();
                        
                        ArrayList al = new ArrayList();
                    }
                }

##  3. 权限修饰符
        <1>. 权限修饰符:
                {1}.public	
                        当前类，相同包下不同的类，不同包下的类

                {2}.default		
                        当前类，相同包下不同的类

                {3}.private		
                        当前类，相同包下不同的类

                {4}.protected	
                        当前类，相同包下不同的类

        <2>.default:当前包下使用
            protected:让子类对象使用

        <3>.举例:
                day14/code/包与修饰符

##  4.修饰类:(y:yes)

                    类              成员变量                成员方法                构造方法
public              Y                   Y                       Y                   Y           
default             Y                   Y                       Y                   Y
protected                               Y                       Y                   Y
private                                 Y                       Y                   Y
abstract            Y                                           Y
static                                  Y                       Y
final               Y                   Y                       Y                   

常见规则:
        <1>.以后我们使用public来修饰类，如果一个文件有多个类，类名和文件名一样的类名，必须用public修饰，其他的类不能使用public修饰 

        <2>.以后所有的成员变量都是用private修饰

        <3>.以后所有的方法使用public修饰

        <4>.以后所有的构造方法public修饰