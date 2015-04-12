package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {

	public static void main(String[] args) throws Exception {
		Connection con = DB.getConnection();

		PreparedStatement stmt = con.prepareStatement("select * from emps", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stmt.executeQuery();

		// rs.next();//向前
		// rs.previous();//向后
		// rs.absolute(row);//根据参数定位,绝对
		// rs.relative(rows)//根据参数定位,相对

		// 假分页
		rs.absolute(1);
		for (int i = 0; i < 10; i++) {
			if (rs.next()) {
				System.out.println("name: " + rs.getString("name"));
			}
		}

		rs.close();
		stmt.close();
		con.close();
	}

}
