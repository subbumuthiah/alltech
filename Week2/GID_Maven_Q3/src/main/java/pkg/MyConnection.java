package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	static Connection conn;

	public static Connection getConnection() {
		String connectionUrl = "jdbc:mysql://localhost:3306/week2";
		try {
			conn = DriverManager.getConnection(connectionUrl, "root", "password");
		} catch (SQLException e) {
			System.out.println("err");
		}
		return conn;
	}
}
