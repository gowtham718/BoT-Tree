package mypkg;


public class product {
	private int pid;
	private String productName;
	public product() {
		super();
		// TODO Auto-generated constructor stub
		
		
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + "]";
	}
	
	

}
