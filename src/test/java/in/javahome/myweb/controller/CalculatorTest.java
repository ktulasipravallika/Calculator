package in.javahome.myweb.controller;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator cal = new Calculator();
	public void testAdd(){
		Assert.assertEquals(cal.add(10, 20), 30);
	}
	public void testMultiply(){
		Assert.assertEquals(cal.multiply(10, 20), 200);
	}
	public void testSubtract(){
		Assert.assertEquals(cal.sub(20, 10), 10);
	}
	public void testDivision(){
		Assert.assertEquals(cal.division(5, 2), 2.5);
	}
	public void testDivisionByZero(){
		try {
			cal.division(10, 0);
			fail("Expected an ArithmeticException to be thrown");
		} catch (ArithmeticException e) {
			assertEquals("Division by zero is not allowed", e.getMessage());
		}
	}

	public void testDivisionOfZeroByZero(){
		try {
			cal.division(0, 0);
			fail("Expected an ArithmeticException to be thrown");
		} catch (ArithmeticException e) {
			assertEquals("Division of 0 by 0 is undefined", e.getMessage());
		}
	}
}
