// ////////////////////////////////////////////////////////
// 
// J_BoxLayout.java
//
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     盒式布局管理器例程。
//
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
package swing;

import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J_BoxLayout {
    public static void main(String args[]) {
        JFrame app = new JFrame("盒式布局管理器例程");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(220, 130);
        Container c = app.getContentPane();
        c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));
        String s;
        JButton b;
        for (int i = 0; i < 3; i++) {
            s = "按钮" + (i + 1);
            b = new JButton(s);
            c.add(b);
        } // for循环结束
        app.setVisible(true);
    } // 方法main结束
} // 类J_BoxLayout结束

//J_GridBagLayout.java