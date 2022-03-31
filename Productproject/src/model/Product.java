package model;

public class Product {
	    String ProductId;
		String ProductName;
		String ProductCategory;
		String ProductBrand;
		float Productprice;
		int Productrating;


	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productId, String productName, String productCategory, String productBrand,
			float productprice, int productrating) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductCategory = productCategory;
		ProductBrand = productBrand;
		Productprice = productprice;
		Productrating = productrating;
	}
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductCategory() {
		return ProductCategory;
	}
	public void setProductCategory(String productCategory) {
		ProductCategory = productCategory;
	}
	public String getProductBrand() {
		return ProductBrand;
	}
	public void setProductBrand(String productBrand) {
		ProductBrand = productBrand;
	}
	public float getProductprice() {
		return Productprice;
	}
	public void setProductprice(float productprice) {
		Productprice = productprice;
	}
	public int getProductrating() {
		return Productrating;
	}
	public void setProductrating(int productrating) {
		Productrating = productrating;
	}
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductCategory="
				+ ProductCategory + ", ProductBrand=" + ProductBrand + ", Productprice=" + Productprice
				+ ", Productrating=" + Productrating + "]";
	}
	
	

}
