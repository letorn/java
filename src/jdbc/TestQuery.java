package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestQuery {

	public static void main(String[] args) throws Exception {
		Connection con = DB.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emps");

		while (rs.next()) {
			System.out.println("name: " + rs.getString("name"));
		}

		con.close();
	}

}
