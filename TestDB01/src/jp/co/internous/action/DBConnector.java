package jp.co.internous.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";

	private static String url =
			"jdbc:mysql://localhost/testdb01?autoReconnect=true&useSSL=false";

		private static String user = "com.mysql.jdbc.Driver";
		private static String password  = "mysql";

	public Connection getConnnection() {
	Connection con = null;

	try {
	Class.forName(driverName);
	con = DriverManager.getConnection(url,user,password);
	} catch (ClassNotFoundException e) {
	e.printStackTrace();
	}catch (SQLException e){
	e.printStackTrace();
	}
	return con;
	}
	}
