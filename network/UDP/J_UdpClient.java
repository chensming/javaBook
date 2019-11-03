
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
			String s = "��������";
			byte[] outBuffer = s.getBytes();
			DatagramPacket outPacket = new DatagramPacket(
				outBuffer, outBuffer.length, sAddr, 8000
					);
			dSocket.send(outPacket); //�������ݱ�
			
			inPacket = new DatagramPacket(inBuffer, inBuffer.length);
			dSocket.receive(inPacket); //�������ݱ�
			s = new String(inPacket.getData(), 0, inPacket.getLength());
			System.out.println("���յ��������Ϣ: " + s);
			
			dSocket.close();
		}catch(Exception e) {
			System.err.println("�����쳣: " + e);
			e.printStackTrace();
		}
	}
}
