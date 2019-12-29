// ////////////////////////////////////////////////////////
// 
// J_ReadData.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     �ӿ���̨���ڶ������ݵ����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J_ReadData
{
    // �����ʾ��Ϣ
    public static void mb_printIinfo( )
    {
        System.out.println("�����������Ǹ�����?");
        System.out.println("\t0: �˳�; 1: ����; 2: ������");
    } // ����mb_printIinfo����

    // ��������������
    public static int mb_getInt( BufferedReader f )
    {
        try
        {
            String s = f.readLine( );
            int i = Integer.parseInt( s );
            return i;
        }
        catch (Exception e)
        {
            return -1;
        } // try-catch�ṹ����
    } // ����mb_getInt����

    // ���ܸ�����������
    public static double mb_getDouble( BufferedReader f )
    {
        try
        {
            String s = f.readLine( );
            double d = Double.parseDouble( s );
            return d;
        }
        catch (Exception e)
        {
            return 0d;
        } // try-catch�ṹ����
    } // ����mb_getDouble����

    public static void main(String args[ ])
    {
        int i;
        double d;
        try
        {
            BufferedReader f = 
                new BufferedReader(new InputStreamReader( System.in ));
            do
            {
                mb_printIinfo( );
                i = mb_getInt( f );
                if (i==0)
                    break;
                else if (i==1)
                {
                    System.out.print("\t����������: ");
                    i = mb_getInt( f );
                    System.out.println("\t��������: " + i);
                }
                else if (i==2)
                {
                    System.out.print("\t�����븡����: ");
                    d = mb_getDouble( f );
                    System.out.println("\t���븡����: " + d);
                } // if-else�ṹ����
            }
            while (true); // do-whileѭ������
            f.close( );
        }
        catch (Exception e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_ReadData����


//t07_04_01