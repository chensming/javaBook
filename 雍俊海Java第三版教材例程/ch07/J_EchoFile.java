// ////////////////////////////////////////////////////////
// 
// J_EchoFile.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     读取文件“test.txt”内容的例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.io.FileInputStream;
import java.io.IOException;

public class J_EchoFile
{
    public static void main(String args[ ])
    {
        try
        {
            FileInputStream f =new FileInputStream("test.txt");
            int i;
            int b=f.read( );
            for (i=0; b!=-1; i++)
            {
                System.out.print((char)b);
                b=f.read( );
            } // for循环结束
            System.out.println( );
            System.out.println("文件\"test.txt\"字节数为"+i);
            f.close( );
        }
        catch (IOException e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_EchoFile结束

//J_Write.java