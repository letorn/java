package se2.day05.net;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/*
 * 客户端
 * 1:创建Socket,并指定服务端ip以及服务端口号
 *     注意,一旦创建Socket实例,会立刻通过IP与端口连接服务端
 * 2:创建用于接收服务端信息的线程ReadInfoFromServer,并将对应服务端的输入流传入
 * 3:通过Socket获取输出流,用于发送信息给服务器
 * 4:发送信息
 */
public class Clinet {
	public static void main(String[] args) {
		try {
			// 1
			/*
			 * 表示本机的地址形式: 1:本机的IP:192.168.1.xxx 2:localhost 3:127.0.0.1
			 */
			// Socket socket = new Socket("localhost",8855);
			Socket socket = new Socket("localhost", 8855);

			ReadInfoFromServer thread = new ReadInfoFromServer(socket
					.getInputStream());
			thread.start();

			// 3
			OutputStream os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(os);

			// 4
			Scanner scanner = new Scanner(System.in);
			while (true) {
				pw.println(scanner.nextLine());
				pw.flush();// 真正的写出操作
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
