//客户端 
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
 
public class UDPTextFileClient
{
	public static void main(String[] args)
	{
		DatagramSocket ds=null;
		InputStream is=null;
		try
		{
			ds=new DatagramSocket(2000);
			System.out.println("客户端在 2000 监听");
			
			is=new FileInputStream(new File("D:/Desktop/vscodeProject/javaProject/javaBook/input.txt"));
			
			byte[] b=new byte[is.available()];
			is.read(b);
			
			DatagramPacket dp=new DatagramPacket(b,0,b.length);
			dp.setPort(1000);
			dp.setAddress(InetAddress.getByName("127.0.0.1"));
			
			ds.send(dp);
			System.out.println("文件发送成功");
		} catch (SocketException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				is.close();
				ds.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
			
		}
	}
}