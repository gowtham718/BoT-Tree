
package com.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bookutil {
@Autowired
Book book;

public void offer(@Value("{book.BookPrice}")String p){
	int price=Integer.parseInt(p);
if(price<50) {
	System.out.println("no offer...try later");
}
}
}