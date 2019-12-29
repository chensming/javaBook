// ////////////////////////////////////////////////////////
// 
// J_Singleton.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ������ʵ�����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

public class J_Singleton
{
    private static J_Singleton m_object;

    // ���幹�췽��: ���������д���������ʵ������
    private J_Singleton( )
    {
    } // J_Singleton���췽������

    // ���ص���ʵ�����������(�����û�д��������򴴽��ö���)
    public static J_Singleton mb_getObject( )
    {
        if (m_object == null)
            m_object = new J_Singleton( );
        return m_object;
    } // ����mb_getObject����
} // ��J_Singleton����


//J_RuntimeExample.java