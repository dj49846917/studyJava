# mysql学习
## 1.mysql的安装与卸载
        <1>.卸载:(默认路径)
                {1}.打开控制面板，删除软件
                {2}.删除mysql安装目录的所有文件:    C:\Program Files\MySQL
                {3}.删除mysql数据存放文件:      C:\ProgramData\MySQL

        <2>.安装
                {1}.一路next
                {2}.环境变量配置
                    {1}.在系统变量中新建MYSQL_HOME,并写入C:\Program Files\MySQL\MySQL Server 5.5
![mysql安装1](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/%E8%A7%A3%E9%87%8A%E5%9B%BE/1.png)
                    {2}.在编辑中写入:
                        %MYSQL_HOME%\bin
![mysql安装2](https://raw.githubusercontent.com/dj49846917/studyJava/master/MYSQL/%E8%A7%A3%E9%87%8A%E5%9B%BE/2.png)