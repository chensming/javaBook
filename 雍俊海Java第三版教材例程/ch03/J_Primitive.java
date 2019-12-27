// ////////////////////////////////////////////////////////
//
// J_Primitive.java
//
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     基本数据类型值传递例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

public class J_Primitive {
    public static void mb_method(int a) {
        System.out.println("在a++之前方法参数a=" + a); //a = 0
        a++;
        System.out.println("在a++之后方法参数a=" + a); //a = 1
    } // 方法mb_method结束

    public static void main(String args[]) {
        int i = 0;
        System.out.println("在方法调用之前变量i=" + i); //i = 0
        mb_method(i);
        System.out.println("在方法调用之后变量i=" + i); //i = 0
    } // 方法main结束
} // 类J_Primitive结束

//J_Reference.java