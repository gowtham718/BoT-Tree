package Product;

import java.util.Objects;
import java.util.Scanner;

public class Product_Drive extends Product_Basic_Info {
	
	public static void main(String[] args) {
		boolean running = true;
	Amazon amazon=new Amazon();
	//Online_Shopping obj2=new Online_Shopping();
	
	amazon.printavailableitems();


	while (running) {
		System.out.println("enter the product  id u need to buy ");
		Scanner s=new Scanner(System.in);
		String Product_Id=s.next();
		System.out.println("ur product id : " + Product_Id);
		for   (Product_Basic_Info p : amazon.getAvailable_product()) {
			//System.out.println(p.getProduct_Id());
			if (Product_Id.equals(p.getProduct_Id())) {
				
				running=false;
				break;
			}
			/*else {
				System.out.println("invalid id.");
				break;
			}*/
			
	}
	amazon.emi();
	amazon.cashback();
	amazon.item_search();
	System.out.println("SUCCESS: Your order is confirmed and will be processed soon.");
	System.out.println("******** THANK YOU FOR THE SHOPPING ********");
	System.out.println("-------------- VISIT AGAIN -----------------");
	}
	}
}