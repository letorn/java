package se2.day05.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class LetornServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8855);
			while (true) {
				Socket socket = server.accept();
				InputStream is = socket.getInputStream();
				InputStreamReader reader = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(reader);
				SendInfoToClientThread thread = new SendInfoToClientThread(
						socket.getOutputStream());
				thread.start();
				String info = null;
				while (true) {
					System.out.println(socket.getInetAddress() + "客户端说:"
							+ br.readLine());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
