// ////////////////////////////////////////////////////////
// 
// J_Server.java
// 与J_Client.java一起运行
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     基于TCP通讯例程的服务器端程序。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class J_Server
{
    public static void main(String args[ ])
    {
        try
        {
            ServerSocket server = null;
            server = new ServerSocket(5000);
            while (true)
            {
                Socket s = server.accept( );
                System.out.println("服务器端接收到来自客户端的连接"); 
                DataOutputStream dataOut
                    = new DataOutputStream(s.getOutputStream( ));
                dataOut.writeUTF("服务器端向客户端问好");
                dataOut.close( );
                s.close( );
            } // while循环结束
        }
        catch (Exception e)
        { 
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束 
    } // 方法main结束
} // 类J_Server结束


//{J_ChatServer.java J_ChatClient.java}