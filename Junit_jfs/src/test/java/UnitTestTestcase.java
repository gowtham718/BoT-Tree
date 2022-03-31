import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


class UnitTestTestcase {
	public static UnitTest unittest;
	public static Scanner scanner;
	@BeforeAll
	static void setup()
	{
		
	unittest=new UnitTest();
	scanner=new Scanner(System.in);
	
	}
	@BeforeEach
	void setupthis() {
		System.out.println("test case initiated");
	}
	@Test
	void test1() {
	//	fail("Not yet implemented");
		
		UnitTest unittest = new UnitTest();
		int received_result=unittest.add(6,2);
		assertEquals(8, received_result,"my message");
	}
	@Test
	void test2() {
		UnitTest unittest = new UnitTest();
		String received_result=unittest.add("Gowtham","raj");
		assertEquals("Gowthamraj", received_result,"my message");
	}

	@AfterEach
	void tearDown() {
		System.out.println("test case was successfull");
	}
	@AfterAll
	static void tear() {
		scanner.close();
	}
}
