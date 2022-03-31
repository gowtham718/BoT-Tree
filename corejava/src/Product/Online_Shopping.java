package Product;

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
	
    public void printavailableitems(){ 
    	System.out.println("welcome to online shopping ");
        System.out.println("==================================");
        System.out.println("available ITEMS:");        
        System.out.println("==================================");
        for (Product_Basic_Info p : available_product) {
            System.out.println("PRODUCT ID: "+p.getProduct_Id());
            System.out.println("PRODUCT NAME: "+p.getProduct_Name());
            System.out.println("PRODUCT category: "+p.getProduct_Category());
            System.out.println("PRODUCT price: "+p.getProduct_price());
            System.out.println("PRODUCT brank: "+p.getProduct_Brand());
            System.out.println("PRODUCT rating: "+p.getProduct_rating());
            //super.emi();
            System.out.println("**************************************");
            
        } 
    }
	public Product_Basic_Info[] getAvailable_product() {
		return available_product;
	}

	public void setAvailable_product(Product_Basic_Info[] available_product) {
		this.available_product = available_product;
	}

	/*public void addToCart(Product p){
        items.add(p);
    }
	void compare() {
		
	}
	void payment() {
		
	}
	void add_to_cart() {
		
	}*/



}
