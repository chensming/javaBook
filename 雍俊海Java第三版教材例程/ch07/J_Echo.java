// ////////////////////////////////////////////////////////
// 
// J_Echo.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ����(echo)���̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.io.InputStream;
import java.io.IOException;

public class J_Echo
{
    public static void mb_echo(InputStream in)
    {
        try
        {
            while (true) // �������벢����
            {
                int i = in.read( );
                if (i == -1) // ����������
                    break;
                char c = (char) i; 
                System.out.print(c); 
            } // whileѭ������
        }
        catch (IOException e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
        System.out.println( ); 
    } // ����mb_echo����

    public static void main(String args[ ])
    {
        mb_echo(System.in);
    } // ����main����
} // ��J_Echo����


//J_EchoFile.java