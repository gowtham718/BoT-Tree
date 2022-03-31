package corejava;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class set_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(45);
		set.add(46);
		set.add(47);
		set.add(48);
		set.add(45);
		
		for(Integer i:set) {
			System.out.println(i);
		}

		set.remove(45);
		
		Set<Integer> set2=new LinkedHashSet<Integer>();
		set2.add(80);
		set2.add(100);
		set2.add(90);
		
		//Set<Integer> uni=new LinkedHashSet<Integer>();
		//uni.addAll(set2);
		
		Set<Integer> uni=new TreeSet<Integer>(); // this method to arrange in order
		uni.addAll(set2);
		
		for(Integer i:uni) {
			System.out.println(i);
		}
		
		uni.removeAll(set2);// it will remove all element in set2
		uni.retainAll(set2);// retail is used to find common element
		
	}
	
	

}
