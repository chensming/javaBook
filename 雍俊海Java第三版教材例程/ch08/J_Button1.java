// ////////////////////////////////////////////////////////
//
// J_Button1.java
//
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     命令式按钮及其动作事件处理例程。
//
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.


package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class J_ActionListener implements ActionListener {
    int m_count = 0;

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        b.setText("单击" + (++m_count) + "次");
    } // 方法actionPerformed结束
} // 类J_ActionListener结束

public class J_Button1 extends JFrame {
    public J_Button1() {
        super("动作事件例程");
        Container c = getContentPane();
        JButton b = new JButton("单击0次");
        J_ActionListener a = new J_ActionListener();
        b.addActionListener(a);
        c.add(b, BorderLayout.CENTER);
    } // J_Button1构造方法结束

    public static void main(String args[]) {
        J_Button1 app = new J_Button1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(100, 80);
        app.setVisible(true);
    } // 方法main结束
} // 类J_Button1结束

//J_Button2.java