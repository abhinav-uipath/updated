package jdvc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public class JdbcViewRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Connection connection = null;
		final String username = "sa";
		final String password = "";
		final String jdbcurl = "jdbc:h2:~/test";

		String selectsql = "";
		// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); for ms server

		// String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
		// String user = "sa";
		// String pass = "";

		try {

			Class.forName("org.h2.Driver"); ///
			connection = DriverManager.getConnection(jdbcurl, username, password);/// authentication
			Statement statement = connection.createStatement();// this used for creating sql statement

			// for retrieve we use resultset

			selectsql = "select * from CUSTOMER ";

			ResultSet rs = statement.executeQuery(selectsql);

			while (rs.next()) {
				System.out.println("ID is: " + rs.getInt("id"));
				System.out.println("age is: " + rs.getString("age"));
				System.out.println("addres: is " + rs.getString("address"));
				System.out.println("salary is : " + rs.getString("salary"));

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}