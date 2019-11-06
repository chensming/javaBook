import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//客户端参数，args[0]为 0/1 表示上传/下载，arg[1]为文件名
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
				s = "请求上传";
				try {
					byte[] uploadBuffer = new byte[1024];
                    String uploadFileName = "D:/Desktop/vscodeProject/javaProject/javaBook/network/FileTranslation/Weizhuo/Client/" + args[1];
					File target = new File(uploadFileName);
					FileInputStream fis = new FileInputStream(target);
					
					byte[] requestBuffer = s.getBytes();
					DatagramPacket outPacket = new DatagramPacket(requestBuffer,requestBuffer.length,sAddr,8000);
					dSocket.send(outPacket);
					
					//发送文件名
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
					System.out.println("文件上传成功!");
				}catch(FileNotFoundException e) {
					System.out.println("要上传的文件不存在!");
					e.printStackTrace();
				}
			} else {
				s = "请求下载";
				byte[] requestBuffer = s.getBytes();
				DatagramPacket outPacket = new DatagramPacket(requestBuffer,requestBuffer.length,sAddr,8000);
				dSocket.send(outPacket);
				
				DatagramPacket namePacke = new DatagramPacket(args[1].getBytes(),args[1].getBytes().length,sAddr,8000);
				dSocket.send(namePacke);
				
				
				//接收返回信息
				inBuffer = new byte[10];
				DatagramPacket warningPacket = new DatagramPacket(inBuffer,inBuffer.length);
				dSocket.receive(warningPacket);
				String w = new String(warningPacket.getData(),0,warningPacket.getLength());
				System.out.println(w);
				if(w.equals("下载开始")) {
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
					System.out.println("文件" + args[1] + "下载成功!");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
