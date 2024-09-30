package com.tns.daytwentyfour.usingpreparedstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection cn;
	static {
		try {

			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded...");
			cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Admin@123");
			System.out.println("Connection established...");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static Connection getCn()
	{
		return cn;
	}
}
