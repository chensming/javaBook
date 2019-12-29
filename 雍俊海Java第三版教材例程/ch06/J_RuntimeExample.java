// ////////////////////////////////////////////////////////
// 
// J_RuntimeExample.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ��java.lang.Runtime��Ӧ�����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

public class J_RuntimeExample
{
    public static void main(String args[ ])
    {
        Runtime r = Runtime.getRuntime( );
        System.out.println("������������" + r.availableProcessors( ));
        try
        {
            r.exec("cmd /c start dir");
            r.exec("notepad");
        }
        catch(Exception e)
        {
            System.err.println("�������в�����!");
            e.printStackTrace( );
        } // try-catch�ṹ����
        System.out.println("���õ�����ڴ�Ϊ: " + r.maxMemory( ));
        System.out.println("���ڵ����ڴ�Ϊ: " + r.totalMemory( ));
        System.out.println("���ڿ����ڴ�Ϊ: " + r.freeMemory( ));
        r.gc( );
        System.out.println("���ڿ����ڴ�Ϊ: " + r.freeMemory( ));
    } // ����main����
} // ��J_RuntimeExample����


//J_Test.java