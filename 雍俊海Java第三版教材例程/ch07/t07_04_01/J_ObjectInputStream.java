// ////////////////////////////////////////////////////////
// 
// J_ObjectInputStream.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     读取对象例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class J_ObjectInputStream
{
    public static void main(String args[ ])
    {
        try
        {
            ObjectInputStream f = new ObjectInputStream(
                new FileInputStream("object.dat"));
            J_Student s = (J_Student)(f.readObject( ));
            s.mb_output( );
            f.close( );
        }
        catch (Exception e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_ObjectInputStream结束


//t07_04_02