// ////////////////////////////////////////////////////////
// 
// J_PrintWriter.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     PrintWriter���̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class J_PrintWriter
{
    public static void main(String args[ ])
    {
        try
        {
            PrintWriter f = new PrintWriter("out.txt");
            f.println("Ī���У���������ͷ���ձ���");
            f.close( );
        }
        catch (FileNotFoundException e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_PrintWriter����


//J_ReadData.java