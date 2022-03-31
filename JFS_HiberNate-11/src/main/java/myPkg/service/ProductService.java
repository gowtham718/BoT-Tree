package myPkg.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myPkg.entity.Product;
import myPkg.repository.ProductRepository;
@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	public List<Product> saveProducts(List<Product> products) {
		return productRepository.saveAll(products);
		
	}
	public List<Product> getProducts() {
		return productRepository.findAll();
		
	}
	public Product getProductByName(String name){
		return productRepository.findByName(name);
	}
	public Product getProductById(int id) {
		
		return productRepository.findById(id).orElse(null);
	}
//public Product getProductByquantity(int quantity) {
//		
//		return productRepository.findByquantity(quantity);//.orElse(null);
//	}
public Product updateProduct(Product product) {
	// TODO Auto-generated method stub
	Product availableProduct=productRepository.findById(product.getId()).orElse(null);
	availableProduct.setQuantity(100);
	return productRepository.save(availableProduct);
}
public String deleteProduct(int id) {
	// TODO Auto-generated method stub
	productRepository.deleteById(id);
	return "Product Removed is:" +id;
}
	

}
