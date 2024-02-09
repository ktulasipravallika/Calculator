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
		Assert.assertEquals(cal.division(100, 0), 10);
	}
}
