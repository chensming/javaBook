
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class J_UdpServer {
	public static void main(String args[]) {
		DatagramSocket dSocket;
		DatagramPacket inPacket;
		DatagramPacket outPacket;
		InetAddress cAddr;
		int cPort;
		byte[] inBuffer = new byte[100];
		byte[] outBuffer;
		String s;


		try {
			dSocket = new DatagramSocket(8000);
			while(true) {
				inPacket = new DatagramPacket(inBuffer, inBuffer.length);
				dSocket.receive(inPacket);
				cAddr = inPacket.getAddress();
				cPort = inPacket.getPort();
				s = new String(inPacket.getData(), 0, inPacket.getLength());
				System.out.println("接收到客户端信息: " + s);
				System.out.println("客户端的主机名为: " + cAddr.getHostName());
				System.out.println("客户端端口为: " + cPort);

				Date d = new Date();
				outBuffer = d.toString().getBytes();
				outPacket = new DatagramPacket(outBuffer, outBuffer.length, cAddr, cPort);
				dSocket.send(outPacket);
			}		
		}catch(Exception e) {
			System.err.println("发生异常: " + e);
			e.printStackTrace();
		}
	}
}
