// ////////////////////////////////////////////////////////
// 
// J_List.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ͬʱ��Ӧ�ó�����СӦ�ó����ͼ����ʾ���̡�
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
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class J_List extends JApplet
{
    private String    m_items[ ] = { "snow.gif", "flag.gif" , "rain.gif"};
    private JList     m_list    = new JList( m_items );
    private JLabel    m_label   = new JLabel( );
    private Icon      m_icons[ ] = new ImageIcon[3];
    private Image     m_image[ ] = null;
    Container m_container = null;

    public void init( )
    {
        int i;
        if (m_image == null)
        {
            m_image = new Image[3];
            for (i=0; i< 3; i++)
                m_image[i] = getImage(getCodeBase( ), m_items[i]);
        } // if�ṹ����
        for (i=0; i< 3; i++)
            m_icons[i] = new ImageIcon(m_image[i]);
        if (m_container == null)
            m_container = getContentPane( );
        m_container.setLayout(new BorderLayout( ));
        m_container.add( m_list, BorderLayout.WEST );
        m_list.setSelectedIndex(0);
        m_list.addListSelectionListener(new ListSelectionListener( )
            {
                public void valueChanged(ListSelectionEvent e )
                {
                    int s = m_list.getAnchorSelectionIndex( );
                    m_label.setIcon( m_icons[ s ] );
                } // ����valueChanged����
            } // ʵ�ֽӿ�ListSelectionListener���ڲ������
        ); // addListSelectionListener�������ý���
        m_container.add( m_label, BorderLayout.EAST );
        m_label.setIcon( m_icons[ 0 ] );
    } // ����init����

    public static void main( String args[ ] )
    { 
        JFrame f = new JFrame("Ӧ�ó���");
        J_List app = new J_List( );

        app.m_container= f.getContentPane( );
        app.m_image = new Image[3];
        try
        {
            for (int i=0; i< 3; i++)
                app.m_image[i] = ImageIO.read( new File(app.m_items[i]) );
        }
        catch (Exception e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
        app.init( );
        f.setSize(200, 110);
        f.setVisible( true );
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // ����main����
} // ��J_List����
