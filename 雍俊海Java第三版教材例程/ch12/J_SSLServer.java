// ////////////////////////////////////////////////////////
// 
// J_SSLServer.java
// ��J_SSLClient.javaһ��
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ����SSL�ķ������˳���
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import javax.net.ssl.SSLServerSocketFactory;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J_SSLServer
{
    public static void main(String args[ ])
    {
        // ָ����Կ�⼰������
        System.setProperty("javax.net.ssl.keyStore", ".\\new.keystore");
        System.setProperty("javax.net.ssl.keyStorePassword", "ks123456");

        // ��ȡ���������׽��ֹ�����ʵ������
        SSLServerSocketFactory ssf = (SSLServerSocketFactory)
            SSLServerSocketFactory.getDefault( );
        try
        {
            // �������������׽���
            ServerSocket ss = ssf.createServerSocket(5000);

            int i=0;
            while (true)
            {
                System.out.println("[" + (++i)
                    + "]: �ȴ����Կͻ��˵�����... ...");
                Socket s = ss.accept( ); // �������ȴ����Կͻ��˵�����
                PrintWriter pw = new PrintWriter(s.getOutputStream( ));
                InetAddress sa = s.getInetAddress( );
                InetAddress ca = s.getLocalAddress( );  

                String str;
                System.out.println("����������ͻ��˷�����Ϣ:");
                str = 
                    "����"
                    + ca.getHostAddress( ) + "(" + s.getLocalPort( ) + ")"
                    + "��"
                    + sa.getHostAddress( ) + "(" + s.getPort( ) + ")"
                    + "�������ʺ�";
                System.out.println(str);
                pw.println(str);
                pw.flush( );

                System.out.println("�������˽��տͻ�����Ϣ:");
                BufferedReader br = new BufferedReader(
                    new InputStreamReader(s.getInputStream( )));

                str=br.readLine( );
                System.out.println(str);

                br.close( );
                pw.close( );
                s.close( );
            } // whileѭ������
        }
        catch(Exception e)
        {
            System.err.println("ע: main�����������쳣��");
            System.err.println(e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_SSLServer����

//J_SSLKeryManager.java