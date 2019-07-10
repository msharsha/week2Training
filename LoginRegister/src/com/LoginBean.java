package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginBean {
	String name;
	String pwd;
	public String getName() {
		return name;
	}
	
	public LoginBean(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public boolean verifyPwd(String name,String pwd) {
		boolean flag=false;
		if(pwd.equals(this.pwd)) {
			try {	
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Sapient123");
				String query = "select * from demo";
				PreparedStatement pstmt = con.prepareStatement(query);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					if(rs.getString(1).equals(name)) {
						if(rs.getString(4).equals(pwd)) {
							flag=true;
						}
					}
				}
				pstmt.close();
				rs.close();
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}
}
