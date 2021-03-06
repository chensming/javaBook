package swing;
// ////////////////////////////////////////////////////////
// J_DialogMode.java
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// 简介:
//     标准对话框例程。
// ////////////////////////////////////////////////////////

import javax.swing.JOptionPane;

public class J_DialogMode {
    public static void main(String args[]) {
        JOptionPane.showMessageDialog(null, "您好!");
        JOptionPane.showConfirmDialog(null, "您现在还好吗?");
        JOptionPane.showInputDialog(null, "您现在还好吗?");
        String[] s = {"好", "不好"};
        JOptionPane.showInputDialog(null, "您现在还好吗?", "输入",
                JOptionPane.QUESTION_MESSAGE, null, s, s[0]);
    } // 方法main结束
} // 类J_DialogMode结束

//J_Test.java
