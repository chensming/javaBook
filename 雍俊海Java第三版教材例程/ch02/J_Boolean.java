// ////////////////////////////////////////////////////////
//
// J_Boolean.java
//
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     布尔运算短路规则例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.


public class J_Boolean {
    public static void main(String args[]) {
        int month = 8; // 定义变量month，并赋初值8
        int day = 1; // 定义变量day，并赋初值1
        if ((month == 8) || (++day < 15))      //没执行右边++day
            System.out.println("Month=" + month + ", Day=" + day);
        if ((month == 8) | (++day < 15))      //有执行右边++day
            System.out.println("Month=" + month + ", Day=" + day);
    } // 方法main结束
} // 类J_Boolean结束


//J_Swap.java
