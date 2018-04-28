package com.kamotelabs.junit5;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.RepeatedTest;

public class SampleRepeatedTest {
	
	@RepeatedTest(10)
	void containsBasicRepeat() {
		assertFalse("abcdefgh".contains("ijk"));
	}

}
