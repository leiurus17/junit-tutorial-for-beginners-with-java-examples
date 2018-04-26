package com.kamotelabs.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringTest {

	@BeforeEach
	void beforeEach() {
		System.out.println("Initialize Test Data for each test.");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Clean up Test Data.");
	}

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

		assertEquals("ABCD", str.toUpperCase());
		assertNotNull(str.toUpperCase());
		// assertNull(result);
	}

	@Test
	void containsBasic() {
		String str = "abcdefgh";

		assertEquals(false, str.contains("cddef"));
		assertFalse(str.contains("cddef"));
	}

	@Test
	void splitBasic() {
		String str = "abc def ghi";
		String[] actualResult = str.split(" ");
		String[] expectedResult = new String[] { "abc", "def", "ghi" };

		assertArrayEquals(actualResult, expectedResult);
	}

}
