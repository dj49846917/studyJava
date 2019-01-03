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
                {1}.File getAbsoluteFile()
                {2}.String getAbsolutePath()
                {3}.String getName()
                {4}.String getParent()
                {5}.File getParentFile()
                {6}.String getPath()
                {7}.long lastModified()
                {8}.long length()

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
