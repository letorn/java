package jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class TestCreateTable {

	public static void main(String[] args) throws Exception {
		Connection con = DB.getConnection();
		Statement stmt = con.createStatement();
		stmt.executeUpdate("create table if not exists emps(id int, name varchar(20))");
		con.close();
	}

}
