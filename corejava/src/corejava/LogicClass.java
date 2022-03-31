package corejava;

import java.util.Scanner;

public class LogicClass {
	public void product_id() {
		Scanner s=new Scanner(System.in);
		String productid =s.next();
		if (productid.length()<5) {
			throw new MyOwnException("this is not my product id format");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
