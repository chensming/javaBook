// ////////////////////////////////////////////////////////
// 
// J_ObjectOutputStream.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     对象输出例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class J_ObjectOutputStream
{
    public static void main(String args[ ])
    {
        try
        {
            ObjectOutputStream f = new ObjectOutputStream(
                new FileOutputStream("object.dat"));
            J_Student s = new J_Student( "张三", 2003001, 172);
            f.writeObject(s);
            s.mb_output( );
            f.close( );
        }
        catch (Exception e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_ObjectOutputStream结束


//t07_04_02