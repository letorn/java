package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestExceute {

	public static void main(String[] args) throws Exception {
		Connection con = DB.getConnection();
		Statement stmt = con.createStatement();

		boolean b = stmt.execute("select * from emps");// true为查询语句
		if (b) {
			ResultSet rs = stmt.getResultSet();// 获取上一查询所得到的结果集
			while (rs.next()) {
				System.out.println("name: " + rs.getString("name"));
			}
		} else {
			int rows = stmt.getUpdateCount();
		}

		con.close();
	}

}
