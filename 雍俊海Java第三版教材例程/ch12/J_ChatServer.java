// ////////////////////////////////////////////////////////
// 
// J_ChatServer.java
// 与J_ChatClient.java一起运行
// 开发者: 雍俊海
// ////////////////////////////////////////////////////////
// 简介:
//     基于TCP的聊天例程——服务器端程序部分。
// ////////////////////////////////////////////////////////
//     雍俊海. Java程序设计教程(第3版). 北京: 清华大学出版社. 2014.
// ////////////////////////////////////////////////////////

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class J_ChatServer extends JFrame
{
    private ObjectInputStream m_input;   // 输入流
    private ObjectOutputStream m_output; // 输出流
    private JTextField m_enter;  // 输入区域
    private JTextArea m_display; // 显示区域
    private int m_clientNumber = 0; // 连接的客户数

    public J_ChatServer( ) // 在图形界面中添加组件
    {
        super("聊天程序服务器端");
        Container c = getContentPane( );
        m_enter = new JTextField( );
        m_enter.setEnabled( false );
        m_enter.addActionListener(new ActionListener( )
            {        
                public void actionPerformed( ActionEvent event )
                { // 向客户端发送数据
                    try
                    {
                        String s = event.getActionCommand( );
                        m_output.writeObject( s );
                        m_output.flush( );
                        mb_displayAppend( "服务器端: " + s );
                        m_enter.setText( "" ); // 清除输入区域的原有内容
                    }
                    catch (Exception e)
                    {
                        System.err.println("发生异常:" + e);
                        e.printStackTrace( );
                    } // try-catch结构结束
                } // 方法actionPerformed结束
            } // 实现接口ActionListener的内部类结束
        ); // addActionListener方法调用结束
        c.add( m_enter, BorderLayout.NORTH );
        m_display = new JTextArea( );
        c.add( new JScrollPane( m_display ), BorderLayout.CENTER );
    } // J_ChatServer构造方法结束

    public void mb_displayAppend( String s )
    {
        m_display.append( s + "\n" );
        m_display.setCaretPosition( m_display.getText( ).length( ) );
        m_enter.requestFocusInWindow( ); // 转移输入焦点到输入区域
    } // 方法mb_displayAppend结束

    public boolean mb_isEndSession( String m )
    {
        if (m.equalsIgnoreCase("q"))
            return(true);
        if (m.equalsIgnoreCase("quit"))
            return(true);
        if (m.equalsIgnoreCase("exit"))
            return(true);
        if (m.equalsIgnoreCase("end"))
            return(true);
        if (m.equalsIgnoreCase("结束"))
            return(true);
        return(false);
    } // 方法mb_isEndSession结束

    public void mb_run( )
    {
        try
        {
            ServerSocket server = new ServerSocket(5000);
            String m; // 来自客户端的消息
            while (true)
            {
                m_clientNumber++;
                mb_displayAppend("等待连接[" + m_clientNumber + "]");
                Socket s = server.accept( );
                mb_displayAppend("接收到客户端连接[" + m_clientNumber + "]");
                m_output = new ObjectOutputStream( s.getOutputStream( ) );
                m_input = new ObjectInputStream( s.getInputStream( ) );
                m_output.writeObject("连接成功");
                m_output.flush( );
                m_enter.setEnabled( true );
                do
                {
                    m = (String) m_input.readObject( );
                    mb_displayAppend("客户端: " + m);
                } while(!mb_isEndSession( m ));// do-while循环结束 
                m_output.writeObject("q"); // 通知客户端退出程序
                m_output.flush( );
                m_enter.setEnabled( false );
                m_output.close( );
                m_input.close( );
                s.close( );
                mb_displayAppend("连接[" + m_clientNumber + "]结束");
            } // while循环结束
        }
        catch (Exception e)
        { 
            System.err.println("发生异常:" + e);
            e.printStackTrace( );
            mb_displayAppend("连接[" + m_clientNumber + "]发生异常");
        } // try-catch结构结束 
    } // 方法mb_run结束

    public static void main(String args[ ])
    {
        J_ChatServer app = new J_ChatServer( );

        app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        app.setSize(350, 150);
        app.setVisible(true);
        app.mb_run( );
    } // 方法main结束
} // 类J_ChatServer结束


//{J_UdpServer.java J_UdpClient.java}