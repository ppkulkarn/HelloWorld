package com.pk.training;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator mycalc = new Calculator();
	
	
	@Test
	public void addTwoNumbertest() {
		assertEquals(10,mycalc.addTwoNumbers(5, 5) );
	}
		
		@Test
		public void subTwoNumbertest() {
			assertEquals(10,mycalc.subTwoNumbers(15, 5) );
			
		
		
	}

}
