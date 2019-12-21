// ////////////////////////////////////////////////////////
//
// J_Draw.java
// 与J_Panel.java一起运行
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     随手画例程。
//
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.


package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class J_Draw extends JFrame {
    public J_Draw() {
        super("随手画例程");
        Container c = getContentPane();
        c.add(new J_Panel(), BorderLayout.CENTER);
    } // J_Draw构造方法结束

    public static void main(String args[]) {
        J_Draw app = new J_Draw();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(600, 400);
        app.setVisible(true);
    } // 方法main结束
} // 类J_Draw结束

//J_Keyboard.java