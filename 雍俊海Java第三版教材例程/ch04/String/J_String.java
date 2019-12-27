// ////////////////////////////////////////////////////////
// 
// J_String.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     参数为字符串的方法调用例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.

public class J_String {
    public static void mb_operate(String x, String y) {
        x.concat(y);
        y = x;
    } // 方法mb_operate结束

    public static void main(String args[]) {
        String a = "A";
        String b = "B";
        mb_operate(a, b);
        System.out.println(a + "." + b);
    } // 方法main结束
} // 类J_String结束
