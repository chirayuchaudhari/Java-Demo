package com.test.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("*****1. Diver Loaded...*****");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		System.out.println("*****2. Connection Done...*****");
		
		Statement st=con.createStatement();
		
		String sql="delete from employee where eid=11";
		st.executeUpdate(sql);
		
		System.out.println("Record Deleted");
		
		
		

	}

}
