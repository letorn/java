package jdbc;

/*
 * 批处理
 */
import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestBatch {

	public static void main(String[] args) throws Exception {
		Connection con = DB.getConnection();
		PreparedStatement stmt = con.prepareStatement("insert into emps(id, name) values(?, ?)");

		for (int i = 0; i < 10; i++) {
			stmt.setInt(1, i);
			stmt.setString(2, "name" + i);
			// 添加待处理数据
			stmt.addBatch();
			if (i % 3 == 0) {
				// 执行批处理
				stmt.executeBatch();
			}
		}
		stmt.executeBatch();

		stmt.close();
		con.close();
	}

}
