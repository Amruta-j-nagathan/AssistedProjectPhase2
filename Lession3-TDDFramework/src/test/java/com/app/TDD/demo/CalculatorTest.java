package com.app.TDD.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
	
	Calculator calculator = new Calculator();
	@Test
	public void testAdd() {
		
		int a = 5;
		int b = 7;
		
		int result = calculator.add(a, b);
		
		//Assert
		
		Assert.assertEquals(result, 12,"addition result is incorrect");
		
		
		
	}
	@Test
	public void testSub() {
		
		int a = 7;
		int b = 2;
		
		int result = calculator.sub(a, b);
		
		//Assert
		
		Assert.assertEquals(result, 5,"addition result is correct");
		
		
		
	}

}
