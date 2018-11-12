# eclipse的安装与运行

## 1.安装
    <1>.安装到与jdk同一目录  F:\develop\Java
    <2>.打开eclipse, 将workplace的目录放到jdk同一目录  F:\develop\Java

## 2.eclipse的基本使用
    <1>.新建项目
        在空白区域右键 ==> new ==> Project ==>点击选择JAVA project ==> 点击next ==>项目名称 ==>finish

    <2>.创建包(文件夹)
        在src目录右键 ==> new ==> package ==> 在name处填写com.itheima ==> finish

    <3>.创建类(HelloWorld)
        在com.itheima下右键 ==> new => class ==> 在name处填写HelloWorld ==> finish

    <4>.编译
        保存时自动编译

    <5>.运行
        在文件代码中右键 ==> Run as ==> Java Application

## 3.eclipse工作空间基本配置
    <1>.行号的显示和隐藏
        点击行号右键 ==> show line numbers勾选

    <2>.字体大小及颜色
        1).代码区域的字体大小
            window ==> Preferences ==> General ==> Appearance ==> Colors and Fonts ==> Java ==> Java Editor Text Font ==> edit ==> 选12 ==> 点击确定 ==> 点击apply ==> OK

        2).控制台
             window ==> Preferences ==> General ==> Appearance ==> Colors and Fonts ==> Debug ==> console fonts ==> edit ==> 选12 ==> 点击确定 ==> 点击apply ==> OK

    <3>.窗体给弄乱了，怎么办
        window ==> Prespective ==> Reset Perspective
            
    <4>.控制台找不到了，怎么办
        window ==> Show View ==>console

## 4.eclipse辅助键和快捷键
    <1>.内容辅助键          alt + /
        main   然后alt + / + 回车
        syso   然后alt + / + 回车

    <2>.快捷键
        1).单行注释
            选中内容, ctrl + /,取消就再来一次

        2).多行注释
            选中内, ctrl + shift + /
            取消 ctrl + shift + \
        
        3).格式化
            ctrl + shift + f        或者 右键 ==>Source ==> Format

## 5.eclipse中项目的删除和导入
    <1>.删除项目
        选中项目 ==> 右键 ==>delete ==> ok
        1).从项目区域删除
        2).硬盘上删除
            选中项目 ==> 右键 ==> delete ==> 勾选 delete project contents on desk ==> ok
        
    <2>.导入项目
        项目区域右键 ==> import ==> exising projects into workspace ==> next ==> Browse ==> 选择你的项目 ==> finish
        
        
