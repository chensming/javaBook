// ////////////////////////////////////////////////////////
// 
// J_FlowBoxLayout.java
//
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     组合布局方式例程。
//
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.


package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class J_FlowBoxLayout {
    public static void main(String args[]) {
        JFrame app = new JFrame("组合布局方式例程");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(215, 150);
        Container c = app.getContentPane();
        c.setLayout(new FlowLayout());
        JPanel[] p = new JPanel[3];
        int i;
        for (i = 0; i < 3; i++) {
            p[i] = new JPanel();
            p[i].setLayout(new BoxLayout(p[i], BoxLayout.X_AXIS));
            c.add(p[i]);
        } // for循环结束
        String s;
        JButton b;
        int[] pj = {0, 1, 1, 2, 2, 2};
        for (i = 0; i < 6; i++) {
            s = "按钮" + (i + 1);
            b = new JButton(s);
            p[pj[i]].add(b);
        } // for循环结束
        app.setVisible(true);
    } // 方法main结束
} // 类J_FlowBoxLayout结束

//J_DiagonalLayout.java