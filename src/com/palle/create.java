package com.palle;

import java.sql.*;

public class create {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee","root","abhi");
			Statement s=con.createStatement();
			s.executeUpdate("create table emp(sno int,age int,Name varchar(40))");
			s.close();
			con.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
