package com.test.demo;
import java.sql.*;

public class student {
	public static void main(String[] args) {
		System.out.println("Student Details given below");
		System.out.println("Given Details are the students of LD College");
		System.out.println("1 student");
		System.out.println("2 Student");
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College","root","P@ssw0rd@123");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3));
				
			}
			con.close();
			
		}catch(Exception e) {System.out.println(e);}
		
	}

}
