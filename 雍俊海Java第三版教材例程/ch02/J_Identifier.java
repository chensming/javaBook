// ////////////////////////////////////////////////////////
//
// J_Identifier.java
//
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     判断一个字符是否可以做Java标识符的起始字符或后继字符的例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.

public class J_Identifier {
    public static void main(String args[]) {
        char c = '猫';
        if (Character.isJavaIdentifierStart(c))
            System.out.println("字符\'" + c + "\'可以做标识符的首字符");
        else
            System.out.println("字符\'" + c + "\'不可以做标识符的首字符");
        if (Character.isJavaIdentifierPart(c))
            System.out.println("字符\'" + c
                    + "\'可以做标识符除首字符外的组成字符");
        else
            System.out.println("字符\'" + c
                    + "\'不可以做标识符除首字符外的组成字符");
    } // 方法main结束
} // 类J_Identifier结束


//J_CastExample.java