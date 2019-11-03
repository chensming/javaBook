// ////////////////////////////////////////////////////////
// 
// J_Button.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ����ʽ��ť����ѡ��͵�ѡ��ť���̡�
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
// ��Ȩ:
// ʹ�ñ����ӣ���ע������:
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ��Ϸ�ʹ�����̣�����;Ӧ���Ϸ�������Ҳ�Ӧ���κ�������κ�
// �˺�����ʧ��ͬʱ��ע��̲����߼�������û�ж����������κγ�
// ŵ�뱣֤��
// �������õķ�������������:
// ������������̲ĵ�һ������(�򱾳����������̲ĵ������޸�)
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
//
// Ӻ��������д�����µĽ̲ĺͽ̲�:
//      [1] Ӻ����. �廪���ڵ�С����: ħ�������. ����: �廪��ѧ������. 2018.
//      [2] Ӻ����. C�������. ����: �廪��ѧ������. 2017.
//      [3] Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
//      [4] Ӻ����. Java�������(��2��). ����: �廪��ѧ������. 2014.
//      [5] Ӻ����. ����������㷨���̻���. ����: �廪��ѧ������. 2008.
//      [6] Ӻ����. Java�������ϰ�⼯(���ο���). 
//          ����: �廪��ѧ������, 2006.
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
        super( "��ť����" );
        Container c = getContentPane( );
        c.setLayout( new FlowLayout( ) );

        int i;
        // ��������ʽ��ť����ӵ������
        ImageIcon [ ] ic = {new ImageIcon("left.gif"),
                new ImageIcon("right.gif")};
        JButton [ ] b = {new JButton("��", ic[0]), new JButton("�м�"),
                new JButton("��", ic[1])};
        for (i=0; i < b.length; i++)
            c.add( b[i] );

        // ������ѡ����ӵ������
        JCheckBox [ ] ck = {new JCheckBox("��"), new JCheckBox("��")};
        for (i=0; i<ck.length; i++)
        {
            c.add( ck[i] );
            ck[i].setSelected(true);
        } // forѭ������

        // ������ѡ��ť����ӵ������
        JRadioButton[ ] r={new JRadioButton("��"), new JRadioButton("��")};
        ButtonGroup rg = new ButtonGroup( );
        for (i=0; i < r.length; i++)
        {
            c.add( r[i] );
            rg.add( r[i] );
        } // forѭ������
        r[0].setSelected(true);
        r[1].setSelected(false);
    } // J_Button���췽������

    public static void main(String args[ ])
    {
        J_Button app = new J_Button( );
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize( 250, 120 );
        app.setVisible( true );
    } // ����main����
} // ��J_Button����
