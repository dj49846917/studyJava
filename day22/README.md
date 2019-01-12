# 多线程
## 1. 多线程的概述
        进程: 当前正在运行的程序，一个应用程序在内存中的执行区域
        线程: 进程中的一个执行控制单元，执行路径

        一个进程可以有一个线程，也可以有多个线程
        
        特点:
            单线程: 安全性高，效率低
            多线程: 安全性低，效率高

        多线程案例:360,迅雷等

##  2.实现多线程的方式：
        <1>.主方法是单线程，但是可以创建多线程

        <2>.方式1: 
                一种方法是将类声明为Thread的子类。该子类应重写Thread的run方法。接下来可以分配并启动该子类的实例

                {1}.Thread
                        String getName(): 返回该线程的名称
                        void setName(String name):  改变线程名称，使之与参数名相同 

                {2}.详细代码请看：
                        day22/code/线程的实现方式1

        <3>.方式2:
                声明实现 Runnable 接口的类。该类然后实现 run 方法。然后可以分配该类的实例，在创建 Thread 时作为一个参数来传递并启动

                {1}.Thread (Runnable target)
                        static Thread currentThread(): 返回当前线程对象

                {2}.详细代码请看:
                        day22/code/线程的实现方式2

        <4>.既然有了继承Thread为何还要整出来实现Runnable？ 
         		因为继承具有单一性，如果一个类继承了thread，就不能继承其他类了

##  3.练习： 模拟出售火车票
        <1>. static void sleep(long millis): 让当前线程睡一会儿

        <2>.详细代码请看:
                day22/code/线程练习

##  4.同步方法
        <1>.同步方法:
                使用关键字synchronized修饰的方法，一旦被一个线程访问，则整个方法全部锁住，其他线程则无法访问

        <2>.注意:	
                {1}.非静态同步方法的锁对象是this
                    1).详细代码请看:
                            day22/code/SynchronizedDemo.java

                {2}.静态同步方法的锁对象是当前类的字节码对象
                     1).详细代码请看:
                            day22/code/SynchronizedDemo2.java

##  5.线程的生命周期
        <1>.新建 ==> 就绪 ==> 运行 ==> 死亡

        <2>.详细请看:
![线程生命周期](https://raw.githubusercontent.com/dj49846917/studyJava/master/day22/%E8%A7%A3%E9%87%8A%E5%9B%BE/lif2.png)              

        

        