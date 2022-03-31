package SixthQuestion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator calculator=new Calculator();
		int received_result=calculator.add(6, 6);
		   assertEquals(12,received_result,"success");
			}

}
