import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Controller.*;
import model.Product;
import View.*;
class producttestcase {
	public static Scanner scanner;
	
	@BeforeAll
	static void setup() {
		scanner=new Scanner(System.in);
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		Product p=new Product("G001","Gowtham","short","polo",1200,5);
		assertEquals("G001",p.getProductId());
	}

}
