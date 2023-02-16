package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		double result = calculator.add(50,  10);
		
		assertEquals(60, result, 0);
	}

}
