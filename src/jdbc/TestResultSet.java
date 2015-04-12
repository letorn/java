package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestResultSet {

	public static void main(String[] args) throws Exception {
		Connection con = DB.getConnection();
		PreparedStatement stmt = con.prepareStatement("select * from emps");
		// 用于设置每次取得数据大小
		stmt.setFetchSize(4);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			System.out.println("name: " + rs.getString("name"));
		}

		rs.close();
		stmt.close();
		con.close();
	}

}
