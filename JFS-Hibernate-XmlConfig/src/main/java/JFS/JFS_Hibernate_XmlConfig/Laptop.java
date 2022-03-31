package JFS.JFS_Hibernate_XmlConfig;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Laptop {
	
	@Id
	private int id;
	private String brand;
	private int price;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int id, String brand, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}
	
	

}
