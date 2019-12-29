// ////////////////////////////////////////////////////////
// 
// J_Exception.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     �쳣�������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.


public class J_Exception
{
    public static void mb_throwException( )
    {
        System.out.println("�������׳�ArithmeticException���͵��쳣");
        throw new ArithmeticException( );
    } // ����mb_throwException����

    public static void mb_catchArrayException( )
    {
        try
        {
            mb_throwException( );
            System.out.println("��try�����еĶ������");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("����mb_catchArrayException��׽���쳣");
        }
        finally
        {
            System.out.println(
                "����mb_catchArrayException��finally����");
        } // try-catch-finally�ṹ����
        System.out.println("����mb_catchArrayException���н���"); 
    } // ����mb_catchArrayException����

    public static void main(String args[ ])
    {
        try
        {
            mb_catchArrayException( );
        }
        catch(ArithmeticException e)
        {
            System.err.println("����main��׽���쳣");
        }
        finally
        {
            System.out.println("����main��finally����");
        } // try-catch-finally�ṹ����
        System.out.println("�쳣�������"); 
    } // ����main����
} // ��J_Exception����


//J_ExceptionNewExample.java