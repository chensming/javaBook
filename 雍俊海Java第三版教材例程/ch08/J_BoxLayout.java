// ////////////////////////////////////////////////////////
// 
// J_BoxLayout.java
//
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ��ʽ���ֹ��������̡�
//
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
package swing;

import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class J_BoxLayout {
    public static void main(String args[]) {
        JFrame app = new JFrame("��ʽ���ֹ���������");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(220, 130);
        Container c = app.getContentPane();
        c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));
        String s;
        JButton b;
        for (int i = 0; i < 3; i++) {
            s = "��ť" + (i + 1);
            b = new JButton(s);
            c.add(b);
        } // forѭ������
        app.setVisible(true);
    } // ����main����
} // ��J_BoxLayout����

//J_GridBagLayout.java