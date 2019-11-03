// ////////////////////////////////////////////////////////
// 
// J_SSLServerAlias.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     基于SSL的服务器端程序，允许指定密钥项别名和密钥项密码。
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

import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLServerSocket;
import java.security.KeyStore;
import java.security.Security;
import java.net.Socket;
import java.net.InetAddress;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class J_SSLServerAlias
{
    public static void main(String args[ ])
    {
        // 指定密钥项别名及密钥项密码
        System.setProperty("Self.alias", "oldmark");
        System.setProperty("Self.keypass", "ks123456");
        try
        {
            Security.addProvider(new J_SelfProvider( ));
            SSLContext sc = SSLContext.getInstance("SSL");
            KeyStore ks = KeyStore.getInstance("JKS");
            char password [ ] = "ks123456".toCharArray( );

            // 加载密钥库
            ks.load(new FileInputStream("new.keystore"), password);

            // 获取服务器端套接字工厂的实例对象
            KeyManagerFactory kmf = KeyManagerFactory.getInstance("Self");
            kmf.init(ks, password);
            sc.init(kmf.getKeyManagers( ), null, null);
            SSLServerSocketFactory ssf = sc.getServerSocketFactory( );

            // 创建服务器端套接字
            SSLServerSocket ss =
                (SSLServerSocket)ssf.createServerSocket(5000);

            int i=0;
            while (true)
            {
                System.out.println("[" + (++i)
                    + "]: 等待来自客户端的连接... ...");
                Socket s = ss.accept( );
                PrintWriter pw = new PrintWriter(s.getOutputStream( ));
                InetAddress sa = s.getInetAddress( );
                InetAddress ca = s.getLocalAddress( );  

                System.out.println("服务器端向客户端发送信息:");
                String str;
                str = 
                    "来自"
                    + ca.getHostAddress( ) + "(" + s.getLocalPort( ) + ")"
                    + "向"
                    + sa.getHostAddress( ) + "(" + s.getPort( ) + ")"
                    + "发出的问候。";
                System.out.println(str);
                pw.println(str);
                pw.flush( );

                System.out.println("服务器端接收客户端信息:");
                BufferedReader br = new BufferedReader(
                    new InputStreamReader(s.getInputStream( )));
                str=br.readLine( );
                System.out.println(str);
                br.close( );

                pw.close( );
                s.close( );
            } // while循环结束
        }
        catch(Exception e)
        {
            System.err.println("注: main方法发生了例外。");
            System.err.println(e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法main结束
} // 类J_SSLServerAlias结束
