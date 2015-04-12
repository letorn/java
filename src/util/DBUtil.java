package util;

import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DBUtil {

	// 数据源连接池对象
	private static DataSource dataSource;
	// 将一个对象和线程绑定
	private static ThreadLocal<Connection> localConn = new ThreadLocal<Connection>();

	static {
		try {
			Properties props = new Properties();
			// 加载dbcp.properties配置参数
			props.load(DBUtil.class.getClassLoader().getResourceAsStream("db.properties"));
			// 利用dbcp组件创建DataSource对象
			dataSource = BasicDataSourceFactory.createDataSource(props);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 返回连接
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		// 获取和当前线程相关的connection
		Connection conn = localConn.get();
		try {
			if (conn == null || conn.isClosed()) {// 如果没有,或已关闭
				conn = dataSource.getConnection();// 获取新的connection
				localConn.set(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * 关闭连接
	 */
	public static void closeConnection() {
		// 获取和当前线程相关的connection
		Connection conn = localConn.get();
		// 清除和线程绑定的connection
		localConn.set(null);// 下次调用getConnection时要新建
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 操作回滚
	 */
	public static void rollback() {
		Connection conn = localConn.get();
		try {
			if (conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
