// ////////////////////////////////////////////////////////
// 
// J_Panel.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ���ֻ�������̡�
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

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Vector;
import javax.swing.JPanel;

public class J_Panel extends JPanel
{
    private Vector<Vector<Point>> m_vectorSet
        = new Vector<Vector<Point>>( );

    public J_Panel( )
    {
        addMouseListener( new MouseListener( )
            {
                public void mouseClicked(MouseEvent e)
                {
                } // ����mouseClicked����

                public void mouseEntered(MouseEvent e)
                {
                } // ����mouseEntered����

                public void mouseExited(MouseEvent e)
                {
                } // ����mouseExited����

                public void mousePressed(MouseEvent e)
                {
                    Point p= new Point(e.getX( ), e.getY( ));
                    Vector<Point> v= new Vector<Point>( ); // �µıʻ�
                    v.add(p); // ��ӱʻ������
                    m_vectorSet.add(v);
                } // ����mousePressed����

                public void mouseReleased(MouseEvent e)
                {
                } // ����mouseReleased����
            } // ʵ�ֽӿ�MouseListener���ڲ������
        ); // addMouseListener�������ý���
        addMouseMotionListener( new MouseMotionListener( )
            {
                public void mouseMoved(MouseEvent e)  
                {
                } // ����mouseMoved����

                public void mouseDragged(MouseEvent e) 
                {
                    Point p= new Point(e.getX( ), e.getY( ));
                    int n= m_vectorSet.size( )-1;
                    Vector<Point> v= m_vectorSet.get(n);
                    v.add(p); // ��ӱʻ����м����յ�
                    repaint( );
                } // ����mouseDragged����
            } // ʵ�ֽӿ�MouseMotionListener���ڲ������
        ); // addMouseMotionListener�������ý���
    } // J_Panel���췽������

    protected void paintComponent(Graphics g)
    {
        g.clearRect(0 , 0, getWidth( ), getHeight( )); // �������
        Vector<Point> v;
        Point s, t;
        int i, j, m;
        int n= m_vectorSet.size( );
        for (i=0; i<n; i++)
        {
            v= m_vectorSet.get(i);
            m= v.size( )-1;
            for (j=0; j<m; j++)
            {
                s= (Point)v.get(j);
                t= (Point)v.get(j+1);
                g.drawLine(s.x, s.y, t.x, t.y);
            } // �ڲ�forѭ������
        } // �ⲿforѭ������
    } // ����paintComponent����

    public Dimension getPreferredSize( )
    {
        return new Dimension( 250, 120 );
    } // ����getPreferredSize����
} // ��J_Panel����
