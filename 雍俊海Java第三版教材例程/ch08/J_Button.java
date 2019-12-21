// ////////////////////////////////////////////////////////
// 
// J_Button.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ����ʽ��ť����ѡ��͵�ѡ��ť���̡�
//
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.


import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class J_Button extends JFrame {
    public J_Button() {
        super("��ť����");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        int i;
        // ��������ʽ��ť����ӵ������
        ImageIcon[] ic = {new ImageIcon("./src/swing/left.gif"),
                new ImageIcon("./src/swing/right.gif")};
        JButton[] b = {new JButton("��", ic[0]), new JButton("�м�"),
                new JButton("��", ic[1])};
        for (i = 0; i < b.length; i++)
            c.add(b[i]);

        // ������ѡ����ӵ������
        JCheckBox[] ck = {new JCheckBox("��"), new JCheckBox("��")};
        for (i = 0; i < ck.length; i++) {
            c.add(ck[i]);
            ck[i].setSelected(true);
        } // forѭ������

        // ������ѡ��ť����ӵ������
        JRadioButton[] r = {new JRadioButton("��"), new JRadioButton("��")};
        ButtonGroup rg = new ButtonGroup();
        for (i = 0; i < r.length; i++) {
            c.add(r[i]);
            rg.add(r[i]);
        } // forѭ������
        r[0].setSelected(true);
        r[1].setSelected(false);
    } // J_Button���췽������

    public static void main(String args[]) {
        J_Button app = new J_Button();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(250, 120);
        app.setVisible(true);
    } // ����main����
} // ��J_Button����

//J_Lines.java