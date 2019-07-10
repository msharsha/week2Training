package jdbcconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Sapient123");
				Statement stmt = con.createStatement();
				//stmt.executeUpdate("insert into emp values('Madhvi',23)");
				//stmt.executeUpdate("delete from emp where age=23");
				stmt.executeUpdate("update emp set name='sheela' where age=11");
				ResultSet rs = stmt.executeQuery("select * from emp");
				while(rs.next()) {
					System.out.println("Name : "+rs.getString(1));
					System.out.println("Age : "+rs.getString(2));
				}
				stmt.close();
				rs.close();
				con.close();
			}
			catch (Exception e) {
				 System.out.println(e);
			}
		}

	}
