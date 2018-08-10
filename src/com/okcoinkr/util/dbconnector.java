package com.okcoinkr.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class dbconnector {
	static String url = "jdbc:mysql://localhost/board?useUnicode=true&characterEncoding=UTF-8";
	static String user = "root";
	static String pass = "root";

	static Connection connection = null;

	public static Connection dbcon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(url, user, pass);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
