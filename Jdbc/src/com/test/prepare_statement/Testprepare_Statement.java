package com.test.prepare_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Testprepare_Statement {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("***** Diver Loaded...*****");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydemo", "root", "root");
		System.out.println("***** Connection Done...*****");
		
		String sql="insert into employee values (?,?)";
		
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, 7);
		pst.setString(2, "bhushan patil");
		
		int k=pst.executeUpdate();
		if(k>0)
		{
			System.out.println("Record Inserted");
		}
	}
}
