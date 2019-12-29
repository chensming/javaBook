// ////////////////////////////////////////////////////////
// 
// J_Echo.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     回声(echo)例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.io.InputStream;
import java.io.IOException;

public class J_Echo
{
    public static void mb_echo(InputStream in)
    {
        try
        {
            while (true) // 接受输入并回显
            {
                int i = in.read( );
                if (i == -1) // 输入流结束
                    break;
                char c = (char) i; 
                System.out.print(c); 
            } // while循环结束
        }
        catch (IOException e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
        System.out.println( ); 
    } // 方法mb_echo结束

    public static void main(String args[ ])
    {
        mb_echo(System.in);
    } // 方法main结束
} // 类J_Echo结束


//J_EchoFile.java