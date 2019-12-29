// ////////////////////////////////////////////////////////
// 
// J_BufferedReaderWriter.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     �������д�����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class J_BufferedReaderWriter
{
    public static void main(String args[ ])
    {
        try
        {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("test.txt"));
            bw.write("��־�ߣ��¾���");
            bw.newLine( );
            bw.write("�����ˣ��첻��");
            bw.newLine( );
            bw.close( );

            LineNumberReader br = new LineNumberReader(
                new FileReader("test.txt"));
            String s;
            for (s=br.readLine( ); s!=null; s=br.readLine( ))
                System.out.println( br.getLineNumber( ) + ": " + s);
            br.close( );
        }
        catch (IOException e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_BufferedReaderWriter����


//J_PrintWriter.java