package cn.itcust.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 定义sql
            String sql = "insert into stu values(null, '小明', 18, 300, '2019-05-20')";
            // 3. 获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
            // 4. 获取执行sql对象 Statement()
            stmt = conn.createStatement();
            // 5. 执行sql
            int count = stmt.executeUpdate(sql); // 影响的行数
            // 6. 处理结果
            System.out.println(count);
            if(count > 0) {
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 避免空指针异常
            if(stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
