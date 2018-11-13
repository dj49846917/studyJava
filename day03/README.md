## 1.流程控制语句
    分类：
        <1>. 顺序结构
            从上往下依次执行

        <2>. 选择结构
            {1}.if语句
            {2}.switch语句

        <3>. 循环结构
                for循环
                while 
                do ... while
            
            练习：
            {1}.求1-5的和
                public class ForTest{
                    public static void main{String[] args}{
                        int sum = 0;
                        for(int x=1;x<=5;x++){
                            sum = sum + x;
                        }
                        System.out.println(sum)
                    }
                }
        
        <4>. 跳转控制语句
                break;
                continue