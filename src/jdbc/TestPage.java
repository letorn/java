package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestPage {

	public static void main(String[] args) throws Exception {
		Connection con = DB.getConnection();

		int start = 2;
		int limit = 5;

		String sql = "select * from emps limit ?,?";

		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, start);
		stmt.setInt(2, limit);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			System.out.println("name: " + rs.getString("name"));
		}

		rs.close();
		stmt.close();
		con.close();
	}

}
