package jdbcconnection;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc_demo {

	public static void main(String[] args) throws SQLException{
		
		String url="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="root";
		String query="select * from empdetail";
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con = DriverManager.getConnection(url,username,password);
		
		Statement st=con.createStatement();
		//st.executeQuery(query);
		ResultSet rs=st.executeQuery(query);
		
		/*	// for single element
		rs.next();
		System.out.println(rs.getString("ename"));
		
		// for a set of values
		*while(rs.next()) {
		System.out.println(rs.getString("ename"));
		System.out.println(rs.getString(1));}*/
		
		// for a set of value with id
		String name;
		int id;
		//timestamp d;
		while (rs.next()) {
			name=rs.getString("ename");
			id=rs.getInt("eid");
			//System.out.println(rs.getString("ename"+rs.getString("eid));
			System.out.println(name+" "+id);
		}
		st.close();
		con.close();
		
		
	}

}
