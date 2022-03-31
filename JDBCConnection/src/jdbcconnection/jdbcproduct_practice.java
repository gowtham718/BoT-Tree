package jdbcconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class jdbcproduct_practice  {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		/*String url="jdbc:mysql://localhost:3306/product";
		String username="root";
		String password="root";
		String query="select * from product_project";
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Class.forName("com.mysql.cj.jdbc.Driver");// another methed for call the driver
		Connection con = DriverManager.getConnection(url,username,password);
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		String name;
		String id;
		String category;
		float price;
		String rating;
		String brand;
		while (rs.next()) {
			name=rs.getString("product_name");
			id=rs.getString("product_id");
			category=rs.getString("product_category");
			price=rs.getFloat("product_price");
			rating =rs.getString("product_rating");
			brand=rs.getString("product_brand");
			System.out.println(name+"   "+id+"   "+category+"   "+price+"   "+rating+"   "+brand);
		}
		st.close();
		con.close();*/
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");
		Statement st=con.createStatement();
		int roes_affected=st.executeQuery("insert into empdetail(eid,ename,dept,salary,hobby) values (11,'gowtham','ece',40000,'play'") ;
	//	System.out.println();
		ResultSet rs=st.executeQuery("select * from product_project");
		while (rs.next()) {
		System.out.println(rs.getString("product_name")+"   "+rs.getString("product_id")+"   "+rs.getString("product_category")+"   "+rs.getFloat("product_price")+"   "+rs.getString("product_rating")+"   "+rs.getString("product_brand"));
		}
		st.close();
		con.close();
		 

	}

}
