package JFS.BookShopApp;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LogInfoClass {
	@Before(value = "execution(public void displayMyBook())")
	public void logmethod() {
		System.out.println("log info : method is inside mybook");
		System.out.println("log info : method name is displaymybook");
		System.out.println("log info : no argument list");
	}
//	@After(value="execution(public void displayMyBook())")
//	public void afterlogmethod() {
//		System.out.println("log info : method is outside my book");
//		System.out.println("log info : method name is displaymybook");
//		System.out.println("log info : no argument list");
//	}
	@After(value="execution(public void displayMyBook())")
	public void afterlogmethod(JoinPoint jointPoint) {
		System.out.println("log info : "+jointPoint.getSignature().getName());
		System.out.println("log info : method name is displaymybook");
		System.out.println("log info : no argument list");
	}
//	@AfterReturning(value="execution(public Integer artistCount())",returning= "artistCount")
//		public void AfterReturningArtistCount() {
//		System.out.println("log info : AfterReturningArtistCount needs To be added");
//		System.out.println(" artist value returned succeefully after executing the method");
//	}
	@Around(value="execution(public void displayMyBook())")
	public void ArounddisplayMyBook(JoinPoint jointPoint) {
		System.out.println("log info : "+jointPoint.getSignature().getName());
	}
//	@Around(value="execution(public void displayMyBook())")
//	public void ArounddisplayMyBook() {
//		System.out.println("log info : displaymethod is in progess");
//	}
////	@Pointcut("execution(public * MyBook.*(..))")
//	@Pointcut("within(BookShopApp.*)")
//	public void selectOne() {
//		
//	}
//	@Around("selectOne()")
//	public void AroundSelectedOnePrintcut() {
//			System.out.println("log info : .........");
//	}
}
