// ////////////////////////////////////////////////////////
// 
// J_SSLKeyManagerFactory.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//      �Զ�����Կ�����������ࡣ
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactorySpi;
import javax.net.ssl.ManagerFactoryParameters;
import java.security.KeyStore;

public class J_SSLKeyManagerFactory extends KeyManagerFactorySpi
{
    public String m_alias;      // ��Կ��ı���
    public KeyStore m_keystore; // ��Կ��
    public char[ ] m_storepass; // ��Կ�������
    public char[ ] m_keypass;   // ��Կ�������

    public J_SSLKeyManagerFactory( )
    {
        m_alias = System.getProperty("Self.alias");
        m_keypass = System.getProperty("Self.keypass").toCharArray( );
    } // ���췽��J_SSLKeyManagerFactory����

    public J_SSLKeyManagerFactory(String alias, char[ ] keypass)
    {
        m_alias = alias;
        m_keypass = keypass;
    } // ���췽��J_SSLKeyManagerFactory����

    protected KeyManager[ ] engineGetKeyManagers( )
    {
        J_SSLKeyManager [ ] skm = new J_SSLKeyManager[1];
        skm[0] = new J_SSLKeyManager(m_keystore, m_alias,
            m_storepass, m_keypass);
        return(skm);
    } // ����engineGetKeyManagers����

    protected void engineInit(KeyStore ks, char[ ] password)
    {
        m_keystore = ks;
        m_storepass = password;
    } // ����engineInit����

    // ����ķ���û��ʵ��
    protected void engineInit(ManagerFactoryParameters spec)
    {
    } // ����engineInit����
} // ��J_SSLKeyManagerFactory����


//J_SelfProvider.java