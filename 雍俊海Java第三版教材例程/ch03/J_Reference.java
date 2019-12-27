// ////////////////////////////////////////////////////////
//
// J_Reference.java
//
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     引用数据类型值传递例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.

class J_Time {
    public int m_month = 1;
} // 类J_Time结束

public class J_Reference {
    public static void mb_method(J_Time t) {
        System.out.println("在t.m_month++之前t.m_month=" + t.m_month);
        t.m_month++;
        System.out.println("在t.m_month++之后t.m_month=" + t.m_month);
    } // 方法mb_method结束

    public static void main(String args[]) {
        J_Time a = new J_Time();
        System.out.println("在方法调用之前a.m_month=" + a.m_month); //1
        mb_method(a);
        System.out.println("在方法调用之后a.m_month=" + a.m_month); //2
    } // 方法main结束
} // 类J_Reference结束


//t03_10