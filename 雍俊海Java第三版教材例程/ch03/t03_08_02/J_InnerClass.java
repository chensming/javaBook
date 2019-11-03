// ////////////////////////////////////////////////////////
// 
// J_InnerClass.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     父类型为类的对照例程。
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

abstract class J_Class
{
    int m_data;

    public J_Class( int i )
    {
        m_data = i;
    } // J_Class构造方法结束

    public abstract void mb_method( );
} // 类J_Class结束

class J_Anonymity extends J_Class
{
    public J_Anonymity( int i )
    {
        super(i);
    } // J_Anonymity构造方法结束

    public void mb_method( )
    {
        System.out.println( "m_data=" + m_data );
    } // 方法mb_method结束
} // 类J_Anonymity结束

public class J_InnerClass
{
    public static void main(String args[ ])
    {
        J_Class b = new J_Anonymity( 5 );
        b.mb_method( );
    } // 方法main结束
} // 类J_InnerClass结束
