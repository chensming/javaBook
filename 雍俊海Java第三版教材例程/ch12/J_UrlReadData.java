// ////////////////////////////////////////////////////////
// 
// J_UrlReadData.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     通过统一资源定位地址(URL)获取网络资源的例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class J_UrlReadData
{
    public static void main(String args[ ])
    {
        try
        {
            URL u = new URL("http://www.tsinghua.edu.cn/chn/index.htm");
            BufferedReader r = new BufferedReader(
                new InputStreamReader(u.openStream( )));
            String s;
            while ((s = r.readLine( )) != null) // 获取网络资源信息
                System.out.println(s); // 输出网络资源信息
            r.close( );
        }
        catch (Exception e)
        { 
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
        } // try-catch结构结束 
    } // 方法main结束
} // 类J_UrlReadData结束


// {J_Server.java J_Client.java}