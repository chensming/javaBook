// ////////////////////////////////////////////////////////
// 
// J_SSLClient.java
// ��J_SSLServer.javaһ������
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//      ����SSL�Ŀͻ��˳���
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import javax.net.ssl.SSLSocketFactory;
import java.net.Socket;
import java.net.InetAddress;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J_SSLClient
{
    public static void main(String args[ ])
    {
        String host = (args.length>=1 ? args[0] : "localhost");
        int port;

        // ָ��������Կ��
        System.setProperty("javax.net.ssl.trustStore",
            ".\\client.trustStore");

        // ��ȡ�׽��ֹ�����ʵ������
        SSLSocketFactory sf = 
            (SSLSocketFactory)SSLSocketFactory.getDefault( );
        try
        {
            if (args.length>=2)
                port= Integer.parseInt(args[1]);
            else port= 5000;

            // ��ȡ�׽��֣���������˽�������
            Socket s = sf.createSocket(host, port);

            InetAddress sa = s.getInetAddress( );
            InetAddress ca = s.getLocalAddress( );  

            System.out.println("�ͻ��˽��շ���������Ϣ:");
            BufferedReader br = new BufferedReader(
                new InputStreamReader(s.getInputStream( )));
            String str;
            str=br.readLine( );
            System.out.println(str);

            System.out.println("�ͻ�����������˷�����Ϣ:");
            PrintWriter pw = new PrintWriter(s.getOutputStream( ));
            str = 
                "�ͻ���"
                + ca.getHostAddress( ) + "(" + s.getLocalPort( ) + ")"
                + "Ӧ���������"
                + sa.getHostAddress( ) + "(" + s.getPort( ) + ")"
                + "��";
            System.out.println(str);
            pw.println(str);
            pw.flush( );

            pw.close( );
            br.close( );
            s.close( );
        }
        catch(Exception e)
        {
            System.err.println("ע: main�����������쳣��");
            System.err.println(e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_SSLClient����


//J_SSLKeryManager.java