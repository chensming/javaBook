// ////////////////////////////////////////////////////////
// 
// J_Server.java
// ��J_Client.javaһ������
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ����TCPͨѶ���̵ķ������˳���
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class J_Server
{
    public static void main(String args[ ])
    {
        try
        {
            ServerSocket server = null;
            server = new ServerSocket(5000);
            while (true)
            {
                Socket s = server.accept( );
                System.out.println("�������˽��յ����Կͻ��˵�����"); 
                DataOutputStream dataOut
                    = new DataOutputStream(s.getOutputStream( ));
                dataOut.writeUTF("����������ͻ����ʺ�");
                dataOut.close( );
                s.close( );
            } // whileѭ������
        }
        catch (Exception e)
        { 
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ���� 
    } // ����main����
} // ��J_Server����


//{J_ChatServer.java J_ChatClient.java}