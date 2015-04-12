package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class TestMetaData {

	public static void main(String[] args) throws Exception {
		Connection con = DB.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emps");
		// 获取结果集的元数据,用于封装结果集的"表头"信息
		ResultSetMetaData rsmd = rs.getMetaData();

		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.println(rsmd.getColumnName(i) + ": " + rsmd.getColumnTypeName(i));
		}

		con.close();
	}

}
