package com.kamotelabs.junit5;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class SampleRepeatedTest {
	
	@Test
	@RepeatedTest(10)
	void containsBasicRepeat() {
		assertFalse("abcdefgh".contains("ijk"));
	}

}
