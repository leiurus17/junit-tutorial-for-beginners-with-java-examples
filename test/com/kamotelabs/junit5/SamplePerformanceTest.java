package com.kamotelabs.junit5;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 



public class SamplePerformanceTest {
	
	@Test
	void performanceTest() {
		assertTimeout(Duration.ofSeconds(5),
				() -> {
					for(int i = 0; i <= 1_000_000; i++) {
						int j = i;
						System.out.println(j);
					}
				}
				);
	}

}
