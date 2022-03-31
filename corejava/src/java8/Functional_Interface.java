package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
public class Functional_Interface {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30);
		
		Function<Integer,Integer> funref=new Function<Integer,Integer>(){
		public Integer apply(Integer i){
		return i*2;
		}
		};
		
	/*	Function<Integer,Integer> funref=(Interger i)->{  // another method for the same function
		return i*2;
			}
		};*/
		
		Stream s=list.stream();
		Stream s1=s.map(funref);
		//list.stream().map(funref).forEach(System.out::println);
		s1.forEach(System.out::println);
	}

}
