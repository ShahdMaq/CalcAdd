package najah.edu.test;
import najah.edu.code.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class calcTest {
	
	@Test
    public void testAdd() {
		// Given
		calc calculator = new calc();
		// When
		int result = calculator.add(2,2);
		// Then
		assertEquals(4, result);
	}
	
	@Test
	public void testMinus() {
		calc calculator = new calc();
		assertEquals(0, calculator.subtract(2, 2));
	}
	
	@Test
	public void testDivide() {
		calc calculator = new calc();
		assertEquals(2, calculator.divide(6, 3));
	}
	
}
