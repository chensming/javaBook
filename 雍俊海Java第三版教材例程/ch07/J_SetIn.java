// ////////////////////////////////////////////////////////
// 
// J_SetIn.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     重定向例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.io.FileInputStream;

public class J_SetIn
{
    public static void main(String args[ ])
    {
        try
        {
            System.setIn(new FileInputStream("test.txt"));
            J_Echo.mb_echo(System.in);
        }
        catch (Exception e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_SetIn结束

//J_RandomAccessFile.java