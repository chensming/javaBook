// ////////////////////////////////////////////////////////
//
// J_Menu.java
//
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ����˵����̡�
//
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.


package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class J_Menu extends JFrame {
    public J_Menu() {
        super("����˵�Ӧ��ʾ��");
        JMenuBar mBar = new JMenuBar();
        setJMenuBar(mBar); // ���ò˵���

        JMenu[] m = {new JMenu("�ļ�(F)"), new JMenu("�༭(E)")};
        char[][] mC = {{'F', 'E'}, {'O', 'S'}, {'C', 'V'}};
        JMenuItem[][] mI =
                {
                        {new JMenuItem("��(O)"), new JMenuItem("����(S)")},
                        {new JMenuItem("����(C)"), new JMenuItem("ճ��(V)")}
                };
        int i, j;

        for (i = 0; i < m.length; i++) {
            mBar.add(m[i]); // �������ʽ�˵�
            m[i].setMnemonic(mC[0][i]); // �������Ƿ�
            for (j = 0; j < mI[i].length; j++) {
                m[i].add(mI[i][j]); // �������ʽ�˵���
                mI[i][j].setMnemonic(mC[i + 1][j]); // �������Ƿ�
                mI[i][j].setAccelerator( // ���ÿ�ݼ�
                        KeyStroke.getKeyStroke("ctrl " + mC[i + 1][j]));
                mI[i][j].addActionListener(new ActionListener() {
                                               public void actionPerformed(ActionEvent e) {
                                                   JMenuItem mItem = (JMenuItem) e.getSource();
                                                   System.out.println("���в˵���: "
                                                           + mItem.getText());
                                               } // ����actionPerformed����
                                           } // ʵ�ֽӿ�ActionListener���ڲ������
                ); // ����addActionListener���ý���
            } // �ڲ�forѭ������
        } // �ⲿforѭ������
        m[0].insertSeparator(1);
    } // J_Menu���췽������

    public static void main(String args[]) {
        JFrame app = new J_Menu();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(250, 120);
        app.setVisible(true);
    } // ����main����
} // ��J_Menu����

//J_PopupMenu.java