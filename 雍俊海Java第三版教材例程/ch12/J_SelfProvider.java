// ////////////////////////////////////////////////////////
// 
// J_SelfProvider.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//      自定义安全提供程序。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.security.Provider;

public class J_SelfProvider extends Provider
{
    public J_SelfProvider( )
    {
        super("Self", 1, "Self Provider 1.1");
        put("KeyManagerFactory.Self", "J_SSLKeyManagerFactory");
    }  // 构造方法J_SelfProvider结束
} // 类J_SelfProvider结束


// J_SSLServerAlias.java