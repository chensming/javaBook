// ////////////////////////////////////////////////////////
// 
// J_FileReaderWriter.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     文件读写器例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class J_FileReaderWriter
{
    public static void main(String args[ ])
    {
        try
        {
            FileWriter f_out=  new FileWriter("test.txt");
            f_out.write("有志者，事竞成");
            f_out.close( );

            FileReader f_in=  new FileReader("test.txt");
            for (int c=f_in.read( ); c!=-1; c=f_in.read( ))
                System.out.print((char)c);
            f_in.close( );
        }
        catch (IOException e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_FileReaderWriter结束


//J_BufferedReaderWriter.java