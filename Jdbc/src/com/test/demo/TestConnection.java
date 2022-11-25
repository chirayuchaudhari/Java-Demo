package com.test.demo;

import java.security.interfaces.RSAKey;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("*****1. Diver Loaded...*****");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydemo", "root", "root");
		System.out.println("*****2. Connection Done...*****");
		
		Statement st=con.createStatement();
		System.out.println("*****3. Create Statement...*****");
		
		String sql="select * from student";
		st.executeQuery(sql);
		ResultSet rs=st.executeQuery(sql);
		System.out.println("*****4. Process the query...*****");
		
		while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		System.out.println("*****5.Process the result...*****");
		
		
		con.close();
		System.out.println("*****6. close connection...*****");
	}

}
