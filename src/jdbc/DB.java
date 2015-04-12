package jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.junit.Test;

public class DB {
	private static String driver;
	private static String url;
	private static String user;
	private static String password;

	static {
		try {
			Properties props = new Properties();
			// 获得类加载器
			ClassLoader cl = DB.class.getClassLoader();
			// 调用类加载器的方法去加载在类路径下的文件
			InputStream is = cl.getResourceAsStream("jdbc/db.properties");
			// 将文件的内容读到props对象中
			props.load(is);
			driver = props.getProperty("driver");
			url = props.getProperty("url");
			user = props.getProperty("user");
			password = props.getProperty("password");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static Connection getConnection() throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}

	@Test
	public void conTest() throws Exception {
		Connection con = getConnection();
		System.out.println(con);
	}
}
