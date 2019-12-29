// ////////////////////////////////////////////////////////
// 
// J_RandomAccessFile.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ��������ļ����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.io.IOException;
import java.io.RandomAccessFile;

public class J_RandomAccessFile
{
    public static void main(String args[ ])
    {
        try
        {
            RandomAccessFile f=new RandomAccessFile("test.txt", "rw");
            int     i;
            double  d;
            for (i=0; i<10; i++)
                f.writeDouble(Math.PI*i);
            f.seek(16);
            f.writeDouble(0);
            f.seek(0);
            for (i=0; i < 10; i++)
            {
                d=f.readDouble( );
                System.out.println("[" + i + "]: " + d);
            } // forѭ������
            f.close( );
        }
        catch (IOException e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_RandomAccessFile����


//J_FileReaderWriter.java