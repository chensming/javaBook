// ////////////////////////////////////////////////////////
// 
// J_Test.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     �쳣�������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

public class J_Test
{
    public static void mb_createException( )
    {
        throw new ArrayIndexOutOfBoundsException( );
    } // ����mb_createException����

    public static void mb_method( )
    {
        try
        {
            mb_createException( );
            System.out.print("a");
        }
        catch (ArithmeticException  e)
        {
            System.err.print("b");
        }
        finally
        {
            System.out.print("c");
        } // try-catch-finally�ṹ����
        System.out.print("d");
    } // ����mb_method����

    public static void main(String args[ ])
    {
        try
        {
            mb_method( );
        }
        catch (Exception e)
        {
            System.err.print('m');
        } // try-catch�ṹ����
        System.out.print('n');
    } // ����main����
} // ��J_Test����


//end this ch