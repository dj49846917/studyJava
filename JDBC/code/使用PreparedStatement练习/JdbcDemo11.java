package cn.itcust.jdbc;

import cn.itcust.utils.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 *  练习2：
 *      需求：
         1. 通过键盘录入用户名和密码
         2. 判断用户是否登录成功
 *
 */
public class JdbcDemo11 {

    public static void main(String[] args) {
        // 1. 键盘录入，接受用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        
        // 2. 调用方法
        boolean flag = new JdbcDemo11().login(username, password);
        if(flag){
            // 登录成功
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }


    /**
     * 登录方法, 使用PreparedStatement实现
     *
     */
    public boolean login(String username, String password) {
        if(username == null || password == null) {
            return false;
        }
        // 连接数据库判断是否登录成功
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        // 1. 获取连接
        try {
            conn = JDBCUtils.getConnection();
            // 2. 定义sql
            String sql = "select * from user where username = ? and password = ?";
            // 3. 获取执行sql的对象
            pstmt = conn.prepareStatement(sql);
            // 给?赋值
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            // 4. 执行查询,不需要传递sql
            rs = pstmt.executeQuery();
            // 5. 判断
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs, pstmt, conn);
        }
        return false;
    }
}
