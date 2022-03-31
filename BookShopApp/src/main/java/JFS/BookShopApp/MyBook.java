package JFS.BookShopApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyBook {
@Autowired
@Qualifier("myChoise")
MyChoise myChoise;
@Autowired
MyfirstBookInterface myfirstBookInterface;
@Autowired

MyFirstBookImpl myFirstBookImpl;
	
	public MyChoise getMyChoise() {
		return myChoise;
	}
	public void setMyChoise(MyChoise myChoise) {
		this.myChoise = myChoise;
	}
	
	
	public void displayMyBook() {
		System.out.println("My Book name is java 17");
		myChoise.displayMyChoise();
		myChoise.my1stBook();
		myfirstBookInterface.my1stBook();
		myFirstBookImpl.my1stBook();
		}
}
