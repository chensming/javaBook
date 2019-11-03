// ////////////////////////////////////////////////////////
// 
// J_Table.java
// 
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     表格例程。
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

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;
import java.util.Vector;

public class J_Table extends JFrame
{
    DefaultTableModel m_data;
    JTable m_view;

    public J_Table( )
    {
        super("表格应用示例");
        Container c = getContentPane( );
        c.setLayout( new FlowLayout( ) );
        int i;

        // 添加四个按钮
        JButton [ ] b = {new JButton("添加行"), new JButton("添加列"),
                        new JButton("删除行"), new JButton("删除列")};
        for (i=0; i<4; i++)
            c.add(b[i]);

        m_data = new DefaultTableModel( ); // 创建一个空的数据表格
        m_view = new JTable(m_data);
        m_view.setPreferredScrollableViewportSize(
            new Dimension(300, 150)); // 设置表格的显示区域大小
        m_view.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane sPane = new JScrollPane(m_view);
        c.add(sPane);

        b[0].addActionListener( new ActionListener( )
            {
                public void actionPerformed(ActionEvent e)
                {
                    mb_addRow( );
                    System.out.println("添加一行");
                } // 方法actionPerformed结束
            } // 实现接口ActionListener的内部类结束
        ); // 方法addActionListener调用结束

        b[1].addActionListener( new ActionListener( )
            {
                public void actionPerformed(ActionEvent e)
                {
                    mb_addColumn( );
                    System.out.println("添加一列");
                } // 方法actionPerformed结束
            } // 实现接口ActionListener的内部类结束
        ); // 方法addActionListener调用结束

        b[2].addActionListener( new ActionListener( )
            {
                public void actionPerformed(ActionEvent e)
                {
                    mb_deleteRow( );
                    System.out.println("删除当前行");
                } // 方法actionPerformed结束
            } // 实现接口ActionListener的内部类结束
        ); // 方法addActionListener调用结束

        b[3].addActionListener( new ActionListener( )
            {
                public void actionPerformed(ActionEvent e)
                {
                    mb_deleteColumn( );
                    System.out.println("删除当前列");
                } // 方法actionPerformed结束
            } // 实现接口ActionListener的内部类结束
        ); // 方法addActionListener调用结束
    } // J_Table构造方法结束

    public void mb_addColumn( ) // 添加一列
    {
        int cNum = m_data.getColumnCount( );
        int rNum = m_data.getRowCount( );
        String s = "列" + (cNum+1);
        int c = m_view.getSelectedColumn( );
        System.out.println( "当前列号为:" + c);
        if (cNum==0 || rNum==0 || c<0)
        {
            m_data.addColumn( s );
            return;
        } // if结构结束

        c++;
        Vector<String> vs = mb_getColumnNames( ); // 表头的处理
        vs.add(c, s);

        Vector data = m_data.getDataVector( );
        for (int i=0; i<data.size( ); i++)
        {
            Vector e = (Vector) data.get(i);
            e.add(c, new String(""));
        } // for循环结束
        m_data.setDataVector(data, vs);
    } // 方法mb_addColumn结束

    public void mb_addRow( ) // 添加一行
    {
        int cNum = m_data.getColumnCount( );
        if (cNum==0)
            mb_addColumn( );
        int rNum = m_data.getRowCount( );
        int r = mb_getRowCurrent( );
        System.out.println( "当前行号为:" + r);
        m_data.insertRow( r, (Vector)null );
    } // 方法mb_addRow结束

    public void mb_deleteColumn( ) // 删除一列
    {
        int cNum = m_data.getColumnCount( );
        if (cNum==0)
            return;
        int c = m_view.getSelectedColumn( );
        if (c<0)
            c = 0;
        System.out.println( "当前列号为:" + c);

        Vector<String> vs = mb_getColumnNames( ); // 表头的处理
        vs.remove(c);

        Vector data = m_data.getDataVector( );
        for (int i=0; i<data.size( ); i++)
        {
            Vector e = (Vector) data.get(i);
            e.remove(c);
        } // for循环结束
        m_data.setDataVector(data, vs);
    } // 方法mb_deleteColumn结束

    public void mb_deleteRow( ) // 删除一行
    {
        int rNum = m_data.getRowCount( );
        if (rNum > 0)
        {
            int rEdit = mb_getRowCurrent( );
            m_data.removeRow( rEdit );
        }
    } // 方法mb_deleteRow结束

    public Vector<String> mb_getColumnNames( ) // 取得列名称
    {
        Vector<String> vs = new Vector<String>( );
        int cNum = m_data.getColumnCount( );
        for (int i=0; i<cNum; i++)
            vs.add(m_data.getColumnName(i));
        return(vs);
    } // 方法mb_getColumnNames结束

    public int mb_getRowCurrent( ) // 取得当前行的行号
    {
        int r=m_view.getSelectedRow( );
        if (r<0)
            r = 0;
        return(r);
    } // 方法mb_getRowCurrent结束
        
    public static void main(String args[ ])
    {
        JFrame app = new J_Table( );

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(350, 250);
        app.setVisible(true);
    } // 方法main结束
} // 类J_Table结束
