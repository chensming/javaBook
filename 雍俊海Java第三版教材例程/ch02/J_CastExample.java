// ////////////////////////////////////////////////////////
//
// J_CastExample.java
//
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     数据类型转换例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.


public class J_CastExample {
    public static void main(String args[]) {
        short a = 100;
        long b = a; // 隐式类型转换

        System.out.println("类型转换: 短整数" + a + "变成长整数" + b);
        b = 123456789L;
        a = (short) b; // 显式类型转换，强制类型转换
        System.out.println("类型转换: 长整数" + b + "变成短整数" + a);
    } // 方法main结束
} // 类J_CastExample结束

J_Boolean.java