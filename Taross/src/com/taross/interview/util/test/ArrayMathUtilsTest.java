package com.taross.interview.util.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.taross.interview.util.ArrayMathUtils;

public class ArrayMathUtilsTest {

	@BeforeAll
	public static void startup() {}

	@BeforeEach
	public void setup() {}

	//Added methods and Handlings
	//Deprecated Method: replacing the usage of findMaximum() with findMax() as the former is deprecated.
	//String Array Handling: implement the findMax(String[] arr) method in the ArrayMathUtils class.
	//Edge Case Handling: Add test cases for edge cases like empty arrays (testFindMaxEmptyArray()), single element arrays (testFindMaxSingleElement()), etc.

	@Test
	public void testFindMax() {
		// test method
		int[] intArr = {0, 1, 2, 3, 4, 5};
		assertEquals(5, ArrayMathUtils.findMaximum(intArr));

		intArr = new int[] {1029, 4029, 444, 3291, 92, 11, 0};
		assertEquals(4029, ArrayMathUtils.findMax(intArr));

		// Test for string array (Uncomment when String findMax method is implemented)
        	String[] stringArr = new String[] {"abc", "abb", "acb", "def", "cgf"};
        	assertEquals("def", ArrayMathUtils.findMax(stringArr)); // Ensure findMax for String[] works
		
		// String[] stringArr = new String[] {"abc", "abb", "acb", "def", "cgf"};
		// assertEquals("def", ArrayMathUtils.findMax(stringArr));
	}

	 @Test
    	public void testFindMaxEmptyArray() {
        	int[] intArr = {};
        	assertThrows(IllegalArgumentException.class, () -> ArrayMathUtils.findMax(intArr)); // Handle empty arrays
    	}	

    	@Test
    	public void testFindMaxSingleElement() {
        	int[] intArr = {1};
        	assertEquals(1, ArrayMathUtils.findMax(intArr)); // Single element case
    	}
	
	@AfterEach
	public void tearDown() {}

	@AfterAll
	public static void shutdown() {}
}
