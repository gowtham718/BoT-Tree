package java11;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map1=new HashMap<Integer,String>();
		
		map1.put(11,"abraham");
		map1.put(2,"issac");
		
		for(Entry m:map1.entrySet()){
		    System.out.println(m.getKey()+""+m.getValue());
		    
	}
	map1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
}
		
	}
