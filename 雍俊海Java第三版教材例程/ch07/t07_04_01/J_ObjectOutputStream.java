// ////////////////////////////////////////////////////////
// 
// J_ObjectOutputStream.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ����������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class J_ObjectOutputStream
{
    public static void main(String args[ ])
    {
        try
        {
            ObjectOutputStream f = new ObjectOutputStream(
                new FileOutputStream("object.dat"));
            J_Student s = new J_Student( "����", 2003001, 172);
            f.writeObject(s);
            s.mb_output( );
            f.close( );
        }
        catch (Exception e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_ObjectOutputStream����


//t07_04_02