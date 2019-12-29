// ////////////////////////////////////////////////////////
// 
// J_ThreadUser.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     �û��߳�����(Ϊ�����̨�̱߳Ƚ����еĻ���)��
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

public class J_ThreadUser extends Thread
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
        J_ThreadUser t = new J_ThreadUser( );
        t.start( );
        if (t.isDaemon( ))
            System.out.println("����һ����̨�߳�");
        else
            System.out.println("����һ���û��߳�");
        System.out.println("���������н���");
    } // ����main����
} // ��J_ThreadUser����


// J_ThreadGrounp.java