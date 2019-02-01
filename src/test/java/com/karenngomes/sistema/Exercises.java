package com.karenngomes.sistema;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Exercises {
	
	@Test
	public void arrayOfInts() {
		Integer[] ints = new Integer[] {7, 5, 12, 16};
		
		assertThat(ints, arrayWithSize(4));
		
		assertThat(ints, arrayContaining(7, 5, 12, 16));
	}
	
}
