// ////////////////////////////////////////////////////////
// 
// J_BlockGranularity.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ͨ��ʵ�������Ҿ�����Сͬ�����ȵ��߳�ͬ�����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

public class J_BlockGranularity extends Thread
{
    public static int m_data=0;
    public static int m_times=1000;
    public int m_ID;
    public boolean m_done;

    J_BlockGranularity(int id)
    {
        m_ID=id;
    } // J_BlockGranularity���췽������

    public void run( )
    {
        m_done=false;
        int d= ((m_ID % 2==0) ? 1 : -1);
        System.out.println("�����߳�: " + m_ID + "(����Ϊ: " + d + ")");
        try
        {
            for(int i=0; i<m_times; i++)
            for(int j=0; j<m_times; j++)
                synchronized(Class.forName("J_BlockGranularity"))
                {
                    m_data+=d;
                } // ͬ���������
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace( );
            System.err.println(e);
        } // try-catch�ṹ����
        
        m_done=true;
        System.out.println("�����߳�: " + m_ID);
    } // ����run����
    
    public static void main(String args[ ])
    {
        J_BlockGranularity t1 = new J_BlockGranularity(1);
        J_BlockGranularity t2 = new J_BlockGranularity(2);
        t1.m_done=false;
        t2.m_done=false;
        t1.start( );
        t2.start( );
        while ( !t1.m_done || !t2.m_done ) // �ȴ������߳����н���
            ;
        System.out.println("���: m_data=" + m_data);
    } // ����main����
} // ��J_BlockGranularity����


//end of ch11