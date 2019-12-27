// ////////////////////////////////////////////////////////
// 
// J_InnerClass.java.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     父类型为类的匿名内部类例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

abstract class J_Class {
    int m_data;

    public J_Class(int i) {
        m_data = i;
    } // J_Class构造方法结束

    public abstract void mb_method();
} // 接口J_Class结束

public class J_InnerClass {
    public static void main(String args[]) {
        J_Class b = new J_Class(5) {
            public void mb_method() {
                System.out.println("m_data=" + m_data);
            } // 方法mb_method结束
        }; // 父类型为类J_Class的匿名内部类结束
        b.mb_method();
    } // 方法main结束
} // 类J_InnerClass结束


// t03_08_02