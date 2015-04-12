package jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class TestInsert {

	public static void main(String[] args) throws Exception {
		Connection con = DB.getConnection();
		Statement stmt = con.createStatement();
		stmt.executeUpdate("insert into emps(id, name) values(2, 'tom')");
		con.close();
	}

}
