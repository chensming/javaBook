// ////////////////////////////////////////////////////////
// 
// J_SynchronizedMethod.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     �߳�ͬ������: ˵����ͬһ�������еĶ��ͬ�����������л��ơ�
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

    public synchronized void m_method1(int id)
    {
        System.out.println("�߳�" + id + "���뷽��1");
        mb_sleep(1000);
        System.out.println("�߳�" + id + "�뿪����1");
    } // ����m_method1����

    public synchronized void m_method2(int id)
    {
        System.out.println("�߳�" + id + "���뷽��2");
        mb_sleep(1000);
        System.out.println("�߳�" + id + "�뿪����2");
    } // ����m_method2����
} // ��J_Experiment����

public class J_SynchronizedMethod extends Thread
{
    public int m_ID;
    public J_Experiment m_data;

    J_SynchronizedMethod(int id)
    {
        m_ID=id;
    } // J_SynchronizedMethod���췽������

    public void run( )
    {
        System.out.println("�����߳�: " + m_ID);
        m_data.m_method1(m_ID);
        m_data.m_method2(m_ID);
        System.out.println("�����߳�: " + m_ID);
    } // ����run����
    
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
        } // forѭ������
        System.out.println("����main����");
    } // ����main����
} // ��J_SynchronizedMethod����


//J_BlockClass.java