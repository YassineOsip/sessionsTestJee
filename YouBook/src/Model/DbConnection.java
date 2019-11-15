package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	public static Connection connect(String url, String user,String passwd) {
		Connection conn = null;
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(url,user,passwd);
			} catch (SQLException e) {
					e.printStackTrace();		
				}
		return conn;
			}

public static boolean end(Connection conn) {
	try {
		conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return true;
	
}
}
