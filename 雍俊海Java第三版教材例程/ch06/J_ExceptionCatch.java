// ////////////////////////////////////////////////////////
// 
// J_ExceptionCatch.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     �쳣��׽���̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.


public class J_ExceptionCatch
{
    public static void main(String args[ ])
    {
        try
        {
            System.out.println("try����");
            throw new Exception( );
        }
        catch(Exception e)
        {
            System.err.println("catch����");
            e.printStackTrace( );
        }
        finally
        {
            System.out.println("finally����");
        } // try-catch-finally�ṹ����
    } // ����main����
} // ��J_ExceptionCatch����

//J_Exception.java