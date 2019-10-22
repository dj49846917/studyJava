## Redis
1. 概念： redis是一款高性能的NOSQL系列的关系型数据库    
  <1>. NOSQL和关系型数据库比较   
    * **优点：**   
      1). 成本：   
        nosql数据库简单易部署，基本都是开源软件，不需要像使用oracle那样花费大量成本购买使用，相比关系型数据库价格便宜。   
      
      2). 查询速度：
        nosql数据库将数据存储于缓存之中，关系型数据库将数据存储在硬盘中，自然查询速度远不及nosql数据库。

      3). 存储数据的格式：
        nosql的存储格式是key,value形式、文档形式、图片形式等等，所以可以存储基础类型以及对象或者是集合等各种格式，而数据库则只支持基础类型。

      4). 扩展性：
        关系型数据库有类似join这样的多表查询机制导致扩展很困难。

    * **缺点：**
      1). 维护的工具和资料有限，因为nosql是属于新的技术，不能和关系型数据库10几年的技术同日而语。

      2). 不提供对sql的支持，如果不支持sql这样的工业标准，将产生一定用户的学习和使用成本

      3). 不提供关系型数据库对事务的处理
 
  <2>. 什么是Redis   
  * Redis是用C语言开发的一个开源的高性能键值对(key-value)数据库，官方提供测试数据，50个并发执行100000个，读的速度是110000次/s,写的速度是81000次/s，且Redis通过提供多种键值数据类型来适应不同场景下的存储需求，目前为值Redis支持的键值数据类型如下：  
      1). **字符串类型  string**   
      2). **哈希类型  hash**   
      3). **列表类型  list**   
      4). **集合类型  set**   
      5). **有序集合类型  sortedset**

  * redis的应用场景   
    1). 缓存(数据查询、短连接、新词内容、商品内容等)   
    2). 聊天室的在线好友列表   
    3). 任务队列(秒杀、抢购、12306等等)   
    4). 应用排行榜   
    5). 网站访问统计   
    6). 数据过期处理(可以精确到毫秒)   
    7). 分布式集群架构中的session分离    

2. 下载安装   
  <1>. 官网：https://redis.io   
  <2>. 中文网：http://www.redis.net.cn   
  <3>. 解压直接可以使用：
    * **redis.windows.conf: 配置文件**
    * **redis-cli.exe: redis的客户端**
    * **redis-server.exe: redis服务器端**

   <4>. **注意：如果启动的时候闪退，在redis文件当前路径下cmd，输入redis-server redis.windows.conf --maxmemory 600m**

3. 命令操作  
  <1>. redis的数据结构：      
    * redis存储的是：key,value格式的数据，其中key都是字符串，value有5种不同的数据结构
      * **value的数据结构：**   
        1). **字符串类型  string: string格式**   
        2). **哈希类型  hash: map格式**   
        3). **列表类型  list：linkedlist格式，支持重复元素**   
        4). **集合类型  set：不允许重复元素**   
        5). **有序集合类型  sortedset：不允许重复元素，且元素有顺序**

   <2>. 字符串类型：string   
    * **存储：set key value** 
      ```
        127.0.0.1:6379> set age 23
        OK
      ```

    * **获取：get key**
      ```
        127.0.0.1:6379> get age
        "23"
      ```

    * **删除：del key**
      ``` 
        127.0.0.1:6379> del age
        (integer) 1
      ```

   <3>. **哈希类型hash**
    * **存储：hset key field value**
      ```
        127.0.0.1:6379> hset myhash username lisi
        (integer) 1
        127.0.0.1:6379> hset myhash password 123456
        (integer) 1
      ```

    * **获取：**
      * **hget key field: 获取指定的field对应的值**
        ```
          127.0.0.1:6379> hget myhash username
          "lisi"
        ```

      * **hgetall key: 获取所有的field和value**
        ```
          127.0.0.1:6379> hgetall myhash
          1) "username"
          2) "lisi"
        ```

    * **删除：hdel key field**
        ```
          127.0.0.1:6379> hdel myhash username
          (integer) 1
        ```
    
   <4>. 列表类型 list：可以添加一个元素到列表的头部(左边)或者尾部(右边)
    * **存储：**
      * **lpush key value: 将元素加入列表左边**
        ```
          127.0.0.1:6379> lpush mylist a
          (integer) 1
        ```

      * **rpush key value: 将元素加入列表右边**
        ```
          127.0.0.1:6379> rpush mylist c
          (integer) 3
        ```

    * **获取：**
      * **lrange key start end: 返回获取**
        ```
          127.0.0.1:6379> lrange mylist 0 -1
          1) "b"
          2) "a"
          3) "c"
        ```

    * **删除：**
      * **lpop key: 删除列表最左边的元素，并将元素返回**
        ```
          127.0.0.1:6379> lpop mylist
          "b"
          127.0.0.1:6379> lrange mylist 0 -1
          1) "a"
          2) "c"
        ```

      * **rpop key: 删除列表最右边的元素，并将元素返回**
        ```
          127.0.0.1:6379> rpop mylist
          "c"
          127.0.0.1:6379> lrange mylist 0 -1
          1) "a"
        ```

   <5>. 集合类型 set: 不允许重复元素
    * **存储：sadd key value**
      ```
        127.0.0.1:6379> sadd myset a
        (integer) 1
        127.0.0.1:6379> sadd myset a
        (integer) 0
        127.0.0.1:6379> sadd myset b c d
        (integer) 3
      ```

    * **获取：smembers key: 获取set集合中所有元素**
      ```
        127.0.0.1:6379> smembers myset
        1) "b"
        2) "d"
        3) "a"
        4) "c"
      ```

    * **删除：srem key value：删除集合中的某个元素**
      ```
        127.0.0.1:6379> srem myset a
        (integer) 1
        127.0.0.1:6379> smembers myset
        1) "b"
        2) "d"
        3) "c"
      ```

   <6>. 有序集合类型sortedset：不允许重复元素，且元素有顺序
    * **存储：zadd key score value**
      ```
        127.0.0.1:6379> zadd mysort 01 zhangsan
        (integer) 1
        127.0.0.1:6379> zadd mysort 02 lisi
        (integer) 1
        127.0.0.1:6379> zadd mysort 03 wangwu
        (integer) 1
      ```

    * **获取：zrange key start end**
      ```
        127.0.0.1:6379> zrange mysort 0 -1
        1) "zhangsan"
        2) "lisi"
        3) "wangwu"
        127.0.0.1:6379> zrange mysort 0 -1 withscores
        1) "zhangsan"
        2) "1"
        3) "lisi"
        4) "2"
        5) "wangwu"
        6) "3"
      ```

    * **删除：zrem key value**
      ```
        127.0.0.1:6379> zrem mysort lisi
        (integer) 1
        127.0.0.1:6379> zrange mysort 0 -1
        1) "zhangsan"
        2) "wangwu"
      ```

   <7>. 通用命令
    * keys *：查询所有的键
      ```
        127.0.0.1:6379> keys *
        1) "myhash"
        2) "username"
        3) "mylist"
        4) "myset"
        5) "mysort"
      ```

    * type key: 获取键对应的value的类型
      ```
        127.0.0.1:6379> type mylist
        list
      ```

    * del key: 删除指定的key value
      ```
        127.0.0.1:6379> del mylist
        (integer) 1

        127.0.0.1:6379> keys *
        1) "myhash"
        2) "username"
        3) "myset"
        4) "mysort"
      ```

4. 持久化  
  * redis是一个内存数据库，当redis服务器重启，获取电脑重启，数据会丢失，我们可以将redis内存中的数据持久化保存到硬盘的文件中。 

  * redis持久化机制：   
    <1>. RDB: 默认方式，不需要进行配置，默认就使用这种机制
      * 在一定的间隔时间中，检测key的变化情况，然后持久化数据   
        1). 编辑redis.windows.conf文件   
          ```
            #   after 900 sec (15 min) if at least 1 key changed
            save 900 1
            #   after 300 sec (5 min) if at least 10 keys changed
            save 300 10
            #   after 60 sec if at least 10000 keys changed
            save 60 10000
          ```

        2). 重启redis服务器，并指定配置文件名称
          * **redis-server redis.windows.conf --maxmemory 600m**

    <2>. AOF: 日志记录的方式，可以记录每一条命令的操作，可以每一次命令操作后，持久化数据   
      * 编辑redis.windows.conf文件
        ```
          appendonly no (关闭aof) --> appendonly yes (开启aof)

          # appendfsync always  : 每一次操作都进行持久化
          appendfsync everysec  : 每隔一秒进行一次持久化
          # appendfsync no      : 不进行持久化
        ``` 


## java客户端：Jedis
  * Jedis: 一款java制作redis数据库的工具
  * 使用步骤：
    1. 下载jedis的jar包
    2. 使用步骤：   
      <1>. 下载jedis的jar包   
      <2>. 使用
        ```
        // 1. 获取连接
        Jedis jedis = new Jedis("localhost", 6379);
        // 2. 操作
        jedis.set("username", "zhangsan");
        // 3. 关闭连接
        jedis.close();
        ```

  * **Jedis操作各种redis中的数据结构**
    1. **字符串类型  string** 
      ```
        set
        get
      ```
    2. **哈希类型  hash: map格式**  
      ```
        hset
        hget
        hgetAll
      ```
    3. **列表类型  list：linkedlist格式，支持重复元素**   
      ```
        lpush / rpush
        lpop / rpop
        lrange start end
      ```
    4. **集合类型  set：不允许重复元素**  
      ```
        sadd
        smembers
      ``` 
    5. **有序集合类型  sortedset：不允许重复元素，且元素有顺序**
      ```
        zadd
      ```

    6. 详细代码请看：studyJava\Redis\code\jedisTest.java


# jedis连接池：JedisPool
  * 使用：
    1. 创建JedisPool连接池对象
    2. 调用方法：getResource()方法获取Jedis连接
    3. 详细代码请看：studyJava\Redis\code\jedis工具类