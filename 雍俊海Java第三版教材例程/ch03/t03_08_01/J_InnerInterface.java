// ////////////////////////////////////////////////////////
// 
// J_InnerInterface.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     父类型为接口的匿名内部类例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

interface J_Interface {
    public static int m_data = 5;

    public abstract void mb_method();
} // 接口J_Interface结束

public class J_InnerInterface {
    public static void main(String args[]) {
        J_Interface b = new J_Interface() {
            public void mb_method() {
                System.out.println("m_data=" + m_data);
            } // 方法mb_method结束
        }; // 实现接口J_Interface的匿名内部类结束
        b.mb_method();
    } // 方法main结束
} // 类J_InnerInterface结束


// t03_08_02