# IO流高级
## 1.File类
        <1>.File: 文件和目录路径名的抽象表示形式，File类的实例是不可变的

        <2>. 构造方法：
                {1}.File(File parent, String child)
                {2}.File(String pathname): 将指定的路径名转换成一个File对象
                {3}.File(String parent, String child): 根据指定的父路径和文件路径创建File对象

        <3>.举例:
                public class FileDemo {
                    public static void main(String[] args) {
                        File(String pathname): 将指定的路径名转换成一个File对象
                        File f = new File("D:\\b.txt");
                        
                        File(String parent, String child): 根据指定的父路径和文件路径创建File对象
                        File f2 = new File("D:\\", "b.txt");
                        
                        File(File parent, String child): 根据指定的父路径对象和文件路径创建File对象
                        File parent = new File("D:\\");
                        // File f3 = new File(parent, "b.txt");
                        File f3 = new File(new File("D:\\"),"b.txt"); // 匿名对象的写法
                    }
                }

## 2.File的常用功能:
        <1>.创建功能:
                {1}.boolean createNewFile(): 当指定文件不存在时，创建文件并返回true,否则返回false
                        1).举例:
                            File f2 = new File("b.txt"); // 相对路径
                            System.out.println(f2.createNewFile());

                {2}.boolean mkdir(): 当指定文件夹不存在时，创建文件夹并返回true,否则返回false
                        1).举例:
                            File f3 = new File("b");
                            System.out.println(f3.mkdir());

                {3}.boolean mkdirs(): 创建指定文件夹，当文件夹所在的目录不存在，则顺道一块儿创建了
                        1).举例:
                            File f4 = new File("c\\d\\e");
                            System.out.println(f4.mkdir()); // 输出: false
                            System.out.println(f4.mkdirs()); // 输出: true

        <2>.删除功能:
                {1}.boolean delete()
                        1).注意: 删除一个文件夹，这个文件夹下面不能有其他的文件或文件夹
                        
                        2).举例:
                            File f4 = new File("c\\d\\e");
                            System.out.println(f4.delete()); // 输出:true

                            File f6 = new File("c");
                            System.out.println(f6.delete()); // 输出:false 因为c有子文件或者子文件夹，不能删除

        <3>.获取功能:
                {1}.File getAbsoluteFile(): 以file对象的形式返回当前file对象所有指向的绝对路径
                        1).举例:
                            File f = new File("d:\\a\\b.txt");
		                    System.out.println(f.getAbsoluteFile()); // 返回的是file对象

                {2}.String getAbsolutePath(): 返回file对象所指向的绝对路径
                        1).举例:
                            File f2 = new File("d:\\a\\b.txt");
		                    System.out.println(f2.getAbsolutePath()); // 返回的是字符串

                {3}.String getName(): 获取文件或文件夹的名称
                        1).举例:
                            File f4 = new File("a.txt");
                            File f5 = new File("d:\\a\\b.txt");
                            File f6 = new File("b");
                    		System.out.println(f4.getName()); // 输出：a.txt
                    		System.out.println(f5.getName()); // 输出: b.txt
                    		System.out.println(f6.getName()); // 输出: b

                {4}.String getParent(): 获取file对象的父路径
                        1).举例:
                            File parent = new File("b");
                            File f3 = new File(parent,"c.txt");
                            if(!parent.exists()){
                                parent.mkdirs();
                            }
                            System.out.println(f3.createNewFile());
                            System.out.println(f3.getParent()); // 返回字符串


                {5}.File getParentFile(): 以对象的形式获取file对象的父路径
                        1).举例:
                            File parent = new File("b");
                            File f3 = new File(parent,"c.txt");
                            if(!parent.exists()){
                                parent.mkdirs();
                            }
                            f3.createNewFile();
                            System.out.println(f3.getParentFile()); // 返回对象
                
                {6}.String getPath(): 获取创建File对象时给的路径
                        1).举例:
                            File f4 = new File("a.txt");
                            File f5 = new File("d:\\a\\b.txt");
                            File f6 = new File("b");
                            System.out.println(f4.getPath()); // 输出: a.txt
                            System.out.println(f5.getPath()); // 输出: d:\a\b.txt
                            System.out.println(f6.getPath()); // 输出: b

                {7}.long lastModified(): 以毫秒值的形式返回最后修改时间
                        1).举例:
                            File f7 = new File("a.txt");
                            f7.createNewFile();
                            System.out.println(f7.lastModified()); // 输出: 1546653657941
                            SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
                            Date d = new Date(f7.lastModified());
                            System.out.println(sdf.format(d)); // 输出: 19-01-05 10:00:57

                {8}.long length(): 返回文件的字节数
                        1).举例:
                            File f8 = new File("b\\c.txt");
                            File f9 = new File("b");
                            System.out.println(f8.length()); // 输出: 5
                            System.out.println(f9.length()); // 输出: 0

                {9}.String List(): 返回当前路劲下所有的文件和文件夹名称
                        1).举例:
                            // 注意: 只有指向文件夹的File对象才可以调用该方法
                            File f = new File("c");
                            String[] files = f.list();
                            for (int i = 0; i < files.length; i++) {
                                System.out.println(files[i]);
                            }
                            
                            File f2 = new File("D:\\大前端学习资料\\01.java基础(共300集左右)\\20 IO流-高级\\20 IO流-高级\\视频\\avi");
                            String[] File = f2.list();
                            for (int i = 0; i < File.length; i++) {
                                System.out.println(File[i]);
                            }

                {10}.File[] listFiles():以对象的形式返回当前路劲下所有的文件和文件夹名称
                        1).举例:
                            File f = new File("c");
                            File f2 = new File("D:\\大前端学习资料\\01.java基础(共300集左右)\\20 IO流-高级\\20 IO流-高级\\视频\\avi");
                            File f3 = new File("a.txt");
                            File[] files = f2.listFiles();
                            for(File item : files){
                                System.out.println(item.getName());
                            }

                {11}.static File[] listRoots(): 以file对象的形式返回盘符
                        1).举例：
                            File[] f = File.listRoots();
                            for(File item : f){
                                System.out.println(item);
                            }

        <4>.判断功能:
                {1}.boolean exits(): 判断文件或者文件夹是否存在，如果存在，返回true,否则返回false
                        {1}.举例:
                                File f = new File("a.txt");
                                System.out.println(f.exists()); // 输出false

                {2}.boolean isAbsolute(): 判断File对象指向的路径是否是绝对路径，如果是则返回true,否则返回false
                        {1}.举例:
                                File f = new File("a.txt");
                                System.out.println(f.isAbsolute()); // 返回:false
                                
                                File f2 = new File("E:\\a\b.txt");
                                System.out.println(f2.isAbsolute()); // 返回: true

                {3}.boolean isDirectory(): 判断File对象指向的路径是否是文件夹，如果是则返回true,否则返回false
                        {1}.举例:
                                File f = new File("a.txt");
                                File f2 = new File("c");
                                System.out.println(f.isDirectory()); // 输出: false
                                System.out.println(f2.isDirectory()); // 输出: true

                {4}.boolean isFile(): 判断File对象指向的路径是否是文件，如果是则返回true,否则返回false
                        {1}.举例:
                                File f = new File("a.txt");
                                File f2 = new File("c");
                                System.out.println(f.isFile()); // 输出: true
                                System.out.println(f2.isFile()); // 输出： false

        <4>.绝对路径: 固定不可改变的路径，以盘符开头
                1).举例:
                    File f = new File("D:\\b.txt"); // 绝对路径
        
        <5>.相对路径: 相对某个参照物，不能以盘符开头
                在eclipse中相对路径相对应当前项目的根目录
                1).举例:
                    File f2 = new File("b.txt"); // 相对路径

##  3.File的练习
        <1>.输出指定目录下的所有java文件名(包含子目录)
                1).详细代码请看: day20/code/FileTest.java

        <2>.删除指定的目录(包含子目录)
                1).详细代码请看: day20/code/FileTest2.java

        <3>.使用字符流复制文本文件
                1).详细代码轻卡： day20/code/FileTest3.java

        <4>.分别使用字符流和字节流复制图片
                1).详细代买请看: day20/code/FileTest4.java

        <5>.使用字节流复制文本文件
                1).详细代码请看: day20/code/FileTest5.java

##  4.IO流的分类
        流向
  				输入流	读取数据	FileReader	Reader
  				输出流	写出数据	FileWriter	Writer
  		数据类型
  				字节流
  						字节输入流		读取数据	InputStream
  						字节输出流		写出数据	OutputStream
  				字符流
 						字符输入流		读取数据	Reader
 						字符输出流		写出数据	Writer	

##  5.字节流的介绍
        <1>分别使用字符流和字节流复制图片
                {1}.二进制文件只能使用字节流进行复制(使用windows自带记事本打开读不懂的)(视频，音频，图片)
                    文本文件的复制即可以使用字符流，也可以使用字节流

                {2}.详细代买请看: day20/code/FileTest4.java

        <2>.使用字节流复制文本文件
                1).详细代码请看: day20/code/FileTest5.java




