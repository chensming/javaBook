import java.io.BufferedOutputStream; 
import java.io.DataOutputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.net.DatagramPacket; 
import java.net.DatagramSocket; 

public class UdpReceive { 

	public static DatagramSocket dataSocket; 
	public static final int PORT = 8; 
	public static byte[] receiveByte; 
	public static DatagramPacket dataPacket; 
	public static void main(String[] args) throws IOException { 
		dataSocket = new DatagramSocket(PORT); 
		DataOutputStream fileOut = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("D:/Desktop/vscodeProject/javaProject/javaBook/output.txt"))); 
		int i = 0; 
		while(i == 0){//�����ݣ���ѭ�� 
			receiveByte = new byte[1024]; 
			dataPacket = new DatagramPacket(receiveByte, receiveByte.length); 
			dataSocket.receive(dataPacket); 
			i = dataPacket.getLength(); 
			//�������� 
			if(i > 0){ 
				//ָ�����յ����ݵĳ��ȣ���ʹ��������������ʾ����ʼʱ�����׺�����һ�� 
				fileOut.write(receiveByte,0,i); 
				fileOut.flush(); 
				i = 0;//ѭ������ 
			} 
		} 
	} 
} 