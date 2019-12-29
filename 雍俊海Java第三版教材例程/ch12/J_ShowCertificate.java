// ////////////////////////////////////////////////////////
// 
// J_ShowCertificate.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ��ʾ����֤���ļ���Ϣ�����̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.security.cert.CertificateFactory;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.math.BigInteger;

public class J_ShowCertificate
{
    public static void main(String args[ ])
    {
        if (args.length<1)
        {
            System.out.println("��������ṩ����: ����֤����ļ�����");
            return;
        }
        try
        {
            FileInputStream fis = new FileInputStream(args[0]);
            BufferedInputStream bis = new BufferedInputStream(fis);
            
            CertificateFactory cf = 
                CertificateFactory.getInstance("X.509");
            
            while (bis.available( ) > 0)
            {
                Certificate cert = cf.generateCertificate(bis);
                X509Certificate xcert= (X509Certificate) cert;
                System.out.println("֤������:");

                System.out.println("�汾��: " + xcert.getVersion( ));
                System.out.println("���к�: " 
                    + xcert.getSerialNumber( ).toString(16));
                System.out.println("������: " 
                    + xcert.getSubjectX500Principal( ));
                System.out.println("������: " 
                    + xcert.getIssuerX500Principal( ));
                System.out.println("��Ч����ʼʱ��: " + xcert.getNotBefore( ));
                System.out.println("��Ч����ֹʱ��: " + xcert.getNotAfter( ));
                System.out.println("ǩ���㷨: " + xcert.getSigAlgName( ));
                byte[ ] sig = xcert.getSignature( );
                System.out.println("ǩ��: "
                    + (new BigInteger(sig)).toString(16));
                byte[ ] k = xcert.getPublicKey( ).getEncoded( );
                System.out.println("��Կ: " 
                    + (new BigInteger(k)).toString(16));
            } // whileѭ������
            bis.close( );
        }
        catch(Exception e)
        {
            System.err.println("ע: main�����������쳣��");
            System.err.println(e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����main����
} // ��J_ShowCertificate����



//{J_SSLServer.java J_SSLClient.java}