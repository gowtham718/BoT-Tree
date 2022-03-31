package java11;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

public class Functional_Interface {

	public static void main(String[] args) {
			List<Integer> list=List.of(10,20,30);
		
		Function<Integer,Integer>funref=(i)->{
			return i*2;
		};


        Stream s=list.stream();
        Stream s1=s.map(funref);
        list.stream().map(funref).map(i->i*2).filter(x->x<10).forEach(System.out::println);
        s1.forEach(System.out::println);
        
/*Set<Integer> set=Set.of(10,20,30);
		
		Function<Integer,Integer>funnref=(i)->{
			return i*2;
		};


        Stream s2=list.stream();
        Stream s3=s2.map(funnref);
        list.stream().map(funnref).map(i->i*2).filter(x->x<10).forEach(System.out::println);
        s3.forEach(System.out::println);*/
	}
	}