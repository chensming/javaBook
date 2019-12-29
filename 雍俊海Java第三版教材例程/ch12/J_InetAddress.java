// ////////////////////////////////////////////////////////
// 
// J_InetAddress.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     �����ַ���̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.net.InetAddress;
import java.net.UnknownHostException;

public class J_InetAddress
{
    public static void main(String args[ ])
    {
        String s = "www.tsinghua.edu.cn";
        InetAddress ts= null;

        try
        { 
            ts = InetAddress.getByName(s);
        }
        catch (UnknownHostException e)
        { 
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
        if (ts!=null)
        {
            System.out.println("�廪��ѧ�������ַ��: "
                + ts.getHostAddress( ));
            System.out.println("�廪��ѧ��վ����������: " + ts.getHostName( ));
        }
        else System.out.println("�޷����������ַ: " + s);
    } // ����main����
} // ��J_InetAddress����



//J_Url.java