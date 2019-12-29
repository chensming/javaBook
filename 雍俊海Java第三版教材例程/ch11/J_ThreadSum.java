// ////////////////////////////////////////////////////////
// 
// J_ThreadSum.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ���ڶ��̹߳����ڴ�������������̡����Ӽ���ʧ�ܡ�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

public class J_ThreadSum extends Thread
{
    public static int m_data=0;
    public static int m_times=10000;
    public int m_ID;
    public boolean m_done;

    J_ThreadSum(int id)
    {
        m_ID=id;
    } // J_ThreadSum���췽������

    public void run( )
    {
        m_done=false;
        int d= ((m_ID % 2==0) ? 1 : -1);
        System.out.println("�����߳�: " + m_ID + "(����Ϊ: " + d + ")");
        for(int i=0; i<m_times; i++)
        for(int j=0; j<m_times; j++)
            m_data+=d;
        m_done=true;
        System.out.println("�����߳�: " + m_ID);
    } // ����run����
    
    public static void main(String args[ ])
    {
        J_ThreadSum t1 = new J_ThreadSum(1);
        J_ThreadSum t2 = new J_ThreadSum(2);
        t1.m_done=false;
        t2.m_done=false;
        t1.start( );
        t2.start( );
        while ( !t1.m_done || !t2.m_done ) // �ȴ������߳����н���
            ;
        System.out.println("���: m_data=" + m_data);
    } // ����main����
} // ��J_ThreadSum����



//J_SynchronizedStatic.java