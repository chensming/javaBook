// ////////////////////////////////////////////////////////
// 
// J_PrintWriter.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     PrintWriter例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class J_PrintWriter
{
    public static void main(String args[ ])
    {
        try
        {
            PrintWriter f = new PrintWriter("out.txt");
            f.println("莫等闲，白了少年头，空悲切");
            f.close( );
        }
        catch (FileNotFoundException e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_PrintWriter结束


//J_ReadData.java