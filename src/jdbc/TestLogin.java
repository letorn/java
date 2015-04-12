package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class TestLogin {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("用户名:");
		String user = scanner.next();
		System.out.print("密码:");
		String pwd = scanner.next();
		System.out.println(user + "," + pwd);

		String sql = "select count(*) from users where name=? and password=?";
		Connection con = DB.getConnection();
		// 预编译sql
		PreparedStatement stmt = con.prepareStatement(sql);
		// 传递参数
		stmt.setString(1, user);
		stmt.setString(2, pwd);
		// 执行sql
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			System.out.println("登录成功");
		} else {
			System.out.println("登录失败");
		}
		con.close();
	}

}
