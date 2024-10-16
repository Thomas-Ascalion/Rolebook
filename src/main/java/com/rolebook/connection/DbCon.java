package com.rolebook.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCon {

	private static Connection connection = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		if(connection == null) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/xprod","root","Creu71!couillon");
			System.out.print("Je suis connecté à la base de donnée");
			
		}
		return connection;
	}


	}
	

