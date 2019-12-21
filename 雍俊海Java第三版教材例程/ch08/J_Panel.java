// ////////////////////////////////////////////////////////
//
// J_Panel.java
// ��J_Draw.javaһ������
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ���ֻ�������̡�
//
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.

package swing;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Vector;
import javax.swing.JPanel;

public class J_Panel extends JPanel {
    private Vector<Vector<Point>> m_vectorSet
            = new Vector<Vector<Point>>();

    public J_Panel() {
        addMouseListener(new MouseListener() {
                             public void mouseClicked(MouseEvent e) {
                             } // ����mouseClicked����

                             public void mouseEntered(MouseEvent e) {
                             } // ����mouseEntered����

                             public void mouseExited(MouseEvent e) {
                             } // ����mouseExited����

                             public void mousePressed(MouseEvent e) {
                                 Point p = new Point(e.getX(), e.getY());
                                 Vector<Point> v = new Vector<Point>(); // �µıʻ�
                                 v.add(p); // ��ӱʻ������
                                 m_vectorSet.add(v);
                             } // ����mousePressed����

                             public void mouseReleased(MouseEvent e) {
                             } // ����mouseReleased����
                         } // ʵ�ֽӿ�MouseListener���ڲ������
        ); // addMouseListener�������ý���
        addMouseMotionListener(new MouseMotionListener() {
                                   public void mouseMoved(MouseEvent e) {
                                   } // ����mouseMoved����

                                   public void mouseDragged(MouseEvent e) {
                                       Point p = new Point(e.getX(), e.getY());
                                       int n = m_vectorSet.size() - 1;
                                       Vector<Point> v = m_vectorSet.get(n);
                                       v.add(p); // ��ӱʻ����м����յ�
                                       repaint();
                                   } // ����mouseDragged����
                               } // ʵ�ֽӿ�MouseMotionListener���ڲ������
        ); // addMouseMotionListener�������ý���
    } // J_Panel���췽������

    protected void paintComponent(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight()); // �������
        Vector<Point> v;
        Point s, t;
        int i, j, m;
        int n = m_vectorSet.size();
        for (i = 0; i < n; i++) {
            v = m_vectorSet.get(i);
            m = v.size() - 1;
            for (j = 0; j < m; j++) {
                s = (Point) v.get(j);
                t = (Point) v.get(j + 1);
                g.drawLine(s.x, s.y, t.x, t.y);
            } // �ڲ�forѭ������
        } // �ⲿforѭ������
    } // ����paintComponent����

    public Dimension getPreferredSize() {
        return new Dimension(250, 120);
    } // ����getPreferredSize����
} // ��J_Panel����

//J_Keyboard.java