package View;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Controller.JdbcConnection;
import Controller.ProductController;
import model.Product;

public class MyProductProjectView {
	
	
	public MyProductProjectView() {
		super();
		//ProductController productController=new ProductController();
		//Scanner scanner = new Scanner(System.in);
		}
	
	public void display() throws ClassNotFoundException, SQLException {
		Label:
			while(true) {
				
		
		System.out.println(" welcome");
		System.out.println("1.Find All Product");
		System.out.println("2.Add Product");
		System.out.println("3.Modify Price");
		System.out.println("4.Exit");
		System.out.println("Enter your choise");
		Scanner scanner = new Scanner(System.in);
		int choise=scanner.nextInt();
		ProductController productController=new ProductController();
		switch(choise) {
		case 1:
			List<Product> productlist=productController.findAllProducts();
			for(Product p:productlist)
				System.out.println(p);
			Collections.sort(productlist,(p1,p2)->{return p1.getProductName().compareTo(p2.getProductName());});
			System.out.println("after sort");
			for(Product p:productlist)
				System.out.println(p);
			//ProductController.findAllProducts();
			break;
		case 2:
			productController.save();
			break;
		case 3:
			productController.modify();
			break;
		case 4:
			break Label;
			default:
				System.out.println("invalid option");
		}
	}}
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//Connection connection=JdbcConnection.getConnection();
		MyProductProjectView productProjectView = new MyProductProjectView();
		productProjectView.display();
	}

}
