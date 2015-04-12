package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import util.Config;

public class TestJDBC {

	public static void main(String[] args) throws Exception {
		Config config = new Config("src/jdbc/db.properties");
		Class.forName(config.getString("driver"));
		Connection con = DriverManager.getConnection(config.getString("url"), config.getString("user"), config.getString("password"));
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from users");
		while (rs.next()) {
			System.out.println("name" + rs.getString("name"));
		}
		con.close();
	}

}
