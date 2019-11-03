// ////////////////////////////////////////////////////////
// 
//  J_Jdbc4.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     创建数据库表: “学科代码”，并给数据库表添加一条记录。
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

import com.inet.tds.PDataSource;
import java.sql.Connection;
import java.sql.Statement;

public class J_Jdbc4
{
    public static void main(String args[ ])
    {
        try
        {
            // 创建数据源
            PDataSource dataSource = new PDataSource( );
            // 指定数据库服务器所在的IP地址
            dataSource.setServerName("127.0.0.1");
            // 指定数据库服务器实例名
            dataSource.setInstanceName("student");
            // 指定要使用的数据库名称
            dataSource.setDatabaseName("tempdb");
            // 指定数据库服务器帐号
            dataSource.setUser("sa");
            // 指定数据库服务器帐号密码
            dataSource.setPassword("password");

            // 通过数据源与数据库建立起连接
            Connection c = dataSource.getConnection( );
            Statement s=c.createStatement( ); // 创建SQL语句对象
            // 创建数据库表: 学科代码
            s.executeUpdate(
                "create table 学科代码(代码 integer, 学科 char(40))");
            // 添加记录
            s.executeUpdate(
                "insert into 学科代码 values(0812, '计算机科学与技术')");
            s.close( );
            c.close( );
            System.out.println("创建数据库表: 学科代码，并添加记录");
        }
        catch (Exception e)
        {
            System.err.println("异常: " + e.getMessage( ));
        }  // try-catch结构结束
    } // 方法main结束
} // 类J_Jdbc4结束
