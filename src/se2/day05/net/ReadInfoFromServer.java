package se2.day05.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 读取服务端发送的信息,客户端线程
 */
public class ReadInfoFromServer extends Thread {
	private InputStream is;

	public ReadInfoFromServer(InputStream is) {
		this.is = is;
	}

	public void run() {
		try {
			/*
			 * 1:将输入流转换为缓冲字节输入流BufferedReader 
			 * 2:循环读取信息 
			 * 3:将信息打印
			 */
			InputStreamReader reader = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(reader);
			// 2
			String info = null;
			while (true) {
				info = br.readLine();
				// 3
				System.out.println("服务端说:" + info);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
