package com.palle;
import java.sql.*;

public class Update{

	public static void main(String[] args) {
		Statement s=null;
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee","root","abhi");
			 s=con.createStatement();
			String qry="update emp set age=50,Name='Ramu' where sno=2";
			s.executeUpdate(qry);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				if(s!=null){
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
