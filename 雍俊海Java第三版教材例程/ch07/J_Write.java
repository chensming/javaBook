// ////////////////////////////////////////////////////////
// 
// J_Write.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ��������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.io.IOException;
import java.io.OutputStream;

public class J_Write
{
    public static void mb_write(OutputStream out)
    {
        String s = "���������";
        byte[ ] b = s.getBytes( );
        try
        {
            out.write(b);
            out.flush( );
        }
        catch (IOException e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����mb_write����

    public static void main(String args[ ])
    {
        mb_write(System.out);
    } // ����main����
} // ��J_Write����


//J_WriteFile.java