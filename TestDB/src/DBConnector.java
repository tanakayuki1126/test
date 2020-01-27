package src;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Connection;

	public class DBConnector {
		private statics String driverName ="com.mysql.jdbc.Driver";

		private statics String url =
				"jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";

			private static String user = "com.mysql.jdbc.Driver";
			private static String password  = "mysql";

		public Connection getConnnection() {
		Connection con = null;

		try {
		Class.forName(driverName);
		con = DriverManager.getConnnection(url,user,password);
		} cath (ClassNotFoundException e) {
		e.printStackTrace();
		}catch (SQLException e){
		e.printStackTrace();
		}
		return con;
		}
		}
