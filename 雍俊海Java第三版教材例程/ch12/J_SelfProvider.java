// ////////////////////////////////////////////////////////
// 
// J_SelfProvider.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//      �Զ��尲ȫ�ṩ����
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.security.Provider;

public class J_SelfProvider extends Provider
{
    public J_SelfProvider( )
    {
        super("Self", 1, "Self Provider 1.1");
        put("KeyManagerFactory.Self", "J_SSLKeyManagerFactory");
    }  // ���췽��J_SelfProvider����
} // ��J_SelfProvider����


// J_SSLServerAlias.java