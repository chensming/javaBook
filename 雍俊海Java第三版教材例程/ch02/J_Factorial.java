// ////////////////////////////////////////////////////////
//
// J_Factorial.java
//
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     计算并输出10!例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

public class J_Factorial {
    public static void main(String args[]) {
        int i;      // 变量i将作为计数器
        int result; // 用来存放计算结果

        result = 1;  // 初始化
        for (i = 1; i <= 10; i++)
            result *= i;
        System.out.println("10!=" + result);
    } // 方法main结束
} // 类J_Factorial结束


//end of this ch