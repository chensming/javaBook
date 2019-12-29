// ////////////////////////////////////////////////////////
// 
// J_ThreadRunnable.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ͨ���ӿ�Runnable�����̵߳����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

public class J_ThreadRunnable implements Runnable
{
    private int m_threadID;

    public J_ThreadRunnable(int i)
    {
        m_threadID=i;
        System.out.println("�����߳�: " + i );
    } // J_ThreadRunnable���췽������
    
    public void run( )
    {
        for(int i=0; i<3; i++)
        {
            System.out.println("�����߳�: " + m_threadID);
            try
            {
                Thread.sleep((int)(Math.random( ) * 1000));
            }
            catch ( InterruptedException e )
            {
                System.err.println("�쳣InterruptedException: " + e);
                e.printStackTrace( );
            } // try-catch�ṹ����
        } // forѭ������
    } // ����run����

    public static void main( String args[ ] )
    {
        Thread t1= new Thread(new J_ThreadRunnable(1));
        t1.start( );
        Thread t2= new Thread(new J_ThreadRunnable(2));
        t2.start( );
        System.out.println("����main����");
    } // ����main����
} // ��J_ThreadRunnable����


//J_ThreadDaemon.java