package cn.itcust.servlert;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkCode")
public class CheckCode extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int width = 100;
        int height = 50;

        //1. 创建一对象，在内存中图片（验证码图片对象）
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // 2. 美化图片
        // 2.1 填充背景色
        Graphics g = image.getGraphics(); // 画笔对象
        g.setColor(Color.pink); // 设置画笔颜色
        g.fillRect(0, 0, width, height);

        // 2.2 画边框
        g.setColor(Color.blue);
        g.drawRect(0, 0, width-1, height-1);

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        // 生成随机下标
        Random ran = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<=4; i++){
            int index = ran.nextInt(str.length());
            char ch = str.charAt(index);
            sb.append(ch);

            // 2.3 写验证码
            g.drawString(String.valueOf(ch), width/5 * i, height/ 2);
        }
        String checkCode_session = sb.toString();
        // 将验证码存入session
        request.getSession().setAttribute("checkCode_session", checkCode_session);

        // 2.4 画干扰线
        g.setColor(Color.green);

        // 随机生成坐标点
        for (int i = 0; i <10 ; i++) {
            int x1 = ran.nextInt(width);
            int x2 = ran.nextInt(width);
            int y1 = ran.nextInt(height);
            int y2 = ran.nextInt(height);
            g.drawLine(x1, y1, x2, y2);
        }

        // 3. 将图片输出到页面展示
        ImageIO.write(image, "jpg", response.getOutputStream());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
