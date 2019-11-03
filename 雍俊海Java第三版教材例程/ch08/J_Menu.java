// ////////////////////////////////////////////////////////
// 
// J_Menu.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     常规菜单例程。
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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class J_Menu extends JFrame
{
    public J_Menu( )
    {
        super("常规菜单应用示例");
        JMenuBar mBar = new JMenuBar( );
        setJMenuBar(mBar); // 设置菜单栏

        JMenu [ ] m = { new JMenu("文件(F)"), new JMenu("编辑(E)") };
        char  [ ][ ] mC = {{'F', 'E'}, {'O', 'S'}, {'C', 'V'}};
        JMenuItem [ ] [ ] mI =
        {
            {new JMenuItem("打开(O)"), new JMenuItem("保存(S)")},
            {new JMenuItem("拷贝(C)"), new JMenuItem("粘帖(V)")}
        };
        int i, j;
        
        for (i=0; i < m.length; i++)
        {
            mBar.add(m[i]); // 添加下拉式菜单
            m[i].setMnemonic(mC[0][i]); // 设置助记符
            for (j=0; j < mI[i].length; j++)
            {
                m[i].add(mI[i][j]); // 添加命令式菜单项
                mI[i][j].setMnemonic(mC[i+1][j]); // 设置助记符
                mI[i][j].setAccelerator( // 设置快捷键
                    KeyStroke.getKeyStroke("ctrl " + mC[i+1][j]));
                mI[i][j].addActionListener( new ActionListener( )
                    {
                        public void actionPerformed(ActionEvent e)
                        {
                            JMenuItem mItem = (JMenuItem)e.getSource( );
                            System.out.println("运行菜单项: "
                                + mItem.getText( ));
                        } // 方法actionPerformed结束
                    } // 实现接口ActionListener的内部类结束
                ); // 方法addActionListener调用结束
            } // 内部for循环结束
        } // 外部for循环结束
        m[0].insertSeparator(1); 
    } // J_Menu构造方法结束
    
    public static void main(String args[ ])
    {
        JFrame app = new J_Menu( );

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(250, 120);
        app.setVisible(true);
    } // 方法main结束
} // 类J_Menu结束
