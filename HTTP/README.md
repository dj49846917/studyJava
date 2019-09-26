## HTTP:
    * 概念: Hyper Text Transfer Protocol 超文本传输协议
        * 传输协议: 定义了客户端和服务器端通信时，发送数据的格式
        
        * 特点: 
            1. 基于TCP/IP的高级协议
            2. 默认端口号: 80
            3. 基于请求/响应模型的: 一次请求对应一次响应
            4. 无状态的: 每次请求之间相互独立，不能交互数据
            
        * 历史版本:
            * 1.0： 每一次请求响应都会建立新的连接
            * 1.1： 复用连接
            
    * 请求消息数据格式
        1. 请求行
            请求方式    请求url   请求协议/版本
            GET    /login.html    HTTP/1.1
            
            * 请求方式:
                * HTTP协议有7种请求方式，常用的有2种
                    * GET：
                        1. 请求参数放在请求行中，在url后面
                        2. 请求的url长度有限制的
                        3. 不太安全
                    
                    * POST:
                        1. 请求参数在请求体中
                        2. 请求的url长度没有限制的
                        3. 相对安全
                        
        2. 请求头： 客户端浏览器告诉服务器一些信息
            请求头名称：请求头值
            
            * 常见的请求头：
                1. User-Agent：浏览器告诉服务器，我访问你使用的浏览器版本信息
                    * 可以在服务器端获取该头的信息，解决浏览器的兼容性问题
                    
                2. Referer: http://localhost:8080/login.html
                    * 告诉服务器，我(当前请求)从哪里来?
                        * 作用：
                            1. 防盗链
                            2. 统计工作
            
        3. 请求空行
            空行， 就是用于分割POST请求的请求头，和请求体的
        4. 请求体(正文)
            * 封装POST请求的请求参数的
        
        * 字符串格式:
            POST    /login.html     HTTP/1.1
            Accept:text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8
            Accept-Encoding:gzip, deflate, br
            Accept-Language:zh-CN,zh;q=0.9
            Cache-Control:max-age=0
            Connection:keep-alive
            Cookie:JSESSIONID=2F307DC99F723B0AC0C4CDC8DE888D2E
            Host:localhost:8080
            Upgrade-Insecure-Requests:1
            User-Agent:Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36
            
            username=zhangsan
