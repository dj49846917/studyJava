package cn.itcust.jdbc;

import cn.itcust.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *  练习2：
 *      需求：
         1. 通过键盘录入用户名和密码
         2. 判断用户是否登录成功
 *
 */
public class JdbcDemo10 {

    public static void main(String[] args) {
        // 1. 键盘录入，接受用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        
        // 2. 调用方法
        boolean flag = new JdbcDemo10().login(username, password);
        if(flag){
            // 登录成功
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }


    /**
     * 登录方法
     *
     */
    public boolean login(String username, String password) {
        if(username == null || password == null) {
            return false;
        }
        // 连接数据库判断是否登录成功
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        // 1. 获取连接
        try {
            conn = JDBCUtils.getConnection();
            // 2. 定义sql
            String sql = "select * from user where username = '"+username+"' and password = '"+password+"'";
            // 3. 获取执行sql的对象
            stmt = conn.createStatement();
            // 4. 执行查询
            rs = stmt.executeQuery(sql);
            // 5. 判断
//            if(rs.next()) { // 如果有下一行，则返回true
//                return true;
//            } else {
//                return false;
//            }
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs, stmt, conn);
        }
        return false;
    }
}
