// ////////////////////////////////////////////////////////
// 
// J_Lock.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     �߳��������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

public class J_Lock extends Thread
{
    public static Object m_objectA= new Object( );
    public static Object m_objectB= new Object( );

    J_Lock(String s)
    {
        super(s);
    } // J_Lock���췽������

    public static void mb_sleep( )
    {
        try
        {
            Thread.sleep((long)(Math.random( ) * 1000));
        }
        catch (InterruptedException e)
        {
            System.err.println("�쳣InterruptedException: " + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����mb_sleep����

    public void run( )
    {
        boolean t=true;
        System.out.println(getName( ) + "��ʼ����");
        for( ; true; t=!t)
        {
            synchronized(t ? m_objectA : m_objectB)
            {
                System.out.println(getName( ) + ": " +
                    (t ? "����A" : "����B") + "����ס");
                mb_sleep( );
                synchronized(t ? m_objectB : m_objectA)
                {
                    System.out.println(getName( ) + ": " +
                        (t ? "����B" : "����A") + "����ס");
                    mb_sleep( );
                    System.out.println(getName( ) + ": " +
                        (t ? "����B" : "����A") + "������");
                } // �ڲ�ͬ���������
                System.out.println(getName( ) + ": " +
                    (t ? "����A" : "����B") + "������");
            } // ���ͬ���������
        } // forѭ������
    } // ����run����

    public static void main(String args[ ])
    {
        J_Lock t1 = new J_Lock("�߳�1");
        J_Lock t2 = new J_Lock("�߳�2");
        t1.start( );
        t2.start( );
    } // ����main����
} // ��J_Lock����


//J_BlockGranularity.java