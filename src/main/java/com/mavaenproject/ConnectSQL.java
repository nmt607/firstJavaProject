package com.mavaenproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectSQL {

	static final String DB_URL = "jdbc:mysql://localhost:3306/spamlienquan_db";
	static final String USER = "root";
	static final String PASS = "manhtien345";

	public static void main(String[] args) {
		System.out.println("connecting to a selected database...");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			if (conn != null) {
				System.out.println("Connected database successfully...");
			} else {
				System.out.println("Connected database fail");
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
