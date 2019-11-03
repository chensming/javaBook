// ////////////////////////////////////////////////////////
// 
// J_ReadData.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     从控制台窗口读入数据的例程。
// ////////////////////////////////////////////////////////
// Copyright:
//
// Using this example, please explicitly refer to the book:
//     Jun-Hai Yong. Textbook for Programming in Java (Third Edition). 
//     Beijing: Tsinghua University Press, 2014.
// The example should be used legally, beneficially and
// without any harm to anybody. Please note that the
// author and the publisher make no warranty of any kind
// on the examples provided.
// Citation examples:
// The program is an example in (or based on, or modified from)
//     Jun-Hai Yong. Textbook for Programming in Java (Third Edition). 
//     Beijing: Tsinghua University Press, 2014.
//
// Some selected books by Jun-Hai Yong are:
//      [1] Jun-Hai Yong. Playing Magic Cube Is Fun: 
//          A Small Course by Professor of Tsinghua University.
//          Beijing: Tsinghua University Press, 2018.
//      [2] Jun-Hai Yong. Programming in C. 
//          Beijing: Tsinghua University Press, 2017.
//      [3] Jun-Hai Yong. Textbook for Programming in Java (Third Edition). 
//          Beijing: Tsinghua University Press, 2014.
//      [4] Jun-Hai Yong. Programming in Java (Second Edition). 
//          Beijing: Tsinghua University Press, 2014.
//      [5] Jun-Hai Yong. Fundamentals of Computer Animation: Algorithms and Programming. 
//          Beijing: Tsinghua University Press, 2008.
//      [6] Jun-Hai Yong. Exercises for Programming in Java.
//          Beijing: Tsinghua University Press, 2006.
//
// 版权:
// 使用本例子，请注明引用:
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// 请合法使用例程，其用途应当合法有益而且不应对任何人造成任何
// 伤害或损失。同时请注意教材作者及出版社没有对例程做出任何承
// 诺与保证。
// 具体引用的方法及例子如下:
// 本程序是下面教材的一个例程(或本程序基于下面教材的例程修改)
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
//
// 雍俊海还编写过如下的教材和教参:
//      [1] 雍俊海. 清华教授的小课堂: 魔方真好玩. 北京: 清华大学出版社. 2018.
//      [2] 雍俊海. C程序设计. 北京: 清华大学出版社. 2017.
//      [3] 雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
//      [4] 雍俊海. Java程序设计(第2版). 北京: 清华大学出版社. 2014.
//      [5] 雍俊海. 计算机动画算法与编程基础. 北京: 清华大学出版社. 2008.
//      [6] 雍俊海. Java程序设计习题集(含参考答案). 
//          北京: 清华大学出版社, 2006.
//
// ////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J_ReadData
{
    // 输出提示信息
    public static void mb_printIinfo( )
    {
        System.out.println("输入整数还是浮点数?");
        System.out.println("\t0: 退出; 1: 整数; 2: 浮点数");
    } // 方法mb_printIinfo结束

    // 接受整数的输入
    public static int mb_getInt( BufferedReader f )
    {
        try
        {
            String s = f.readLine( );
            int i = Integer.parseInt( s );
            return i;
        }
        catch (Exception e)
        {
            return -1;
        } // try-catch结构结束
    } // 方法mb_getInt结束

    // 接受浮点数的输入
    public static double mb_getDouble( BufferedReader f )
    {
        try
        {
            String s = f.readLine( );
            double d = Double.parseDouble( s );
            return d;
        }
        catch (Exception e)
        {
            return 0d;
        } // try-catch结构结束
    } // 方法mb_getDouble结束

    public static void main(String args[ ])
    {
        int i;
        double d;
        try
        {
            BufferedReader f = 
                new BufferedReader(new InputStreamReader( System.in ));
            do
            {
                mb_printIinfo( );
                i = mb_getInt( f );
                if (i==0)
                    break;
                else if (i==1)
                {
                    System.out.print("\t请输入整数: ");
                    i = mb_getInt( f );
                    System.out.println("\t输入整数: " + i);
                }
                else if (i==2)
                {
                    System.out.print("\t请输入浮点数: ");
                    d = mb_getDouble( f );
                    System.out.println("\t输入浮点数: " + d);
                } // if-else结构结束
            }
            while (true); // do-while循环结束
            f.close( );
        }
        catch (Exception e)
        {
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_ReadData结束
