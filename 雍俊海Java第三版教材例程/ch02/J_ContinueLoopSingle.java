// ////////////////////////////////////////////////////////
//
// J_ContinueLoopSingle.java
//
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     在不含嵌套的循环语句中的continue语句例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.


public class J_ContinueLoopSingle {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            if (1 < i && i < 8)
                continue;
            System.out.println("i=" + i);
        } // for循环结束
    } // 方法main结束
} // 类J_ContinueLoopSingle结束


//J_ContinueLoopNested.java