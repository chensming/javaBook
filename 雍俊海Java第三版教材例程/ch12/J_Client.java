// ////////////////////////////////////////////////////////
// 
// J_Client.java
// ��J_Server.javaһ������
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ����TCPͨѶ���̵Ŀͻ��˳���
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.io.DataInputStream;
import java.net.Socket;

public class J_Client
{
    public static void main(String args[ ])
    {
        try
        {
            Socket s = new Socket("localhost", 5000);
            DataInputStream dataIn
                = new DataInputStream(s.getInputStream( ));
            System.out.println("�ͻ��˽��յ�: " + dataIn.readUTF( ));
            dataIn.close( );
            s.close( );
        }
        catch (Exception e)
        { 
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ���� 
    } // ����main����
} // ��J_Client����


//{J_ChatServer.java J_ChatClient.java}