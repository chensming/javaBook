// ////////////////////////////////////////////////////////
// 
// J_BlockData.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ͨ��ʵ����������߳�ͬ�������̡�
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

    public void m_method1(int id)
    {
        System.out.println("�߳�" + id + "���뷽��1");
        mb_sleep(1000);
        System.out.println("�߳�" + id + "�뿪����1");
    } // ����m_method1����

    public void m_method2(int id)
    {
        System.out.println("�߳�" + id + "���뷽��2");
        mb_sleep(1000);
        System.out.println("�߳�" + id + "�뿪����2");
    } // ����m_method2����
} // ��J_Experiment����

public class J_BlockData extends Thread
{
    public int m_ID;
    public J_Experiment m_data;

    J_BlockData(int id)
    {
        m_ID=id;
    } // J_BlockData���췽������

    public void run( )
    {
        System.out.println("�����߳�: " + m_ID);
        synchronized(m_data)
        {
            System.out.println("����ͬ����������߳�: " + m_ID);
            m_data.m_method1(m_ID);
            m_data.m_method2(m_ID);
            System.out.println("�뿪ͬ����������߳�: " + m_ID);
        }
        System.out.println("�����߳�: " + m_ID);
    } // ����run����
    
    public static void main(String args[ ])
    {
        int n=2;
        J_BlockData [ ] t = new J_BlockData[n];
        J_Experiment d = new J_Experiment( );
        for(int i=0; i< n; i++)
        {
            t[i] = new J_BlockData(i);
            t[i].m_data = d;
            t[i].start( );
        } // forѭ������
        System.out.println("����main����");
    } // ����main����
} // ��J_BlockData����



//J_WaitNotify.java