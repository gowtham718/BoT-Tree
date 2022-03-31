package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Product;
public class ProductController {
	
	public  List<Product>  findAllProducts() throws  SQLException{
		List<Product> productList=new ArrayList<Product>();
		String query="select * from product_project";
		ResultSet resultSet;
		try {
			resultSet=JdbcConnection.getResultSet();
		
	    //ResultSet resultset=JdbcConnection.getResultSet();
		while (resultSet.next()) {
			//System.out.println(resultset.getString("product_id")+"\t"+resultset.getString("product_name")+"\t"+resultset.getString("product_catogary")+"\t"+resultset.getFloat("product_price")+"\t"+resultset.getString("product_brand")+"\t"+resultset.getInt("product_rating"));
			String productId=resultSet.getString("product_id");
			String productname=resultSet.getString("product_name");
			String productcategory=resultSet.getString("product_category");
			float productprice=resultSet.getFloat("product_price");
			String productbrand=resultSet.getString("product_brand");
			int productrating=resultSet.getInt("product_rating");
			Product p = new Product(productId, productname, productcategory, productbrand, productprice, productrating);
			productList.add(p);
		}}catch(ClassNotFoundException | SQLException e ) {
			e.printStackTrace();
		}
		System.out.println(productList.size());
		return productList;
	}
		
		public void save() {
			String query1="insert into product_project (product_id,product_name,product_category,product_brand,product_price,product_rating) values(?,?,?,?,?,?)";

			int rows_inserted = 0;
			try {
				rows_inserted = JdbcConnection.saveRecord(query1);
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}

			  System.out.println("Query ok,"+rows_inserted+" row inserted");
			
		}
			
			
		public void modify() {
			String query2="update product.product_project set product_price=? where product_id=?";
			
			
			int rows_updated=0;
			try {
				rows_updated=JdbcConnection.modifyRecord(query2);
			}catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			     System.out.println("Query ok,"+rows_updated+" row modified");
			}
			


}
