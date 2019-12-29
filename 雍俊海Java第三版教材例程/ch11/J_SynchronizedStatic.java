// ////////////////////////////////////////////////////////
// 
// J_SynchronizedStatic.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     线程同步例程: 说明静态的和非静态的同步方法。
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

    public static synchronized void m_methodStatic(int id)
    {
        System.out.println("线程" + id + "进入静态同步方法");
        mb_sleep(1000);
        System.out.println("线程" + id + "离开静态同步方法");
    } // 方法m_methodStatic结束

    public synchronized void m_methodSynchronized(int id)
    {
        System.out.println("线程" + id + "进入非静态同步方法");
        mb_sleep(1000);
        System.out.println("线程" + id + "离开非静态同步方法");
    } // 方法m_methodSynchronized结束

    public void m_method(int id)
    {
        System.out.println("线程" + id + "进入非静态非同步方法");
        mb_sleep(1000);
        System.out.println("线程" + id + "离开非静态非同步方法");
    } // 方法m_method结束
} // 类J_Experiment结束

public class J_SynchronizedStatic extends Thread
{
    public int m_ID;
    public J_Experiment m_data;

    J_SynchronizedStatic(int id)
    {
        m_ID=id;
    } // J_SynchronizedStatic构造方法结束

    public void run( )
    {
        System.out.println("运行线程: " + m_ID);
        m_data.m_methodSynchronized(m_ID);
        m_data.m_methodStatic(m_ID);
        m_data.m_method(m_ID);
        System.out.println("结束线程: " + m_ID);
    } // 方法run结束
    
    public static void main(String args[ ])
    {
        int n=2;
        J_SynchronizedStatic [ ] t = new J_SynchronizedStatic[n];
        J_Experiment d = new J_Experiment( );
        for(int i=0; i< n; i++)
        {
            t[i] = new J_SynchronizedStatic(i);
            t[i].m_data = d;
            t[i].start( );
        } // for循环结束
        System.out.println("方法main结束");
    } // 方法main结束
} // 类J_SynchronizedStatic结束


//J_SynchronizedMethod.java