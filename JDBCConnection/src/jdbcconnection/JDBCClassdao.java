package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCClassdao {
	public static PreparedStatement pst;
	int id;
	String name;
	String dept;
	float salary;
	String hobby;
	public void insert() throws Exception
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter id, name,date,stock & price");
		pst.setInt(1,scanner.nextInt());
		pst.setString(2,scanner.next());
		pst.setString(3,scanner.next());
		pst.setFloat(4,scanner.nextFloat());
		pst.setString(5,scanner.next());
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
        Statement st=con.createStatement();
        JDBCClassdao daoobj=new JDBCClassdao();
        
      //insert statement
        String query1="insert into empdetail(eid,ename,dept,salary,hobby) values(?,?,?,?,?)";
        pst=con.prepareStatement(query1);
        daoobj.insert();
        int rows_affected_pst=pst.executeUpdate();
        System.out.println("Query ok, "+rows_affected_pst+"row affected");
        
       //update Statement
        Scanner scanner = new Scanner(System.in);
        String query2="update empdetail set salary=? where eid=?";
        pst=con.prepareStatement(query2);
        pst.setFloat(1, scanner.nextFloat());
        pst.setInt(2, scanner.nextInt());
        int rows_updated=pst.executeUpdate();
        System.out.println("Query ok, "+rows_updated+"row affected");
	
	    //delete Statement
        String query3="delete from empdetail where eid=?";
        pst=con.prepareStatement(query3);
        System.out.println("enter the empid of an employee to be removed:");
        pst.setInt(1, scanner.nextInt());
        int rows_deleted=pst.executeUpdate();
        System.out.println("Query ok, "+rows_deleted+"row affected");
        
        st.close();
        con.close();
	}

}