// ////////////////////////////////////////////////////////
// 
// J_PrintStream.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     PrintStream例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.io.PrintStream;
import java.io.FileNotFoundException;

public class J_PrintStream
{
    public static void main(String args[ ])
    {
        try
        {
            PrintStream f = new PrintStream("out.txt");
            f.printf("%1$d+%2$d=%3$d", 1, 2, (1+2));
            f.close( );
        }
        catch (FileNotFoundException e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_PrintStream结束

//J_Data.java