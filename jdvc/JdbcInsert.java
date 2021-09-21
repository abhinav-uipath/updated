package jdvc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class JdbcInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection connection = null;
        final String username = "sa";
        final String password = "";
        final String jdbcurl = "jdbc:h2:~/test";
        try {

			Class.forName("org.h2.Driver"); ///
			connection = DriverManager.getConnection(jdbcurl, username, password);/// authentication
			Statement statement = connection.createStatement();// this used for creating sql statement

			
			//  String sql = "CREATE TABLE customer " + "(id INTEGER not NULL, " +
			//  " age VARCHAR(255), " + " address VARCHAR(255), " + " salary INTEGER, " +
		//	  " PRIMARY KEY ( id ))";
		//statement.executeUpdate(sql);	 

			String insert = "INSERT INTO CUSTOMER VALUES (3,'32','Ahmedabad',2000);";
			statement.executeUpdate(insert);

			System.out.println("done...");

		
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}