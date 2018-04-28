package com.kamotelabs.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SampleCsvSourceTest {
	
	@ParameterizedTest
	@CsvSource(value = {"abcd, ABCD", "abc, ABC", "'', ''", "abcdef, ABCDEF"})
	void upperCase(String word, String capitalizedWord) {
		assertEquals(capitalizedWord, word.toUpperCase());	
	}
	
	@ParameterizedTest(name = "{0} length is {1}")
	@CsvSource(value = {"abcd, 4", "abc, 3", "'', 0", "abcdef, 6"})
	void expectedLength(String word, int expectedLength) {
		assertEquals(expectedLength, word.length());
	}

}
