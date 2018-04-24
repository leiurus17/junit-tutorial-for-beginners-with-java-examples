package com.kamotelabs.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void lengthBasicTest() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;
		
		assertEquals(expectedLength, actualLength);
		// Assert length == 4
		// Write test code
		// Invoke method square(4) Code under test
		// Checks in place - 16 => Assertions
	}
	
	@Test
	void toUpperCaseTest() {
		String str = "abcd";
		String result = str.toUpperCase();
		
		assertEquals("ABCD", result);
		assertNotNull(result);
		// assertNull(result);
	}
	
	@Test
	void containsBasic() {
		String str = "abcdefgh";
		boolean result = str.contains("cddef");
		assertEquals(false, result);
		assertFalse(result);
	}

}
