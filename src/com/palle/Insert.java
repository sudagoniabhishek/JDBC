package com.palle;
import java.sql.*;

public class Insert {

	public static void main(String[] args) {
		Statement s=null;
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee","root","abhi");
			 s=con.createStatement();
			String qry="insert into emp values(3,28,'Bhanu')";
			s.executeUpdate(qry);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				if(s!=null) {
				s.close();
				}
				if(con!=null) {
				con.close();
				}
			} catch (SQLException e) {
		
				e.printStackTrace();
			}
			
		}

	}

}
