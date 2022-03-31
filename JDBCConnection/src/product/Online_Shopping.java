package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Online_Shopping extends Product_Basic_Info {
	
	Product_Basic_Info available_product[] =new Product_Basic_Info[4];
	
	
	
	
	public Online_Shopping() {
		super();
		available_product[0]= new Product_Basic_Info ("G001","Shirt","Clothing","Peter England",2000.95f,4);
		available_product[1]= new Product_Basic_Info ("G002","trouser","Clothing","polo",1500.99f,5);
		available_product[2]= new Product_Basic_Info ("G010","Phone","Gadgets","Redmi",18000.99f,5);
		available_product[3]= new Product_Basic_Info ("G011","HeadPhone","Gadgets","boat",1800,5);
		// TODO Auto-generated constructor stub
		
		List<Product_Basic_Info> list=new LinkedList<Product_Basic_Info>();
		list.add(available_product[0]);
		list.add(available_product[1]);
		list.add(available_product[2]);
		list.add(available_product[3]);
	}

	public Online_Shopping(String product_Id, String product_Name, String product_Category, String product_Brand,
			float product_price, int product_rating) {
		super(product_Id, product_Name, product_Category, product_Brand, product_price, product_rating);
		// TODO Auto-generated constructor stub
	}

	public void item_search() {
		//int product_price =100;
		System.out.println("please enter the product id once again to check whether the product as discount or not ");
		Scanner s=new Scanner(System.in);
		String Product_Id=s.next();
		//System.out.println("please enter the product id once again to check whether the product as discount or not ");
		for (Product_Basic_Info i: available_product) {
		if(Product_Id.equalsIgnoreCase(i.Product_Id)) {
			System.out.println("the item searched is shirt with the 12% discount on the actual price");
		}
		//else { 
			//System.out.println("the item searched is shirt with the 3% discount on the actual price ");
			
		//}
		}
	}
	
    public void printavailableitems() throws ClassNotFoundException, SQLException{ 
    	System.out.println("welcome to online shopping ");
        System.out.println("==================================");
        System.out.println("available ITEMS:");        
        System.out.println("==================================");
        Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");
    	Statement st=con.createStatement();
    	ResultSet rs=st.executeQuery("select * from product_project");
       // while (rs.next()) {
        for (Product_Basic_Info p : available_product) {
        	while (rs.next()) {
            System.out.println("PRODUCT ID: "+rs.getString("product_Id"));
            System.out.println("PRODUCT NAME: "+rs.getString("product_name"));
            System.out.println("PRODUCT category: "+rs.getString("product_category"));
            System.out.println("PRODUCT price: "+rs.getFloat("product_price"));
            System.out.println("PRODUCT brand: "+rs.getString("product_brand"));
            System.out.println("PRODUCT rating: "+rs.getString("product_rating"));
            //super.emi();
            System.out.println("**************************************");
           
        
        } 
    }}
	public Product_Basic_Info[] getAvailable_product() {
		return available_product;
	}

	public void setAvailable_product(Product_Basic_Info[] available_product) {
		this.available_product = available_product;
	}}
