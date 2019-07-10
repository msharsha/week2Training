package jdbcconnectivity;
import java.util.*;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;;

public class DynamicJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				Scanner sc = new Scanner(System.in);
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Sapient123");
				String query = "select * from demo";
				PreparedStatement pstmt = con.prepareStatement(query);
				
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.println("Name : "+rs.getString(1));
					System.out.println("Age : "+rs.getString(2));
				}
				pstmt.close();
				rs.close();
				con.close();
				sc.close();
		}
		catch (Exception e) {
			 System.out.println(e);
		}

	}

}
