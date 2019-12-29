// ////////////////////////////////////////////////////////
// 
// J_Data.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ����������(DataInputStream)��
//     ���������(DataOutputStream)���̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class J_Data
{
    public static void main(String args[ ])
    {
        try
        {

            FileOutputStream fout = new FileOutputStream("out.txt");
            DataOutputStream dfout =new DataOutputStream(fout);
            int i;
            for (i=0; i< 4; i++)
                dfout.writeInt('0' + i);
            dfout.close( );

            FileInputStream fin= new FileInputStream("out.txt");
            DataInputStream dfin= new DataInputStream(fin);
            for (i=0; i< 4; i++)
                System.out.print(dfin.readInt( ) + ", ");
            dfin.close( );
        }
        catch (Exception e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_Data����


//J_BufferedInputStream.java