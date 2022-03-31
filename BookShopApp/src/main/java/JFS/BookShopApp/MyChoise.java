package JFS.BookShopApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MyChoise implements MyfirstBookInterface{
	public void displayMyChoise() {
		System.out.println("My choise of book");
		}
	
	@Override
	public void my1stBook() {
		System.out.println("im from interface implemented thro mychoise class");
	}
}
