// ////////////////////////////////////////////////////////
// 
// J_InetAddress.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     网络地址例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.net.InetAddress;
import java.net.UnknownHostException;

public class J_InetAddress
{
    public static void main(String args[ ])
    {
        String s = "www.tsinghua.edu.cn";
        InetAddress ts= null;

        try
        { 
            ts = InetAddress.getByName(s);
        }
        catch (UnknownHostException e)
        { 
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束
        if (ts!=null)
        {
            System.out.println("清华大学的网络地址是: "
                + ts.getHostAddress( ));
            System.out.println("清华大学网站的主机名是: " + ts.getHostName( ));
        }
        else System.out.println("无法访问网络地址: " + s);
    } // 方法main结束
} // 类J_InetAddress结束



//J_Url.java