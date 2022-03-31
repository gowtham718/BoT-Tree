package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcConnection {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");
		return connection;
		
	}
	public static ResultSet getResultSet() throws SQLException, ClassNotFoundException {
		Connection connection =null;
		try {
			connection=getConnection();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		//Connection connection=getConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from product_project");
//		while (resultSet.next()) {
//			System.out.println(resultSet.getString("product_id")+resultSet.getString("product_name")+resultSet.getString("product_category")+resultSet.getFloat("product_price")+resultSet.getString("product_brand")+resultSet.getInt("product_rating"));
//		}
		
		//statement.close();
		//connection.close();
		return resultSet;
		
		
	}
	
	public static int saveRecord(String query1) throws ClassNotFoundException, SQLException {
		Connection connection=getConnection();
		PreparedStatement pst=connection.prepareStatement(query1);
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the product id : ");
		String productId=scanner.next();
		System.out.println("enter the product name : ");
		String productName=scanner.next();
		System.out.println("enter the product category : ");
		String productCategory=scanner.next();
		System.out.println("enter the product brand : ");
		String productBrand=scanner.next();
		System.out.println("enter the product price : ");
		Float productprice=scanner.nextFloat();
		System.out.println("enter the product rating : ");
		int productrating=scanner.nextInt();
		
		pst.setString(1, productId);
		pst.setString(2, productName);
		pst.setString(3, productCategory);
		pst.setString(4, productBrand);
		pst.setFloat(5, productprice);
		pst.setInt(6, productrating);
		
		int rows_inserted=pst.executeUpdate();
		return rows_inserted;
		
	}
	
	public static int modifyRecord(String query2) throws ClassNotFoundException, SQLException {
		Connection connection=getConnection();
		PreparedStatement pst=connection.prepareStatement(query2);
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the product price : ");
		Float productprice=scanner.nextFloat();
		System.out.println("enter the product id : ");
		String productId=scanner.next();
		pst.setFloat(1, productprice);
		pst.setString(2, productId);	
		
		
		
		int rows_updated=pst.executeUpdate();
		System.out.println(rows_updated+"record updated successfully");
		return rows_updated;
		
	}
	
}
