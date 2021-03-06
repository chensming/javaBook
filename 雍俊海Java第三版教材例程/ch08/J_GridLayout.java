// ////////////////////////////////////////////////////////
// 
// J_GridLayout.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     网格布局管理器例程。
//
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.

package swing;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J_GridLayout {
    public static void main(String args[]) {
        JFrame app = new JFrame("网格布局管理器例程");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(520, 120);
        Container c = app.getContentPane();
        c.setLayout(new GridLayout(2, 5));
        String s;
        JButton b;
        for (int i = 0; i < 5; i++) {
            s = "按钮" + (i + 1);
            b = new JButton(s);
            c.add(b);
        } // for循环结束
        app.setVisible(true);
    } // 方法main结束
} // 类J_GridLayout结束


//J_BorderLayout.java