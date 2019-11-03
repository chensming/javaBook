
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
				dSocket.receive(inPacket); //�������ݱ�
				cAddr = inPacket.getAddress();
				cPort = inPacket.getPort();
				s = new String(inPacket.getData(), 0, inPacket.getLength());
				System.out.println("���յ��ͻ�����Ϣ: " + s);
				System.out.println("�ͻ��˵�������Ϊ: " + cAddr.getHostName());
				System.out.println("�ͻ��˶˿�Ϊ: " + cPort);

				Date d = new Date();
				outBuffer = d.toString().getBytes();
				outPacket = new DatagramPacket(outBuffer, outBuffer.length, cAddr, cPort);
				dSocket.send(outPacket); //�������ݱ�
			} //whileѭ������	
		}catch(Exception e) {
			System.err.println("�����쳣: " + e);
			e.printStackTrace();
		}
	}
}
