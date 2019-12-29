// ////////////////////////////////////////////////////////
// 
// J_Data.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     数据输入流(DataInputStream)和
//     数据输出流(DataOutputStream)例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J_Data
{
    public static void main(String args[ ])
    {
        try
        {

            FileOutputStream fout = new FileOutputStream("out.txt");
            DataOutputStream dfout =new DataOutputStream(fout);
            int i;
            for (i=0; i< 4; i++)
                dfout.writeInt('0' + i);
            dfout.close( );

            FileInputStream fin= new FileInputStream("out.txt");
            DataInputStream dfin= new DataInputStream(fin);
            for (i=0; i< 4; i++)
                System.out.print(dfin.readInt( ) + ", ");
            dfin.close( );
        }
        catch (Exception e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_Data结束


//J_BufferedInputStream.java