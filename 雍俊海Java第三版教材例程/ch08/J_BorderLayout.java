// ////////////////////////////////////////////////////////
// 
// J_BorderLayout.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     边界布局管理器例程。
//
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.

package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J_BorderLayout {
    public static void main(String args[]) {
        JFrame app = new JFrame("边界布局管理器例程");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(360, 130);
        Container c = app.getContentPane();
        c.setLayout(new BorderLayout()); // 本语句可以删去
        c.add(new JButton("东"), BorderLayout.EAST);
        c.add(new JButton("西"), BorderLayout.WEST);
        c.add(new JButton("南"), BorderLayout.SOUTH);
        c.add(new JButton("北"), BorderLayout.NORTH);
        c.add(new JButton("中"), BorderLayout.CENTER);
        app.setVisible(true);
    } // 方法main结束
} // 类J_BorderLayout结束

//J_BoxLayout.java