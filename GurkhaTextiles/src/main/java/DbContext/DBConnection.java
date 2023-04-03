package DbContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection conn = null;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/gurkhaTextiles";
		String user = "root";
		String pass = "";
		conn = DriverManager.getConnection(url, user, pass);
		return conn;
	}
}
