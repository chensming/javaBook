// ////////////////////////////////////////////////////////
// 
// J_SliderAndPanel.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ��������������̡�
//
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class J_SliderAndPanel {
    public static void main(String args[]) {
        JFrame app = new JFrame("���������������");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(360, 120);
        Container c = app.getContentPane();
        c.setLayout(new FlowLayout());
        JSlider s = new JSlider(JSlider.HORIZONTAL, 0, 30, 10);
        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(100, 60));
        p.setBackground(Color.green);
        c.add(s);
        c.add(p);
        app.setVisible(true);
    } // ����main����
} // ��J_SliderAndPanel����

//J_GridLayout.java