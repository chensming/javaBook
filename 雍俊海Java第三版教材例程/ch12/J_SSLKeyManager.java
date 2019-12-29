// ////////////////////////////////////////////////////////
// 
// J_SSLKeyManager.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//      ʵ�ֽӿ�javax.net.ssl.X509KeyManager����Կ�����������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import javax.net.ssl.X509KeyManager;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.KeyStore;
import java.security.Principal;
import java.security.PrivateKey;
import java.net.Socket;

public class J_SSLKeyManager implements X509KeyManager
{
    protected String m_alias;      // ��Կ��ı���
    protected KeyStore m_keystore; // ��Կ��
    protected char[ ] m_storepass; // ��Կ�������
    protected char[ ] m_keypass;   // ��Կ�������
    private String m_type;         // m_alias��Կ��Ĺ�Կ�ļ����㷨��������
    private String m_issuer;       // m_alias��Կ���֤�鷢����

    public J_SSLKeyManager(KeyStore ks, String s, 
                char[ ] storepass, char [ ] keypass)
    {
        m_keystore = ks;
        m_alias = s;
        m_storepass = storepass;
        m_keypass = keypass;
        try
        {
            Certificate c = ks.getCertificate(s);
            m_type = c.getPublicKey( ).getAlgorithm( );
            m_issuer = 
                ((X509Certificate) c).getIssuerX500Principal( ).getName( );
        }
        catch(Exception e)
        {
            System.err.println("ע: J_SSLKeyManager���췽���������쳣��");
            System.err.println(e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ���췽��J_SSLKeyManager����

    // ע: ���淽��û���õ�����s, ������Ϊnull
    public String chooseClientAlias(String[ ] keyType,
                Principal[ ] issuers, Socket s)
    {
        if (keyType==null)
            return null;
        int i;
        for (i=0; i < keyType.length; i++)
            if (m_type.equals(keyType[i]))
            {
                i=-1;
                break;
            } // if��for�ṹ����
        if (i!=-1) // ˵�������㷨���Ͳ�ƥ��
            return null;
        if (issuers==null) // ˵������issuers���Բ��ÿ���
            return m_alias;
        for (i=0; i < issuers.length; i++)
            if (m_issuer.equals(issuers[i].getName( )))
                return m_alias;
        return null;
    } // ����chooseClientAlias����

    // ע: ���淽��û���õ�����s, ������Ϊnull
    public String chooseServerAlias(String keyType,
                Principal[ ] issuers, Socket s)
    {
        String [ ] ks = {keyType};
        return(chooseClientAlias(ks, issuers, s));
    } // ����chooseServerAlias����

    // ��ñ���alias��Ӧ��֤����
    public X509Certificate[ ] getCertificateChain(String alias)
    {
        try
        {
            Certificate [ ] c = m_keystore.getCertificateChain(alias);
            if (c==null)
                return(null);
            if (c.length==0)
                return(null);
            X509Certificate [ ] xc = new X509Certificate[c.length];
            System.arraycopy(c, 0, xc, 0, c.length);
            return(xc);
        }
        catch(Exception e)
        {
            System.err.println("ע: ��J_SSLKeyManager��"
                + "getCertificateChain�����������쳣��");
            System.err.println(e);
            e.printStackTrace( );
            return null;
        } // try-catch�ṹ����
    } // ����getCertificateChain����

    public String[ ] getClientAliases(String keyType, Principal[ ] issuers)
    {
        String [ ] s;
        String alias = chooseServerAlias(keyType, issuers, null);
        if (alias==null)
            return null;
        else
        {
            s = new String[1];
            s[0] = alias;
        } // if-else�ṹ����
        return s;
    } // ����getClientAliases����

    public PrivateKey getPrivateKey(String alias)
    {
        try
        {
            return((PrivateKey)(m_keystore.getKey(alias, m_keypass)));
        }
        catch(Exception e)
        {
            System.err.println("ע: ��J_SSLKeyManager��"
                + "getPrivateKey�����������쳣��");
            System.err.println(e);
            e.printStackTrace( );
        } // try-catch�ṹ����
        return(null);
    } // ����getPrivateKey����

    public String[ ] getServerAliases(String keyType, Principal[ ] issuers)
    {
        return(getClientAliases(keyType, issuers));
    } // ����getServerAliases����
} // ��J_SSLKeyManager����


//J_SSLKeryManagerFactory.java