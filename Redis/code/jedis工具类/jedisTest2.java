package cn.itcust.jedis.test;
import cn.itcust.jedis.utils.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class jedisTest2 {
    /**
     * jedis连接池使用
     *
     */
    @Test
    public void test() {

        // 0. 创建一个配置对象
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        config.setMaxIdle(10);

        // 1. 创建Jedis连接池对象
        JedisPool jedisPool = new JedisPool(config, "localhost", 6379);

        // 2. 获取连接
        Jedis resource = jedisPool.getResource();

        // 3. 使用
        resource.set("hehe", "haha");
        String hehe = resource.get("hehe");
        System.out.println(hehe);
        // 4. 关闭 归还到连接池中
        resource.close();
    }

    /**
     * jedis连接池工具类使用
     *
     */
    @Test
    public void test2() {
        // 通过连接池工具类获取
        Jedis jedis = JedisPoolUtils.getJedis();

        // 使用
        jedis.set("user", "zhaowu");
        System.out.println(jedis.get("user"));

        // 4. 关闭 归还到连接池中
        jedis.close();
    }
}

