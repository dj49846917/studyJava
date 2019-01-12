# 网络编程
##  1.InetAddress类
        <1>.InetAddress: 此类表示互联网协议(IP)地址

        <2>.常用方法:
                {1}.static InetAddress getByName(String host): 返回主机名/IP地址
                    1).举例:
                            InetAddress address = InetAddress.getByName("MS-20170215AKCC");
                            System.out.println(address); // 输出: MS-20170215AKCC/192.168.8.106
                            
                            InetAddress address = InetAddress.getByName("192.168.8.106");
                            System.out.println(address); // 输出: /192.168.8.106

                {2}.String getHostName(): 返回主机名
                    1).举例:
                            InetAddress address = InetAddress.getByName("MS-20170215AKCC");
                            String hostname = address.getHostName();
                            System.out.println(hostname); // 返回主机名

                {3}.String getHostAddress(): 返回IP地址
                    1).举例:
                            InetAddress address = InetAddress.getByName("MS-20170215AKCC");
                            String host = address.getHostAddress();
                            System.out.println(host); // 输出: 192.168.8.106

##  2.UDP发送数据
        <1>.步骤:
                {1}.创建发送端Socket对象
                {2}.创建数据并打包
                {3}.发送数据
                {4}.释放资源

        <2>.DatagramSocket： 此类表示用来发送和接收数据，基于UDP的
                {1}.构造方法:
                        DatagramSocket(): 创建Socket对象并随机分配端口号
                        DatagramSocket(int port): 创建Socket对象并制定端口号

        <3>.具体代码如下:
                public class SendDemo {
                    public static void main(String[] args) throws IOException {
                        // 创建发送端Socket对象
                        DatagramSocket ds = new DatagramSocket();
                        // 创建数据
                        String p = "hello world UDP";
                        byte[] bys = p.getBytes(); // 内容
                        int length = bys.length; // 长度
                        InetAddress address = InetAddress.getByName("MS-20170215AKCC"); // 发送给当前设备(地址)
                        System.out.println(address);
                        int port = 8080; // 端口号
                        // 打包
                        DatagramPacket dp = new DatagramPacket(bys, length, address, port);
                        // 发送数据
                        ds.send(dp);
                        // 释放资源
                        ds.close();
                    }
                }

##  4.UDP接收数据
        <1>.步骤:
                {1}.创建接收端Socket对象
                {2}.接收数据
                {3}.解析数据
                {4}.输出数据
                {5}.释放资源

        <2>.具体代码如下:
                public class ReceiveDemo {
                    public static void main(String[] args) throws IOException {
                        // 创建接收端Socket对象
                        DatagramSocket ds = new DatagramSocket(8080);
                        // 接收数据
                        // DatagramPacket(byte[] buf, int length)
                        byte[] bys = new byte[1024];
                        DatagramPacket dp = new DatagramPacket(bys, bys.length);	
                        
                        ds.receive(dp);	// 阻塞
                        
                        // 解析数据
                        // InetAddress getAddress(): 获取发送端的IP对象
                        InetAddress address = dp.getAddress();
                        // byte[] getData()： 获取接收到的数据，也可以直接使用创建包对象时的数组
                        byte[] data = dp.getData();
                        // int getLength()： 获取具体收到数据的长度
                        int length = dp.getLength();
                        
                        // 输出数据
                        System.out.println("sender --->" + address.getHostAddress());
                //		System.out.println(new String(data,0,length));
                        System.out.println(new String(bys,0,length));
                        // 释放资源
                        ds.close();
                    }
                }

##  5.UDP协议发送数据的注意事项:
 		<1>.端口号错了，数据可以正常发出，但是收不到数据
 		<2>.报异常:Exception in thread "main" java.net.BindException: Address already in use: Cannot bind
 			端口号已经被绑定了(不能重复)

##  6.TCP协议发送数据
        <1>.步骤:
                {1}.创建发送端Socket对象(创建连接)
                {2}.获取输出流对象
                {3}.发送数据
                {4}.释放资源

        <2>.具体代码如下:
                public class ClientDemo {
                    public static void main(String[] args) throws IOException, IOException {
                        // 创建发送端Socket对象(创建连接)
                        Socket s = new Socket(InetAddress.getByName("MS-20170215AKCC"), 3000);
                        // 获取输出流对象
                        OutputStream os = s.getOutputStream();
                        // 发送数据
                        String str = "hello, TCP";
                        os.write(str.getBytes());	
                        // 释放资源
                        // os.close();
                        s.close();
                    }
                }

##  7.TCP协议接收数据
        <1>.步骤:
                {1}.创建发送端Socket对象(创建连接)
                {2}.获取输出流对象
                {3}.发送数据
                {4}.释放资源

        <2>.具体代码如下:
                public class ServerDemo {
                    public static void main(String[] args) throws IOException {
                        // 创建接收端Socket对象
                        ServerSocket ss = new ServerSocket(3000);
                        
                        // 监听(阻塞)
                        Socket s = ss.accept();
                        
                        // 获取输入流对象
                        InputStream is = s.getInputStream();
                        
                        // 获取数据
                        byte[] bys = new byte[1024];
                        int len;
                        len = is.read(bys);
                        
                        // 输出数据
                        InetAddress address = s.getInetAddress();
                        System.out.println("clienter-->" + address.getHostName());
                        System.out.println(new String(bys,0,len));
                        
                        // 释放资源
                        s.close();
                //		ss.close();
                    }
                }


