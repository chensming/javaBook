// ////////////////////////////////////////////////////////
// 
// J_Example.java
// ��J_Singleton.javaһ������
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ʹ����J_Singleton��ʵ����������̡�
// ////////////////////////////////////////////////////////
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


//t06_03_01