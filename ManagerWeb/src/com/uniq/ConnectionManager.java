package com.uniq;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	static Connection conn = null;
	
	static String url = "jdbc:mysql://localhost:3306/cps";

	
	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String username = "root"; // "e539022";
			String password = "root"; // "zqbAlmQox";
			
			conn = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
