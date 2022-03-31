package Model;


public class Product {
	 String productID;
	 String productName;
	 int price;
	 int quantity;
	public Product() {
		
	}
		public Product(String productID, String productName, int price, int quantity) {
			super();
			this.productID = productID;
			this.productName = productName;
			this.price = price;
			this.quantity = quantity;
		
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
}