package com.kamotelabs.junit5;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class StringTest {
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Initialize connection to database.");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Close connection to database.");
	}

	// TestInfo class is not present in JUnit 4
	
	@BeforeEach // @Before in JUnit 4
	void beforeEach(TestInfo info) {
		System.out.println("Initialize Test Data " + info.getDisplayName());
	}
	
	@AfterEach // @Before in Junit 4
	void afterEach(TestInfo info) {
		System.out.println("Clean up Test Data " + info.getDisplayName());
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
	
	@Test
	@DisplayName("When length is null, throw an exception.")
	void lengthExceptionTest() {
		String str = null;
		assertThrows(NullPointerException.class,
				() -> {
					str.length();
				}
				);
	}
	
	@Test
	void lengthGreaterThanZero() {
		assertTrue("ABCD".length() > 0);
		assertTrue("ABC".length() > 0);
		assertTrue("A".length() > 0);
		assertTrue("DEF".length() > 0);
	}

}
