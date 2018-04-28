package com.kamotelabs.junit5;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SampleParameterizedTest {
	
	@ParameterizedTest
	@ValueSource(strings = {"ABCD", "ABC", "A", "DEF"})
	void lengthGreaterThanZeroUsingParameterizeTest(String str) {
		assertTrue(str.length() > 0);
	}

}
