// ////////////////////////////////////////////////////////
// 
// J_InnerClass.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     父类型为类的对照例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.


abstract class J_Class {
    int m_data;

    public J_Class(int i) {
        m_data = i;
    } // J_Class构造方法结束

    public abstract void mb_method();
} // 类J_Class结束

class J_Anonymity extends J_Class {
    public J_Anonymity(int i) {
        super(i);
    } // J_Anonymity构造方法结束

    public void mb_method() {
        System.out.println("m_data=" + m_data);
    } // 方法mb_method结束
} // 类J_Anonymity结束

public class J_InnerClass {
    public static void main(String args[]) {
        J_Class b = new J_Anonymity(5);
        b.mb_method();
    } // 方法main结束
} // 类J_InnerClass结束


//J_Scope.java