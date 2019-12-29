// ////////////////////////////////////////////////////////
// 
// J_Url.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     网络统一资源定位地址(URL)例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.net.URL;
import java.net.MalformedURLException;

public class J_Url
{
    public static void main(String args[ ])
    {
        try
        {
            URL u = new URL("http://www.tsinghua.edu.cn/chn/index.htm"); 
            System.out.println("在URL(" + u + ")当中:"); 
            System.out.println("协议是" + u.getProtocol( )); 
            System.out.println("主机名是" + u.getHost( )); 
            System.out.println("文件名是" + u.getFile( )); 
            System.out.println("端口号是" + u.getPort( )); 
            System.out.println("引用是" + u.getRef( )); 
        }
        catch (MalformedURLException e)
        { 
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束 
    } // 方法main结束
} // 类J_Url结束


//J_UrlReadData.java