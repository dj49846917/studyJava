# Set与map
## 1.Set
        <1>.需求：使用HashSet存储字符串并遍历

        <2>.set集合的特点:
                {1}.无序(存储和读取的顺序有可能不一样)
                {2}.不允许重复(要求元素唯一)
                {3}.没有索引

        <3>.举例:
                public class HashSetDemo {
                    public static void main(String[] args) {
                        // 创建集合对象
                        // HashSet<String> hs = new HashSet<String>();
                        Set<String> set = new HashSet<String>(); // 多态，父接口引用指向子类对象

                        // 添加元素对象
                        set.add("hello");
                        set.add("world");
                        set.add("java");

                        // 遍历集合对象
                        // 方法一：转数组
                //		method(set);
                        
                        // 迭代器
                //		method2(set);
                        
                        // 增强for
                //		foreachMethod(set);
                    }

                    private static void foreachMethod(Set<String> set) {
                        for(String item : set){
                            System.out.println(item);
                        }
                    }

                    private static void method2(Set<String> set) {
                        Iterator<String> it = set.iterator();
                        while(it.hasNext()){
                            String s = it.next();
                            System.out.println(s);
                        }
                    }

                    private static void method(Set<String> set) {
                        Object[] objs = set.toArray();
                        for (int i = 0; i < objs.length; i++) {
                            System.out.println(objs[i]);
                        }
                    }
                }

##  2.HashSet类
        <1>.需求: 使用HashSet存储自定义对象并遍历(结果发现，可以重复添加)

        <2>.具体代码请参考:
                day18/code/HashSetDemo2.java

        <3>.改进代码，实现去重
                具体参考:
                        day18/code/HashSetDemo3.java

##  3.Collections类
        <1>.面试题:Collection和Collections有什么区别?
                {1}.Collection是集合体系的最顶层，包含了集合体系的共性
  		        {2}.Collections是一个工具类(特点:1.不需要创建对象，也不能创建对象。2.方法全是static修饰的),方法都是用于操作Collection的

        <2>.常用方法
            {1}.static int binarySearch(List list, Object key) : 使用二分查找法查找指定元素在指定列表的索引位置
                1).注意:
                        前提数据是有序的，参数只能是List

                2).举例:
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(1);
                        list.add(2);
                        list.add(3);
                        list.add(4);
                        
                        int index = Collections.binarySearch(list, 3);
                        System.out.println(index); // 输出: 2

            {2}.static void copy(List dest, List src): 把源列表中的数据覆盖到目标列表
                1).举例:
                        // 注意: 目标列表的长度至少等于源列表的长度
                        // 创建源列表
                        List<String> src = new ArrayList<String>();
                        src.add("hello");
                        src.add("world");
                        src.add("java");
                        
                        // 创建目标列表
                        
                //		List<String> dest = new ArrayList<String>();
                //		Collections.copy(dest, src); // 运行报错，因为目标列表数据个数必须大于等于源列表的个数
                        
                        List<String> dest = new ArrayList<String>();
                        dest.add("php");
                        dest.add("php");
                        dest.add("php");
                        dest.add("php");
                        Collections.copy(dest, src);
                        System.out.println(dest); // 输出: [hello, world, java, php]

            {3}.static void fill(List list, Object obj): 使用指定的对象填充指定列表的所有元素
                    1).举例:
                            List<String> list = new ArrayList<String>();
                            list.add("hello");
                            list.add("world");
                            list.add("java");
                            System.out.println(list); // 输出: [hello, world, java]
                            
                            Collections.fill(list, "android");
                            System.out.println(list); // 输出: [android, android, android]

            {4}.static void reverse(List list): 反转
                    1).举例:
                            List<Integer> list = new ArrayList<Integer>();
                            list.add(1);
                            list.add(2);
                            list.add(3);
                            list.add(4);
                            Collections.reverse(list);
                            System.out.println(list);

            {5}.static void shuffe(List list): 随机置换
                    1).举例:
                            List<Integer> list = new ArrayList<Integer>();
                            list.add(1);
                            list.add(2);
                            list.add(3);
                            list.add(4);
                            Collections.shuffle(list);
                            System.out.println(list);

            {6}.static void sort(List list): 排序(升序)
                    1).举例:
                            List<Integer> list = new ArrayList<Integer>();
                            list.add(1);
                            list.add(5);
                            list.add(40);
                            list.add(18);
                            list.add(80);
                            list.add(16);
                            Collections.sort(list); 
                            System.out.println(list); // 输出： [1, 5, 16, 18, 40, 80]

            {7}.static void swap(List list, int i, int j): 将指定列表中的两个索引进行位置互换
                    1).举例:
                            List<Integer> list = new ArrayList<Integer>();
                            list.add(1);
                            list.add(4);
                            Collections.swap(list, 0, 1);
                            System.out.println(list);

##  4.练习
		<1>.模拟斗地主发牌
				详细代码请看day18/code/CollectionsTest.java

##  5.Map
		<1>.概念:
				将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值

		<2>.Map和Collections的区别:
				{1}.Map: 是一个双列集合，常用于处理有对应关系的数据，key是不可以重复的，我们也称之为是夫妻对关系
				{2}.Collections: 是单列集合，Collection有不同的子体系，有的允许重复有索引有序，有的不允许重复且无序，我们称之为单身汉集合

##  6.Map的常用API
		<1>.映射功能:
				{1}.V put(K key, V value): 就是将key映射到value,如果key存在，则覆盖value,并将原来的value返回
					
					1).举例:
						Map<String,String> map = new HashMap<String,String>();
						System.out.println(map.put("001", "张三")); // 输出: null
						System.out.println(map.put("002", "李四")); // 输出: null
						System.out.println(map.put("001", "王五")); // 输出: 张三

		<2>.获取功能:
				{1}.V get(Object key): 根据指定的Key返回对应的value
					1).举例:
							System.out.println(map.get("001")); // 输出: 王五
							System.out.println(map.get("006")); // 输出: null

				{2}.int size(): 返回对应关系的个数
					1).举例:
							System.out.println(map.size()); // 输出: 2

		<3>.判断功能:
				{1}.boolean containsKey(Object key): 判断指定的key是否存在
					1).举例:
							System.out.println(map.containsKey("001")); // 输出: true
							System.out.println(map.containsKey("003")); // 输出: false

				{2}.boolean containsValue(Object value): 判断指定的value是否存在
					1).举例:
							System.out.println(map.containsValue("001")); // 输出: false
							System.out.println(map.containsValue("张三")); // 输出: false
							System.out.println(map.containsValue("李四")); // 输出: true

				{3}.boolean isEmpty(): 判断map是否为空
					1).举例:
							System.out.println(map.isEmpty()); // 输出: true

		<4>.删除功能:
				{1}.void clear(): 清空所有的对应关系
					1).举例:
							map.clear();

				{2}.V remove(Object key): 根据指定的key删除对应关系，并返回key所对应的值，如果没有删除成功则返回null;
					1).举例:
							System.out.println(map.remove("001")); // 输出: 王五
							System.out.println(map.remove("005")); // 输出: null

		<5>.遍历功能:
				{1}.Set<Map.Entry<K,V>> entrySet()

				{2}.Set<K> keySet(): 以Set的形式返回所有的key  (key不允许重复，所以返回的是set)
                        1).举例:
                                Set<String> keys = map.keySet();
                                for(String item : keys){
                                    System.out.println(item);
                                }

				{3}.Collection<V> values(): 以Collection的形式返回所有的value (values是允许重复的)
                        1).举例:
                                Collection<String> values = map.values();
                                for(String item : values){
                                    System.out.println(item);
                                }

		<6>.具体代码请参考:
				day18/code/MapDemo2.java
                day18/code/MaoDemo3.java

##  7.map的遍历
        <1>.方式一:
                代码请看:
                    day18/code/MapDemo4.java

        <2>.方式二:
                代码请看:
                    day18/code/MapDemo5.java

        <3>.具体代码如下:
                public class MapDemo6 {
                    public static void main(String[] args) {
                //		method();
                //		method2();
                    }

                    private static void method2() {
                        Map<String,String> map = new HashMap<String,String>();
                        map.put("001", "张三");
                        map.put("002", "李四");
                        map.put("003", "王五");
                        Set<Map.Entry<String, String>> entrys = map.entrySet();
                        for(Map.Entry<String, String> item : entrys){
                            System.out.println(item);
                            String key = item.getKey();
                            String value = item.getValue();
                            System.out.println("学号:" + key + "---" + "姓名:" + value);
                        }
                    }

                    private static void method() {
                        Map<String, String> map = new HashMap<String, String>();
                        map.put("001", "张三");
                        map.put("002", "李四");
                        map.put("003", "王五");
                        Set<String> keys = map.keySet();
                        for (String item : keys) {
                            String value = map.get(item);
                            System.out.println("学号:" + item + "---" + "姓名:" + value);
                        }
                    }
                }

##  8.练习:
        <1>.使用HashMap存储数据并遍历(字符串作为key)
                1).具体代码请参考: 
                        day18/code/HashMapDemo.java

        <2>.使用HashMap存储数据并遍历(自定义对象作为key)
                1).具体代码请参考:
                        day18/code/HashMapDemo2.java

