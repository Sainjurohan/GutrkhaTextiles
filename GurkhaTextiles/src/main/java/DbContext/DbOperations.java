//package DbContext;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import javax.servlet.http.HttpSession;
//
//public class DbOperations {
//	private DBConnection dbConnection;
//	public String getDbUser(HttpSession session) throws ClassNotFoundException, SQLException {
//		Connection connection = dbConnection.getConnection();
//		String activeUser = (String) session.getAttribute('user');
//		String querry = "SELECT * from userlogin where username = "+activeUser;
//		Statement stmt = connection.createStatement();
//		ResultSet result = stmt.executeQuery(querry);
//		return null;
//	}
//
//}
