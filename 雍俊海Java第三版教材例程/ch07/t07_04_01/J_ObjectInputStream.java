// ////////////////////////////////////////////////////////
// 
// J_ObjectInputStream.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ��ȡ�������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class J_ObjectInputStream
{
    public static void main(String args[ ])
    {
        try
        {
            ObjectInputStream f = new ObjectInputStream(
                new FileInputStream("object.dat"));
            J_Student s = (J_Student)(f.readObject( ));
            s.mb_output( );
            f.close( );
        }
        catch (Exception e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_ObjectInputStream����


//t07_04_02