// ////////////////////////////////////////////////////////
//
// J_DiagonalLayoutExample.java
// 与J_DiagonalLayout.java一起的
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     自定义对角线布局管理器应用例程。
//
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.

package swing;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J_DiagonalLayoutExample {
    public static void main(String args[]) {
        JFrame app = new JFrame("自定义对角线布局管理器应用例程");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(300, 200);
        Container c = app.getContentPane();
        c.setLayout(new J_DiagonalLayout());
        String s;
        JButton b;
        for (int i = 0; i < 5; i++) {
            s = "按钮" + (i + 1);
            b = new JButton(s);
            c.add(b);
        } // for循环结束
        app.setVisible(true);
    } // 方法main结束
} // 类J_DiagonalLayoutExample结束

//J_Button1.java