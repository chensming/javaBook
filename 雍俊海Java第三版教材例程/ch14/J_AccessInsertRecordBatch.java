// ////////////////////////////////////////////////////////
// 
//  J_AccessInsertRecordBatch.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     通过批处理SQL语句给数据库表“学生成绩”添加数据(记录)的例程。
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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class J_AccessInsertRecordBatch
{
    public static void main(String args[ ])
    {
        try
        {
            // 加载JDBC-ODBC桥驱动程序
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            // 通过数据源与数据库建立起连接
            Connection c
            =DriverManager.getConnection("jdbc:odbc:studentDatabase");
            Statement s=c.createStatement( ); // 创建SQL语句对象

            // 添加批处理SQL语句
            s.addBatch(
                "insert into 学生成绩 values(2008010451, 'Rose', 75)");
            s.addBatch(
                "insert into 学生成绩 values(2008010452, 'Jame',  95)");
            s.addBatch(
                "insert into 学生成绩 values(2008010453, 'Paul', 85)");

            // 执行批处理
            s.executeBatch( );

            s.close( );
            c.close( );
            System.out.println("给数据库表\"学生成绩\"增加三行记录");
        }
        catch (Exception e)
        {
            System.err.println("异常: " + e.getMessage( ));
        } // try-catch结构结束
    } // 方法main结束
} // 类J_AccessInsertRecordBatch结束
