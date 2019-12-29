// ////////////////////////////////////////////////////////
// 
// J_SynchronizedStatic.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     �߳�ͬ������: ˵����̬�ĺͷǾ�̬��ͬ��������
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
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
            System.err.println("�쳣InterruptedException: " + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����mb_sleep����

    public static synchronized void m_methodStatic(int id)
    {
        System.out.println("�߳�" + id + "���뾲̬ͬ������");
        mb_sleep(1000);
        System.out.println("�߳�" + id + "�뿪��̬ͬ������");
    } // ����m_methodStatic����

    public synchronized void m_methodSynchronized(int id)
    {
        System.out.println("�߳�" + id + "����Ǿ�̬ͬ������");
        mb_sleep(1000);
        System.out.println("�߳�" + id + "�뿪�Ǿ�̬ͬ������");
    } // ����m_methodSynchronized����

    public void m_method(int id)
    {
        System.out.println("�߳�" + id + "����Ǿ�̬��ͬ������");
        mb_sleep(1000);
        System.out.println("�߳�" + id + "�뿪�Ǿ�̬��ͬ������");
    } // ����m_method����
} // ��J_Experiment����

public class J_SynchronizedStatic extends Thread
{
    public int m_ID;
    public J_Experiment m_data;

    J_SynchronizedStatic(int id)
    {
        m_ID=id;
    } // J_SynchronizedStatic���췽������

    public void run( )
    {
        System.out.println("�����߳�: " + m_ID);
        m_data.m_methodSynchronized(m_ID);
        m_data.m_methodStatic(m_ID);
        m_data.m_method(m_ID);
        System.out.println("�����߳�: " + m_ID);
    } // ����run����
    
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
        } // forѭ������
        System.out.println("����main����");
    } // ����main����
} // ��J_SynchronizedStatic����


//J_SynchronizedMethod.java