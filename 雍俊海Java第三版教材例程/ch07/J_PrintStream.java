// ////////////////////////////////////////////////////////
// 
// J_PrintStream.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     PrintStream���̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.io.PrintStream;
import java.io.FileNotFoundException;

public class J_PrintStream
{
    public static void main(String args[ ])
    {
        try
        {
            PrintStream f = new PrintStream("out.txt");
            f.printf("%1$d+%2$d=%3$d", 1, 2, (1+2));
            f.close( );
        }
        catch (FileNotFoundException e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_PrintStream����

//J_Data.java