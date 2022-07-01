package br.senac.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/bank";
	private static final String USER = "senac";
	private static final String PASS = "1a2b3c";
	
	public static  Connection getConnection() {
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USER, PASS);
		}
		catch (ClassNotFoundException | SQLException ex){
			throw new RuntimeException(ex);
			
		}
	}

	public static void closeConnection(Connection connection) {
		try {
			if (connection != null) {
				connection.close();
			}
		}
		catch (SQLException ex){
			throw new RuntimeException(ex);
		}	
	}

}
