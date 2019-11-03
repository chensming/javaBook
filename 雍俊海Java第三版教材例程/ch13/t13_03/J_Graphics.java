// ////////////////////////////////////////////////////////
// 
// J_Graphics.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ���弰ͼ����ʾ���̡�
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

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.QuadCurve2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JPanel;

class J_Panel extends JPanel
{
    protected void paintComponent(Graphics g)
    {
        int[ ]x = {55, 67,109, 73, 83, 55, 27, 37,  1, 43};
        int[ ]y = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36};

        Graphics2D g2d = (Graphics2D)g;
        g.clearRect(0, 0, getWidth( ), getHeight( ));
        g.drawLine(20, 30, 60, 90);
        g2d.translate( 80, 20 );
        g2d.draw(new Rectangle(0, 10, 40, 80));

        g2d.translate( 70, 20 );
        g2d.rotate(Math.PI/2);
        Font bakF = g2d.getFont( ); // ����ԭ������������
        g2d.setFont(new Font("Serif", Font.ITALIC|Font.BOLD, 14 ) );
        g2d.drawString("��������", 0, 0);
        g2d.setFont(bakF);  // �ָ�������������

        g2d.rotate(-Math.PI/2);
        g2d.translate( 40, -20 );
        g2d.draw(new Arc2D.Double(0, 30, 40, 40, 0, 360, Arc2D.OPEN));
        g2d.translate( 70, 0 );
        g2d.draw(new QuadCurve2D.Double(0, 30, 20, 130, 40, 30));
        g2d.translate( 70, 0 );
        g2d.draw(new Ellipse2D.Double(0, 10, 40, 80));
        g2d.translate( 70, 0 );
        g2d.draw(new Polygon(x, y, x.length));
    } // ����paintComponent����
} // ��J_Panel����

public class J_Graphics extends JFrame
{
    public J_Graphics( )
    {
        super("���弰ͼ����ʾ����");
        Container c = getContentPane( );
        c.add(new J_Panel( ), BorderLayout.CENTER);
    } // J_Graphics���췽������

    public static void main(String args[ ])
    {
        J_Graphics app = new J_Graphics( );

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(540, 160);
        app.setVisible(true);
    } // ����main����
} // ��J_Graphics����
