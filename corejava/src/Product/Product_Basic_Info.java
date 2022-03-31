package Product;

import java.util.Objects;

public class Product_Basic_Info  {
	public String Product_Id;
	String Product_Name;
	String Product_Category;
	String Product_Brand;
	float Product_price;
	int Product_rating;

	public Product_Basic_Info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product_Basic_Info(String product_Id, String product_Name, String product_Category, String product_Brand,
			float product_price, int product_rating) {
		super();
		this.Product_Id = product_Id;
		this.Product_Name = product_Name;
		this.Product_Category = product_Category;
		this.Product_Brand = product_Brand;
		this.Product_price = product_price;
		this.Product_rating = product_rating;
	}

	public String getProduct_Id() {
		return Product_Id;
	}
	public void setProduct_Id(String product_Id) {
		this.Product_Id = product_Id;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.Product_Name = product_Name;
	}
	public String getProduct_Category() {
		return Product_Category;
	}
	public void setProduct_Category(String product_Category) {
		this.Product_Category = product_Category;
	}
	public String getProduct_Brand() {
		return Product_Brand;
	}
	public void setProduct_Brand(String product_Brand) {
		this.Product_Brand = product_Brand;
	}
	public float getProduct_price() {
		return Product_price;
	}
	public void setProduct_price(float product_price) {
		this.Product_price = product_price;
	}
	public int getProduct_rating() {
		return Product_rating;
	}
	public void setProduct_rating(int product_rating) {
		this.Product_rating = product_rating;
	}
	
	
	@Override
	public String toString() {
		return "Product_Basic_Info [Product_Id=" + Product_Id + ", Product_Name=" + Product_Name + ", Product_Category="
				+ Product_Category + ", Product_Brand=" + Product_Brand + ", Product_price=" + Product_price
				+ ", Product_rating=" + Product_rating + "]";
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(Product_Brand, Product_Category, Product_Id, Product_Name, Product_price, Product_rating);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product_Basic_Info other = (Product_Basic_Info) obj;
		return Objects.equals(Product_Brand, other.Product_Brand)
				&& Objects.equals(Product_Category, other.Product_Category)
				&& Objects.equals(Product_Id, other.Product_Id) && Objects.equals(Product_Name, other.Product_Name)
				&& Float.floatToIntBits(Product_price) == Float.floatToIntBits(other.Product_price)
				&& Product_rating == other.Product_rating;
	}
	

	
}
