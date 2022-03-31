package java11;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

// methods - newly introduced
// isBlank
// lines() method
//repeat()
//strip
//strip leading
//strip trailing

public class java11demo {
	public static void isBlankExample(){
	String s1="\n\t          ";
	System.out.println(s1.isBlank());	
	}
	public static void linesExample(){
		String s2="hi dear   \n welcome to mu home"+"bye buddy \n getback to u tomorow";
		Stream<String> l=s2.lines();
		l.forEach(System.out::println);
	
	}
	public static void repeatExample() {
		String s=" * | * ";
		System.out.println(s.repeat(15));	
	}
	public static void StripExample() {
		String s=" welo hduj edfju jnfjen ";
		System.out.println(s.strip());
		System.out.println(s.stripTrailing());	
		System.out.println(s.stripLeading());	
	}
	
	public static void TimeUnitExample() {
		TimeUnit mydate=TimeUnit.HOURS;
		System.out.println(mydate.convert(Duration.ofDays(2)));
		System.out.println(mydate.convert(Duration.ofHours(2)));
		TimeUnit mydays=TimeUnit.DAYS;
		System.out.println(mydays.convert(Duration.ofDays(2)));
		System.out.println(mydays.convert(Duration.ofHours(48)));
	}
	public static void main(String[] args) {
		isBlankExample();
		linesExample();
		repeatExample();
		StripExample();
		TimeUnitExample();
	}

}
