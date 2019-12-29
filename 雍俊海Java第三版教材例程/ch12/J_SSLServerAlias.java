// ////////////////////////////////////////////////////////
// 
// J_SSLServerAlias.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ����SSL�ķ������˳�������ָ����Կ���������Կ�����롣
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLServerSocket;
import java.security.KeyStore;
import java.security.Security;
import java.net.Socket;
import java.net.InetAddress;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class J_SSLServerAlias
{
    public static void main(String args[ ])
    {
        // ָ����Կ���������Կ������
        System.setProperty("Self.alias", "oldmark");
        System.setProperty("Self.keypass", "ks123456");
        try
        {
            Security.addProvider(new J_SelfProvider( ));
            SSLContext sc = SSLContext.getInstance("SSL");
            KeyStore ks = KeyStore.getInstance("JKS");
            char password [ ] = "ks123456".toCharArray( );

            // ������Կ��
            ks.load(new FileInputStream("new.keystore"), password);

            // ��ȡ���������׽��ֹ�����ʵ������
            KeyManagerFactory kmf = KeyManagerFactory.getInstance("Self");
            kmf.init(ks, password);
            sc.init(kmf.getKeyManagers( ), null, null);
            SSLServerSocketFactory ssf = sc.getServerSocketFactory( );

            // �������������׽���
            SSLServerSocket ss =
                (SSLServerSocket)ssf.createServerSocket(5000);

            int i=0;
            while (true)
            {
                System.out.println("[" + (++i)
                    + "]: �ȴ����Կͻ��˵�����... ...");
                Socket s = ss.accept( );
                PrintWriter pw = new PrintWriter(s.getOutputStream( ));
                InetAddress sa = s.getInetAddress( );
                InetAddress ca = s.getLocalAddress( );  

                System.out.println("����������ͻ��˷�����Ϣ:");
                String str;
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
            System.err.println("ע: main�������������⡣");
            System.err.println(e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_SSLServerAlias����


//end of ch12