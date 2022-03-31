package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class update_n_insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement st=con.createStatement();
		update_n_insert dao=new update_n_insert();
		
		//insert satement
		String query1="insert into empdetail(ename,dept,salary,hobby) values(?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(query1);
		dao.insert();
		int rows_affected_pst=pst.executeUpdate();
		System.out.println("query ok,"+rows_affected_pst+"row affected by pst");
		
		//update statement
		Scanner scanner = new Scanner(System.in);
		String query2="update empdetail set hobby=? where eid=?";
		pst=con.prepareStatement(query2);
		pst.setString(1,scanner.next());
		pst.setInt(2,scanner.nextInt());
		int rows_updates=pst.executeUpdate();
		System.out.println("query ok ,"+rows_updates+"row updated by pst");
		
		st.close();
		con.close();
		
		

	}

	private void insert() {
		// TODO Auto-generated method stub
		
	}

}
