// ////////////////////////////////////////////////////////
// 
// J_Example.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ʹ����J_Singleton��ʵ����������̡�
// ////////////////////////////////////////////////////////
// ������������̲ĵ�һ������(�򱾳����������̲ĵ������޸�)
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

public class J_Example
{
    public static void main(String args[ ])
    {
        J_Singleton a = J_Singleton.mb_getObject( );
        J_Singleton b = J_Singleton.mb_getObject( );
        if (a==b)
            System.out.println("a��bָ��ͬһ��ʵ������");
        else
            System.out.println("a��bָ��ͬ��ʵ������");
    } // ����main����
} // ��J_Example����

//J_RuntimeExample.java