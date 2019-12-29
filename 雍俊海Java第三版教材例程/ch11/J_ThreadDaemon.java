// ////////////////////////////////////////////////////////
// 
// J_ThreadDaemon.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     后台线程例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

public class J_ThreadDaemon extends Thread
{
    public void run( )
    {
        for(int i=0; true; i++)
        {
            System.out.println("线程在运行: " + i);
            try
            {
                sleep((int)(Math.random( ) * 1000));
            }
            catch( InterruptedException e )
            {
                System.err.println(e);
            } // try-catch结构结束
        } // for循环结束
    } // 方法run结束
    
    public static void main(String args[ ])
    {
        J_ThreadDaemon t = new J_ThreadDaemon( );
        t.setDaemon(true);
        t.start( );
        if (t.isDaemon( ))
            System.out.println("创建一个后台线程");
        else
            System.out.println("创建一个用户线程");
        System.out.println("主方法运行结束");
    } // 方法main结束
} // 类J_ThreadDaemon结束


//J_ThreadUser.java