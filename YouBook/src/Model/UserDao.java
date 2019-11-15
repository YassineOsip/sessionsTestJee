package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Entities.User;
import Model.DbConnection;

public class UserDao {
	
	private String url = "jdbc:mysql://localhost:3306/test";
	private String user = "root";
	private String password = "";
	private Connection conn = DbConnection.connect(url, user, password);
	
	public User checkUser(User user) {
		Statement st = null;
		try {
			   String statement = "SELECT * FROM users WHERE username ='"+  user.getUserName() + "' and password ='" + user.getPassword() + "'" ;
			   System.out.println(statement);
			   st = conn.createStatement();
			   ResultSet a = st.executeQuery(statement);
			   if(a.next()) {
				   String data = a.getString("data");
				   user.setData(data);
				   user.setValid(true);
			   }
			   else {
				   user.setValid(false);
			   }
		} catch (SQLException e) {
			e.getMessage();
		}
		return user;
	}
}
