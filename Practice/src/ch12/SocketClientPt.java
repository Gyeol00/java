package ch12;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketClientPt {
	public static void main(String[] args) {
		System.out.println("[Client]");
		
		Socket socket = null;
		
		
		try {
			socket = new Socket();
			
			System.out.println("연결요청...");
			
			socket.connect(new InetSocketAddress("127.0.0.1", 5001));
			System.out.println("연결성공...");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
