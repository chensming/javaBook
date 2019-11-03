// ////////////////////////////////////////////////////////
// 
// J_Texture.java
// 
// ������: Ӻ����
// ////////////////////////////////////////////////////////
// ���:
//     ��ɫ�������������̡�
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
import java.awt.Color;
import java.awt.Container;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JPanel;

class J_Panel extends JPanel
{
    public void mb_drawCircleGreen(Graphics2D g, int x, int y)
    {
        Color c = g.getColor( ); // ��ȡԭ������ɫ
        g.setColor( Color.green );
        g.fill( new Ellipse2D.Double( x, y, 100, 100 ) );
        g.setColor( c );  			// �ָ�ԭ������ɫ����
    } // ����mb_drawCircleGreen����

    public void mb_drawCircleGradientPaint(Graphics2D g, int x, int y)
    {
        Paint p = g.getPaint( ); // ��ȡԭ����ͼ����������
        g.setPaint( new GradientPaint(x, y, Color.green,
                                x+50, y+50, Color.yellow, true) );
        g.fill( new Ellipse2D.Double( x, y, 100, 100 ) );
        g.setPaint( p );  // �ָ�ԭ����ͼ����������
    } // ����mb_drawCircleGradientPaint����

    public void mb_drawRectangleTextureGraphics(Graphics2D g, int x, int y)
    {
        Paint p = g.getPaint( ); // ��ȡԭ����ͼ����������
        BufferedImage buffImage
            = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB );

        Graphics2D gg = buffImage.createGraphics( );   
        gg.setColor( Color.yellow );
        gg.fillRect( 0, 0, 10, 10 ); // ��ͼ�񱳾�����Ϊ��ɫ
        gg.setColor( Color.blue );
        gg.drawRect( 1, 1, 6, 6 );   // ��һ����ɫ�ķ���
        gg.setColor( Color.green );
        gg.fillRect( 1, 1, 3, 3 );   // ��һ����ɫ��������
        gg.setColor( Color.red );
        gg.fillRect( 4, 4, 3, 3 );   // ��һ����ɫ��������
 
        g.setPaint( new TexturePaint(buffImage, new Rectangle( 10, 10 ) ) );
        g.fill( new Rectangle2D.Double( x, y, 100, 100 ) );
        g.setPaint( p );  // �ָ�ԭ����ͼ����������
    } // ����mb_drawRectangleTextureGraphics����

    public void mb_drawRectangleTextureImage(Graphics2D g, int x, int y)
    {
        Paint p = g.getPaint( ); // ��ȡԭ����ͼ����������
        BufferedImage buffImage;
        try
        {
            File f = new File("ts.jpg");
            buffImage = ImageIO.read(f); // ��ȡͼ��
            g.setPaint( 
                new TexturePaint(buffImage, new Rectangle( 50, 50 ) ) );
            g.fill( new Rectangle2D.Double( x, y, 100, 100 ) );
            g.setPaint( p );  // �ָ�ԭ����ͼ����������
        }
        catch (Exception e)
        {
            System.err.println("�����쳣:" + e);
            e.printStackTrace( );
        } // try-catch�ṹ����
    } // ����mb_drawRectangleTextureImage����

    protected void paintComponent(Graphics g)
    {
        mb_drawCircleGreen((Graphics2D)g, 20, 20);
        mb_drawCircleGradientPaint((Graphics2D)g, 140, 20);
        mb_drawRectangleTextureGraphics((Graphics2D)g, 260, 20);
        mb_drawRectangleTextureImage((Graphics2D)g, 380, 20);
    } // ����paintComponent����
} // ��J_Panel����

public class J_Texture extends JFrame
{
    public J_Texture( )
    {
        super("��ɫ��������������");
        Container c = getContentPane( );
        c.add(new J_Panel( ), BorderLayout.CENTER);
    } // J_Texture���췽������

    public static void main(String args[ ])
    {
        J_Texture app = new J_Texture( );

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(510, 180);
        app.setVisible(true);
    } // ����main����
} // ��J_Texture����
