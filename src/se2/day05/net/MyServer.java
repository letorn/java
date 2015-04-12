package se2.day05.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 服务端
 * 1:创建ServerSocket,并指定服务端口
 * 2:通过ServerSocket侦听客户端连接
 * 3:打印连接成功
 * 4:获取连接客户端的Socket
 * 5:创建用于给客户端发信息的线程SendInfoToClientThread,并将对应客户端的输出流传入
 * 6:通过Socket获取输入流,用于读取来自客户端发送过来的信息
 * 7:将信息打印到控制台
 */
public class MyServer {
	public static void main(String[] args) {
		try {
			// 1
			ServerSocket server = new ServerSocket(8855);

			while (true) {
				// 2
				Socket socket = server.accept();
				// 3
				System.out.println("有客户端和我连上了!!");
				// 4
				/*
				 * 通过Socket获取客户端发送过来的信息
				 */
				InputStream is = socket.getInputStream();
				InputStreamReader reader = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(reader);
				// 5
				SendInfoToClientThread thread = new SendInfoToClientThread(
						socket.getOutputStream());
				thread.start();
				String info = null;
				while (true) {
					// 6
					info = br.readLine();// 读取一行信息
					// 7
					System.out
							.println(socket.getInetAddress() + "客户端说:" + info);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
