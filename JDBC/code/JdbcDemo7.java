package cn.itcust.jdbc;

import java.sql.*;

/**
 * stu表, DDL语句
 */
public class JdbcDemo7 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///db1", "root", "root");
            // 3. 定义sql
            String sql = "SELECT * FROM stu";
            // 4. 获取执行sql对象
            stmt = conn.createStatement();
            // 5. 执行sql
            rs = stmt.executeQuery(sql);
            // 6. 处理结果
            // 6.1 让游标向下移动一行
            while (rs.next()){
                // 循环判断游标是否是最后一行末尾
                // 获取数据
                int id = rs.getInt(1);
                String name = rs.getString("name");
                int age = rs.getInt(3);
                System.out.println(id +"-----"+ name +"-----"+ age);
            }

//            if(rs.next()){
//                // 判断是否有数据
//                // 6.2 获取数据
//                int id = rs.getInt(1);
//                String name = rs.getString("name");
//                int age = rs.getInt(3);
//                System.out.println(id +"-----"+ name +"-----"+ age);
//            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7. 释放资源
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
