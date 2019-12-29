// ////////////////////////////////////////////////////////
// 
// J_BufferedInputStream.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ���벻�������ڶ�ȡ����ʱ��Ч�ʱȽ����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Date;

public class J_BufferedInputStream
{
    private static String m_fileName = "J_BufferedInputStream.class";

    public static void main(String args[ ])
    {
        try
        {
            int i, ch;
            i = 0;
            Date d1= new Date( );
            FileInputStream f = new FileInputStream(m_fileName);
            while ((ch=f.read( )) != -1) // read entire file
                i++;
            f.close( );
            Date d2= new Date( );

            long t = d2.getTime( ) - d1.getTime( ); // ��λ(����)
            System.out.printf("��ȡ�ļ�%1$s(��%2$d�ֽ�)%n",
                m_fileName, i);
            System.out.printf("��������ķ�����Ҫ%1$d����%n", t);

            i = 0;
            d1= new Date( );
            f = new FileInputStream(m_fileName);
            BufferedInputStream fb = new BufferedInputStream(f);
            while ((ch=fb.read( )) != -1) // read entire file
                i++;
            fb.close( );
            d2= new Date( );
            
            t = d2.getTime( ) - d1.getTime( ); // ��λ(����)
            System.out.printf("������ķ�����Ҫ%1$d����%n", t);
        }
        catch (Exception e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_BufferedInputStream����


//J_SetIn.java