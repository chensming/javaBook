// ////////////////////////////////////////////////////////
// 
// J_Genericity.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ���жุ���͵����ͱ����������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.


class J_C1
{
    public void mb_methodA( )
    {
        System.out.print("A");
    } // ����mb_methodA����
} // ��J_C1����

interface J_C2
{
    public void mb_methodB( );
} // �ӿ�J_C2����

class J_C3 extends J_C1 implements J_C2
{
    public void mb_methodB( )
    {
        System.out.print("B");
    } // ����mb_methodB����
} // ��J_C3����

class J_T <T extends J_C1 & J_C2>
{
    public void mb_methodT( T t )
    {
        t.mb_methodA( );
        t.mb_methodB( );
    } // ����mb_methodT����
} // ��J_T����

public class J_Genericity
{
    public static void main(String args[ ])
    {
        J_T<J_C3> a = new J_T<J_C3>( );
        a.mb_methodT( new J_C3( ) );
    } // ����main����
} // ��J_Genericity����

/*
AB
*/


//J_Enum.java