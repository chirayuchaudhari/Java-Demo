package com.test.prepare_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Employee_prepare_statement {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("*****1. Diver Loaded...*****");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydemo", "root", "root");
		System.out.println("*****2. Connection Done...*****");
		
		ArrayList<Employee> emplist=new ArrayList<>();
		emplist.add(new Employee(8,"nitin khwalkar"));
		emplist.add(new Employee(9,"vishal gayakawad"));
		emplist.add(new Employee(10,"bhushan bavaskar"));
		emplist.add(new Employee(11,"roshan rajput"));
		
		String sql="insert into employee values(?,?)";
		
		for(Employee e:emplist) {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, e.getEid());
			pst.setString(2, e.getEname());
			pst.executeUpdate();
		}
		
		System.out.println("All data inserted...");
		
		con.close();
		
		
		
	}
}
