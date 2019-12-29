// ////////////////////////////////////////////////////////
// 
// J_ShowKeystore.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ��ʾ��ָ����Կ���еĸ�����Կ��˽Կ��Ϣ�����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.util.Enumeration;
import java.math.BigInteger;

public class J_ShowKeystore
{
    public static void main(String args[ ])
    {
        String ks_name;
        if (args.length<1)
        {
            // ��ȡϵͳĬ����Կ���·����������
            ks_name = System.getProperty("user.home") + "\\.keystore";
        }
        else ks_name = args[0];
        System.out.println("��Կ��" + ks_name + "��һЩ��Ϣ����:");
        try
        {
            FileInputStream fis = new FileInputStream(ks_name);
            KeyStore ks = KeyStore.getInstance("JKS");
            String password = "ks123456"; // ��Կ�������
            String epw = "key123456";     // ��Կ�������
            String a;       // ��Կ�����
            PrivateKey pk;  // ��Կ��˽Կ
            byte[ ] k;
            if (args.length>1)
                password = args[1]; // �ɳ������ָ����Կ������

            ks.load(fis, password.toCharArray( ));
    
            // ��ȡ����ʾ����Կ���е���Կ�����
            Enumeration<String> e = ks.aliases( ); // ��ȡ������Կ�����
            while (e.hasMoreElements( ))
            {
                a = e.nextElement( ); // ȡ����Կ�����
                System.out.println("��Կ��" + a + "��˽Կ��:");

                // ��ȡ��Կ��˽Կ
                pk = (PrivateKey) ks.getKey(a, epw.toCharArray( ));
                k = pk.getEncoded( );
                System.out.println((new BigInteger(k)).toString(16));
            } // whileѭ������
        }
        catch(Exception e)
        {
            System.err.println("ע: main�����������쳣��");
            System.err.println(e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_ShowKeystore����


// J_ShowCertificate.java