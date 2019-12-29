// ////////////////////////////////////////////////////////
// 
// J_WriteFile.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     文件输出流例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.io.FileOutputStream;
import java.io.IOException;

public class J_WriteFile
{
    public static void main(String args[ ])
    {
        String s = "文件输出流例程";
        byte[ ] b = s.getBytes( );
        try
        {
            FileOutputStream f = new FileOutputStream("out.txt");
            f.write(b);
            f.flush( );
            f.close( );
        }
        catch (IOException e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_WriteFile结束

//J_PrintStream.java