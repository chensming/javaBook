// ////////////////////////////////////////////////////////
// 
// J_Keyboard.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     键盘事件处理例程。
// ////////////////////////////////////////////////////////
// Copyright:
//
// Using this example, please explicitly refer to the book:
//     Jun-Hai Yong. Textbook for Programming in Java (Third Edition). 
//     Beijing: Tsinghua University Press, 2014.
// The example should be used legally, beneficially and
// without any harm to anybody. Please note that the
// author and the publisher make no warranty of any kind
// on the examples provided.
// Citation examples:
// The program is an example in (or based on, or modified from)
//     Jun-Hai Yong. Textbook for Programming in Java (Third Edition). 
//     Beijing: Tsinghua University Press, 2014.
//
// Some selected books by Jun-Hai Yong are:
//      [1] Jun-Hai Yong. Playing Magic Cube Is Fun: 
//          A Small Course by Professor of Tsinghua University.
//          Beijing: Tsinghua University Press, 2018.
//      [2] Jun-Hai Yong. Programming in C. 
//          Beijing: Tsinghua University Press, 2017.
//      [3] Jun-Hai Yong. Textbook for Programming in Java (Third Edition). 
//          Beijing: Tsinghua University Press, 2014.
//      [4] Jun-Hai Yong. Programming in Java (Second Edition). 
//          Beijing: Tsinghua University Press, 2014.
//      [5] Jun-Hai Yong. Fundamentals of Computer Animation: Algorithms and Programming. 
//          Beijing: Tsinghua University Press, 2008.
//      [6] Jun-Hai Yong. Exercises for Programming in Java.
//          Beijing: Tsinghua University Press, 2006.
//
// 版权:
// 使用本例子，请注明引用:
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// 请合法使用例程，其用途应当合法有益而且不应对任何人造成任何
// 伤害或损失。同时请注意教材作者及出版社没有对例程做出任何承
// 诺与保证。
// 具体引用的方法及例子如下:
// 本程序是下面教材的一个例程(或本程序基于下面教材的例程修改)
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
//
// 雍俊海还编写过如下的教材和教参:
//      [1] 雍俊海. 清华教授的小课堂: 魔方真好玩. 北京: 清华大学出版社. 2018.
//      [2] 雍俊海. C程序设计. 北京: 清华大学出版社. 2017.
//      [3] 雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
//      [4] 雍俊海. Java程序设计(第2版). 北京: 清华大学出版社. 2014.
//      [5] 雍俊海. 计算机动画算法与编程基础. 北京: 清华大学出版社. 2008.
//      [6] 雍俊海. Java程序设计习题集(含参考答案). 
//          北京: 清华大学出版社, 2006.
//
// ////////////////////////////////////////////////////////

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class J_Keyboard extends JFrame
{
    public J_Keyboard( )
    {
        super( "键盘事件处理例程" );
        Container c = getContentPane( );

        JTextField tf =  new JTextField("", 15);
        tf.addFocusListener( new FocusListener( )
            {
                public void focusGained(FocusEvent e)
                {
                    System.out.println("获得焦点");
                } // 方法focusGained结束
                public void focusLost(FocusEvent e)
                {
                    System.out.println("失去焦点");
                } // 方法focusLost结束
            } // 实现接口FocusListener的内部类结束
        ); // addFocusListener方法调用结束
        tf.addKeyListener( new KeyAdapter( )
            {
                public void keyTyped(KeyEvent e)
                {
                    System.out.println("键盘事件: " + e.getKeyChar( ));
                } // 方法keyTyped结束
            } // 实现抽象类KeyAdapter的内部子类结束
        ); // addKeyListener方法调用结束
        c.add( tf,  BorderLayout.CENTER );
    } // J_Keyboard构造方法结束

    public static void main(String args[ ])
    {
        J_Keyboard app = new J_Keyboard( );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 350, 80 );
        app.setVisible( true );
    } // 方法main结束
} // 类J_Keyboard结束
