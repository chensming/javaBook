// ////////////////////////////////////////////////////////
// 
// J_BufferedInputStream.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ���벻�������ڶ�ȡ����ʱ��Ч�ʱȽ����̡�
// ////////////////////////////////////////////////////////
// Copyright:
//
// Using this example, please explicitly refer to the book:
//     Jun-Hai Yong. Textbook for Programming in Java (Third Edition). 
//     Beijing: Tsinghua University Press, 2014.
// The example should be used legally, beneficially and
// without any harm to anybody. Please note that the
// author and the publisher make no warranty of any kind
// on the examples provided.
// Citation examples:
// The program is an example in (or based on, or modified from)
//     Jun-Hai Yong. Textbook for Programming in Java (Third Edition). 
//     Beijing: Tsinghua University Press, 2014.
//
// Some selected books by Jun-Hai Yong are:
//      [1] Jun-Hai Yong. Playing Magic Cube Is Fun: 
//          A Small Course by Professor of Tsinghua University.
//          Beijing: Tsinghua University Press, 2018.
//      [2] Jun-Hai Yong. Programming in C. 
//          Beijing: Tsinghua University Press, 2017.
//      [3] Jun-Hai Yong. Textbook for Programming in Java (Third Edition). 
//          Beijing: Tsinghua University Press, 2014.
//      [4] Jun-Hai Yong. Programming in Java (Second Edition). 
//          Beijing: Tsinghua University Press, 2014.
//      [5] Jun-Hai Yong. Fundamentals of Computer Animation: Algorithms and Programming. 
//          Beijing: Tsinghua University Press, 2008.
//      [6] Jun-Hai Yong. Exercises for Programming in Java.
//          Beijing: Tsinghua University Press, 2006.
//
// ��Ȩ:
// ʹ�ñ����ӣ���ע������:
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ��Ϸ�ʹ�����̣�����;Ӧ���Ϸ�������Ҳ�Ӧ���κ�������κ�
// �˺�����ʧ��ͬʱ��ע��̲����߼�������û�ж����������κγ�
// ŵ�뱣֤��
// �������õķ�������������:
// ������������̲ĵ�һ������(�򱾳����������̲ĵ������޸�)
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
//
// Ӻ��������д�����µĽ̲ĺͽ̲�:
//      [1] Ӻ����. �廪���ڵ�С����: ħ�������. ����: �廪��ѧ������. 2018.
//      [2] Ӻ����. C�������. ����: �廪��ѧ������. 2017.
//      [3] Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
//      [4] Ӻ����. Java�������(��2��). ����: �廪��ѧ������. 2014.
//      [5] Ӻ����. ����������㷨���̻���. ����: �廪��ѧ������. 2008.
//      [6] Ӻ����. Java�������ϰ�⼯(���ο���). 
//          ����: �廪��ѧ������, 2006.
//
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
