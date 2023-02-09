package com.palle;
import java.sql.*;

public class Select{

	public static void main(String[] args) {
		Statement s=null;
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee","root","abhi");
			 s=con.createStatement();
			String qry="select * from emp";
			ResultSet rs=s.executeQuery(qry);
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getInt(2));
				System.out.println(rs.getNString(3));
			}
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
