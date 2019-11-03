// ////////////////////////////////////////////////////////
// 
// J_SSLServerAlias.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ����SSL�ķ������˳�������ָ����Կ���������Կ�����롣
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
