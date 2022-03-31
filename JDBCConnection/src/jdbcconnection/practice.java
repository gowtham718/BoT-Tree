package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class practice {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement st=con.createStatement();
		String query1="insert into empdetail(eid,ename,dept,salary,hobby) values(?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(query1);
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the id:");
		int eid = scanner.nextInt();
		System.out.println("enter the name:");
		String ename = scanner.next();
		System.out.println("enter the dept:");
		String dept = scanner.next();
		System.out.println("enter the salary:");
		Float salary = scanner.nextFloat();
		System.out.println("enter the hobby:");
		String hobby = scanner.next();
		
		pst.setInt(1, eid);
		pst.setString(2,ename);
		pst.setString(3,dept);
		pst.setFloat(4,salary);
		pst.setString(5,hobby);
		
		int rows_affected_pst=pst.executeUpdate();
		System.out.println("query ok");
		
		ResultSet rs=st.executeQuery("select * from empdetail");
		while (rs.next()) {
			System.out.println(rs.getInt("eid")+" "+rs.getString("ename")+"   "+rs.getString("dept")+"   "+rs.getFloat("salary")+"   "+rs.getString("hobby"));
			}
		

			st.close();
			con.close();


	}

}
