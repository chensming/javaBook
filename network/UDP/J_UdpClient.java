
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class J_UdpClient {
	public static void main(String args[]) {
		DatagramPacket inPacket;
		InetAddress sAddr;
		byte[] inBuffer = new byte[100];
		
		try {
			DatagramSocket dSocket = new DatagramSocket();
			if(args.length == 0) {
				sAddr = InetAddress.getByName("127.0.0.1");
			} else {
				sAddr = InetAddress.getByName(args[0]);
			}
			String s = "请求连接";
			byte[] outBuffer = s.getBytes();
			DatagramPacket outPacket = new DatagramPacket(
				outBuffer, outBuffer.length, sAddr, 8000
					);
			dSocket.send(outPacket); //发送数据报
			
			inPacket = new DatagramPacket(inBuffer, inBuffer.length);
			dSocket.receive(inPacket); //接受数据报
			s = new String(inPacket.getData(), 0, inPacket.getLength());
			System.out.println("接收到服务端信息: " + s);
			
			dSocket.close();
		}catch(Exception e) {
			System.err.println("发生异常: " + e);
			e.printStackTrace();
		}
	}
}
