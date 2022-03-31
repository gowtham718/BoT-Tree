package Product;

import java.util.Objects;

public class Amazon extends Online_Shopping {
	
	//int amazon_id;
	//String amazon_product_name;
	//String product_color;
	float amazon_special_discount;
	//int product_rating;
	
	
	public Amazon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Amazon(int amazon_id, String amazon_product_name, String product_color, float amazon_special_discount,
			int product_cashback, int product_rating) {
		super();
		//this.amazon_id = amazon_id;
		//this.amazon_product_name = amazon_product_name;
		//this.product_color = product_color;
		this.amazon_special_discount = amazon_special_discount;
		//this.product_rating = product_rating;
	}
	
	public float getAmazon_special_discount() {
		return amazon_special_discount;
	}
	public void setAmazon_special_discount(float amazon_special_discount) {
		this.amazon_special_discount = amazon_special_discount;
	}
	
	public void emi() {
		if(Product_price >5000) {
			System.out.println("this product get upto 2 month 0% EMI ");
		}
		else if(Product_price>10000) {
			System.out.println("this product get upto 4 month 0% EMI ");
		}
		else {
			System.out.println("this product will not Eligible for EMI ");
		}
	}
	public void cashback() {
		if(Product_price >5000) {
			System.out.println("this product will get 100 Rupee Amazon cashback card  ");
		}
		else if(Product_price>10000) {
			System.out.println("this product will get 500 Rupee Amazon cashback card ");
		}
		else if(Product_price>15000) {
			System.out.println("this product will get 1000 Rupee Amazon cashback card ");
		}
		else {
			System.out.println("this product will not Eligible for cashback  ");
		}
	}


}
