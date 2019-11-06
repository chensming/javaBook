import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//�ͻ��˲�����args[0]Ϊ 0/1 ��ʾ�ϴ�/���أ�arg[1]Ϊ�ļ���
public class Client {
	public static void main(String args[]) {
		InetAddress sAddr;
		byte[] inBuffer;
		
		try {
			DatagramSocket dSocket = new DatagramSocket();
			String s;
			int c;
			sAddr = InetAddress.getByName("127.0.0.1");
			if(args[0].equals("0")) {
				s = "�����ϴ�";
				try {
					byte[] uploadBuffer = new byte[1024];
                    String uploadFileName = "D:/Desktop/vscodeProject/javaProject/javaBook/network/FileTranslation/Weizhuo/Client/" + args[1];
					File target = new File(uploadFileName);
					FileInputStream fis = new FileInputStream(target);
					
					byte[] requestBuffer = s.getBytes();
					DatagramPacket outPacket = new DatagramPacket(requestBuffer,requestBuffer.length,sAddr,8000);
					dSocket.send(outPacket);
					
					//�����ļ���
					DatagramPacket namePacket = new DatagramPacket(
							args[1].getBytes(),args[1].getBytes().length,sAddr,8000);
					dSocket.send(namePacket);
					
					
					
					int i = 0; //test
					c = fis.read(uploadBuffer);
					while(c != -1) {
						System.out.println(i++);
						DatagramPacket uploadPacket = new DatagramPacket(uploadBuffer,c,sAddr,8000);
						dSocket.send(uploadPacket);
						//Thread.sleep(1);
						uploadBuffer = new byte[1024];
						c = fis.read(uploadBuffer);
					}
					DatagramPacket uploadPacket = new DatagramPacket(uploadBuffer,0,sAddr,8000);
					dSocket.send(uploadPacket);
					System.out.println("�ļ��ϴ��ɹ�!");
				}catch(FileNotFoundException e) {
					System.out.println("Ҫ�ϴ����ļ�������!");
					e.printStackTrace();
				}
			} else {
				s = "��������";
				byte[] requestBuffer = s.getBytes();
				DatagramPacket outPacket = new DatagramPacket(requestBuffer,requestBuffer.length,sAddr,8000);
				dSocket.send(outPacket);
				
				DatagramPacket namePacke = new DatagramPacket(args[1].getBytes(),args[1].getBytes().length,sAddr,8000);
				dSocket.send(namePacke);
				
				
				//���շ�����Ϣ
				inBuffer = new byte[10];
				DatagramPacket warningPacket = new DatagramPacket(inBuffer,inBuffer.length);
				dSocket.receive(warningPacket);
				String w = new String(warningPacket.getData(),0,warningPacket.getLength());
				System.out.println(w);
				if(w.equals("���ؿ�ʼ")) {
					byte[] outBuffer = new byte[1024];
					DatagramPacket downloadPacket;

                    String downloadFileName = "D:/Desktop/vscodeProject/javaProject/javaBook/network/FileTranslation/Weizhuo/Client/" + args[1]; 
					File target = new File(downloadFileName);
					FileOutputStream fos = new FileOutputStream(target);
					c = 0;
					while(true) {
//						System.out.println(c++);
						downloadPacket = new DatagramPacket(outBuffer,outBuffer.length);
						dSocket.receive(downloadPacket);
						if(downloadPacket.getLength() == 0)
							break;
						fos.write(downloadPacket.getData(),0,downloadPacket.getLength());
						fos.flush();
					}
					fos.close();
					System.out.println("�ļ�" + args[1] + "���سɹ�!");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
