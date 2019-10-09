package cn.itcust.jdbc;

import cn.itcust.practice.Stu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个方法，查询stu表的数据将其封装为对象，然后装载集合，返回。
 *
 */
public class JdbcDemo8 {
    public static void main(String[] args) {
        List<Stu> list = new JdbcDemo8().findAll();
        System.out.println(list);
        System.out.println(list.size());
    }

    /**
     * 查询所有stu对象
     * @return
     */
    public List<Stu> findAll() {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        List<Stu> list = null;
        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取连接
            conn = DriverManager.getConnection("jdbc:mysql:///db1", "root", "root");
            // 3. 定义sql
            String sql = "select * from stu";
            // 4. 获取执行sql对象
            stmt = conn.createStatement();
            // 5. 执行sql
            rs = stmt.executeQuery(sql);
            // 6. 遍历结果集，封装对象，装载集合
            Stu stu = null;
            list = new ArrayList<Stu>();
            while (rs.next()){
                // 获取数据
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                double score = rs.getDouble("score");
                Date birthday = rs.getDate("birthday");
                double salary = rs.getDouble("salary");
                double bounds = rs.getDouble("bounds");
                // 创建Stu对象，并赋值
                stu = new Stu();
                stu.setId(id);
                stu.setName(name);
                stu.setAge(age);
                stu.setScore(score);
                stu.setBirthday(birthday);
                stu.setSalary(salary);
                stu.setBounds(bounds);

                // 装载集合
                list.add(stu);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
