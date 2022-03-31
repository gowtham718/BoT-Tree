package JFS.BookShopApp;

import org.springframework.stereotype.Component;

@Component
public class MyFirstBookImpl implements MyfirstBookInterface{
	@Override
	public void my1stBook() {
		System.out.println("im from interface implemented thro myfirstbookimpl class");
	}
}
