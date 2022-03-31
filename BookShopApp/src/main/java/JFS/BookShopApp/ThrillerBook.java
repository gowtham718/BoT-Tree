package JFS.BookShopApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ThrillerBook {
	
	ThrillerBook thrillerbook;
	@Value("#{20+1}")
	int y;
	@Value("#{'hectic'+'day'}")
	private String mystring;
	public Integer artistCount() {
		Integer artist=100;
		artist+=y;
		System.out.println(artist);
		System.out.println(mystring);
		return artist;
	}
}
