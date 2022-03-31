package myPkg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import myPkg.entity.Product;
	public interface ProductRepository extends JpaRepository<Product,Integer>{

		Product findByName(String name);

		//Product findByquantity(int quantity);
		
	}

