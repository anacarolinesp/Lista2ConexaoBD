package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {

	private static Connection connection;
	
	public static Connection getConnection() {
	
		if(connection == null) {
			try {	
				
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				connection = DriverManager.getConnection("jdbc:mysql://localhost/Delivery", "root", "200308041891/*-ana,");
				
			} catch (SQLException e) {
				
				throw new RuntimeException(e);
			}
		} 
			return connection;

	
	}	
}
