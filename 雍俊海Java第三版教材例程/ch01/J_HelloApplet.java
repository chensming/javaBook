// ////////////////////////////////////////////////////////
// 
// J_HelloApplet.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ���к�СӦ�ó������̡�
// ////////////////////////////////////////////////////////
//     Ӻ����. Java������ƽ̳�(��3��). ����: �廪��ѧ������. 2014.
// ////////////////////////////////////////////////////////

import java.awt.Graphics;
import javax.swing.JApplet;

public class J_HelloApplet extends JApplet
{
    public void paint(Graphics g)
    {
        g.clearRect(0, 0, getWidth( ), getHeight( )); // �������
        g.drawString("СӦ�ó�������!", 10, 20);
    } // ����paint����
} // ��J_HelloApplet����

