package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class RegisterBean {
	String name;
	int age;
	String email;
	String pwd;
	String cpwd;
	public String getCpwd() {
		return cpwd;
	}
	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public RegisterBean(String name, int age, String email, String pwd,String cpwd) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.pwd = pwd;
		this.cpwd = cpwd;
	}
	public boolean verifyReg(String name,int age, String email,String pwd,String cpwd) {
		boolean flag=false;
		System.out.println(name+age+email+pwd+cpwd);
		if(pwd.equals(cpwd)) {
			try {	
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Sapient123");
				PreparedStatement pstmt = con.prepareStatement("insert into demo values(?,?,?,?)");
				pstmt.setString(1, name);
				pstmt.setInt(2, age);
				pstmt.setString(3, email);
				pstmt.setString(4, pwd);
				int i=pstmt.executeUpdate();
				if(i!=0)
					flag=true;
				else
					flag=false;
				pstmt.close();
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}
	
}
