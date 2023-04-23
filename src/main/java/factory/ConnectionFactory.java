package factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection() {
		
		Connection conn = null;
		
		String user = "user01";
		String pw = "user0101";
		String url = "jdbc:mysql://localhost:3306/controle_estoque";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
			throw new RuntimeException("Não foi possível estabelecer uma conexão com o banco de dados" + e.getMessage());
		}
		
		return conn;
	}
	
	
}