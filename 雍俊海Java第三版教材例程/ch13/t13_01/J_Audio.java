// ////////////////////////////////////////////////////////
// 
// J_Audio.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     声音加载与播放小应用程序例程。
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

import java.applet.AudioClip;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class J_Audio extends JApplet implements ActionListener, ItemListener
{
    private AudioClip m_soundFirst,  m_soundSecond, m_soundCurrent;
    private JButton   m_buttonPlay,  m_buttonLoop,  m_buttonStop;
    private JComboBox m_comboChoose;

    public void init( ) // 在本方法中将建立起图形用户界面，并获取声音资源
    {
        Container container = getContentPane( );
        container.setLayout( new FlowLayout( ) );

        String choices[ ] = { "hi", "bark" };
        m_comboChoose = new JComboBox( choices );
        m_comboChoose.addItemListener( this );
        container.add( m_comboChoose );

        m_buttonPlay = new JButton( "播放" );
        m_buttonPlay.addActionListener( this );
        container.add( m_buttonPlay );
        
        m_buttonLoop = new JButton( "循环播放" );
        m_buttonLoop.addActionListener( this );
        container.add( m_buttonLoop );
        
        m_buttonStop = new JButton( "暂停播放" );
        m_buttonStop.addActionListener( this );
        container.add( m_buttonStop );
        
        m_soundFirst = getAudioClip( getDocumentBase( ), "hi.au" );
        m_soundSecond = getAudioClip( getDocumentBase( ), "bark.au" );
        m_soundCurrent = m_soundFirst;
    } // 方法init结束

    public void stop( )
    {
        m_soundCurrent.stop( ); // 中止声音的播放
    } // 方法stop结束

    public void itemStateChanged(ItemEvent e)
    {
        m_soundCurrent.stop( );
        m_soundCurrent=(m_comboChoose.getSelectedIndex( ) == 0 ? 
            m_soundFirst : m_soundSecond);
    } // 方法itemStateChanged结束

    public void actionPerformed(ActionEvent e)
    {
        if ( e.getSource( ) == m_buttonPlay ) 
            m_soundCurrent.play( );
        else if ( e.getSource( ) == m_buttonLoop ) 
            m_soundCurrent.loop( );
        else if ( e.getSource( ) == m_buttonStop ) 
            m_soundCurrent.stop( );
    } // 方法actionPerformed结束
} // 类J_Audio结束
