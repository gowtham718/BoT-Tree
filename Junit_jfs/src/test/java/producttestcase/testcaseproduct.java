package producttestcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Product;

class testcaseproduct {

	@Test
	void test() {
		Product p=new Product("G001","Gowtham","short","polo",1200,5);
		assertEquals("G001",p.getProductId());
	}

}
