// ////////////////////////////////////////////////////////
//
// J_StringBuffer.java
//
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     字符串缓冲区例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

public class J_StringBuffer {
    public static void main(String args[]) {
        StringBuffer b = new StringBuffer("0123");
        System.out.println("字符串缓冲区的字符序列为\"" + b + "\"");
        System.out.println("字符串缓冲区的长度是" + b.length());
        System.out.println("字符串缓冲区的容量是" + b.capacity());

        b.ensureCapacity(25);
        System.out.println();
        System.out.println("在调用\"b.ensureCapacity(25)\"之后");
        System.out.println("字符串缓冲区的字符序列为\"" + b + "\"");
        System.out.println("字符串缓冲区的长度是" + b.length());
        System.out.println("字符串缓冲区的容量是" + b.capacity());
    } // 方法main结束
} // 类J_StringBuffer结束

/*
字符串缓冲区的字符序列为"0123"
字符串缓冲区的长度是4
字符串缓冲区的容量是20

在调用"b.ensureCapacity(25)"之后
字符串缓冲区的字符序列为"0123"
字符串缓冲区的长度是4
字符串缓冲区的容量是42
 */

//J_Hashtable.java