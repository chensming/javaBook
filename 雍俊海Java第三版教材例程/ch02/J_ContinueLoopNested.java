// ////////////////////////////////////////////////////////
//
// J_ContinueLoopNested.java
//
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     在嵌套循环语句中的continue语句例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

public class J_ContinueLoopNested {
    public static void main(String args[]) {
        aContinueBlock:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if (0 < i && i < 3)
                    continue aContinueBlock;
                System.out.println("i=" + i + ", j=" + j);
            } // 内层for循环结束
        } // 语句块aContinueBlock结束, 外层for循环结束
    } // 方法main结束
} // 类J_ContinueLoopNested结束

// J_Factorial.java