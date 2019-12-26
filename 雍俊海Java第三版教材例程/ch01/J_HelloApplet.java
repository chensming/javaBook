// ////////////////////////////////////////////////////////
// 
// J_HelloApplet.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     简单招呼小应用程序例程。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.awt.Graphics;
import javax.swing.JApplet;

public class J_HelloApplet extends JApplet
{
    public void paint(Graphics g)
    {
        g.clearRect(0, 0, getWidth( ), getHeight( )); // 清除背景
        g.drawString("小应用程序，您好!", 10, 20);
    } // 方法paint结束
} // 类J_HelloApplet结束

