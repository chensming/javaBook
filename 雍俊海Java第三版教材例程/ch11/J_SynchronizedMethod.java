// ////////////////////////////////////////////////////////
// 
// J_SynchronizedMethod.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     线程同步例程: 说明在同一个对象中的多个同步方法的运行机制。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

class J_Experiment
{
    public static void mb_sleep(long millis)
    {
        try
        {
            Thread.sleep(millis);
        }
        catch (InterruptedException e)
        {
            System.err.println("异常InterruptedException: " + e);
            e.printStackTrace( );
        } // try-catch结构结束
    } // 方法mb_sleep结束

    public synchronized void m_method1(int id)
    {
        System.out.println("线程" + id + "进入方法1");
        mb_sleep(1000);
        System.out.println("线程" + id + "离开方法1");
    } // 方法m_method1结束

    public synchronized void m_method2(int id)
    {
        System.out.println("线程" + id + "进入方法2");
        mb_sleep(1000);
        System.out.println("线程" + id + "离开方法2");
    } // 方法m_method2结束
} // 类J_Experiment结束

public class J_SynchronizedMethod extends Thread
{
    public int m_ID;
    public J_Experiment m_data;

    J_SynchronizedMethod(int id)
    {
        m_ID=id;
    } // J_SynchronizedMethod构造方法结束

    public void run( )
    {
        System.out.println("运行线程: " + m_ID);
        m_data.m_method1(m_ID);
        m_data.m_method2(m_ID);
        System.out.println("结束线程: " + m_ID);
    } // 方法run结束
    
    public static void main(String args[ ])
    {
        int n=2;
        J_SynchronizedMethod [ ] t = new J_SynchronizedMethod[n];
        J_Experiment d = new J_Experiment( );
        for(int i=0; i< n; i++)
        {
            t[i] = new J_SynchronizedMethod(i);
            t[i].m_data = d;
            t[i].start( );
        } // for循环结束
        System.out.println("方法main结束");
    } // 方法main结束
} // 类J_SynchronizedMethod结束


//J_BlockClass.java