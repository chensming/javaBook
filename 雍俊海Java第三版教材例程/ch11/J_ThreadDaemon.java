// ////////////////////////////////////////////////////////
// 
// J_ThreadDaemon.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ��̨�߳����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

public class J_ThreadDaemon extends Thread
{
    public void run( )
    {
        for(int i=0; true; i++)
        {
            System.out.println("�߳�������: " + i);
            try
            {
                sleep((int)(Math.random( ) * 1000));
            }
            catch( InterruptedException e )
            {
                System.err.println(e);
            } // try-catch�ṹ����
        } // forѭ������
    } // ����run����
    
    public static void main(String args[ ])
    {
        J_ThreadDaemon t = new J_ThreadDaemon( );
        t.setDaemon(true);
        t.start( );
        if (t.isDaemon( ))
            System.out.println("����һ����̨�߳�");
        else
            System.out.println("����һ���û��߳�");
        System.out.println("���������н���");
    } // ����main����
} // ��J_ThreadDaemon����


//J_ThreadUser.java