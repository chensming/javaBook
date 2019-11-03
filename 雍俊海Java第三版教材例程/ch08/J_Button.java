// ////////////////////////////////////////////////////////
// 
// J_Button.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     命令式按钮、复选框和单选按钮例程。
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

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class J_Button extends JFrame
{
    public J_Button( )
    {
        super( "按钮例程" );
        Container c = getContentPane( );
        c.setLayout( new FlowLayout( ) );

        int i;
        // 创建命令式按钮并添加到框架中
        ImageIcon [ ] ic = {new ImageIcon("left.gif"),
                new ImageIcon("right.gif")};
        JButton [ ] b = {new JButton("左", ic[0]), new JButton("中间"),
                new JButton("右", ic[1])};
        for (i=0; i < b.length; i++)
            c.add( b[i] );

        // 创建复选框并添加到框架中
        JCheckBox [ ] ck = {new JCheckBox("左"), new JCheckBox("右")};
        for (i=0; i<ck.length; i++)
        {
            c.add( ck[i] );
            ck[i].setSelected(true);
        } // for循环结束

        // 创建单选按钮并添加到框架中
        JRadioButton[ ] r={new JRadioButton("左"), new JRadioButton("右")};
        ButtonGroup rg = new ButtonGroup( );
        for (i=0; i < r.length; i++)
        {
            c.add( r[i] );
            rg.add( r[i] );
        } // for循环结束
        r[0].setSelected(true);
        r[1].setSelected(false);
    } // J_Button构造方法结束

    public static void main(String args[ ])
    {
        J_Button app = new J_Button( );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 250, 120 );
        app.setVisible( true );
    } // 方法main结束
} // 类J_Button结束
