// ////////////////////////////////////////////////////////
// 
// J_WriteFile.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     �ļ���������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.io.FileOutputStream;
import java.io.IOException;

public class J_WriteFile
{
    public static void main(String args[ ])
    {
        String s = "�ļ����������";
        byte[ ] b = s.getBytes( );
        try
        {
            FileOutputStream f = new FileOutputStream("out.txt");
            f.write(b);
            f.flush( );
            f.close( );
        }
        catch (IOException e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_WriteFile����

//J_PrintStream.java