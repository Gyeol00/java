package ch12;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerPt {
	public static void main(String[] args) {
		System.out.println("[Server]");
		
		ServerSocket serverSocket = null;
		
		try {
			
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
			
			System.out.println("연결 대기...");
			Socket socket = serverSocket.accept();
			
			System.out.println("연결 수립...");
			
			
			
			
			
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
