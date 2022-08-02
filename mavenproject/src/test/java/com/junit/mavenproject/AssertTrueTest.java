package com.junit.mavenproject;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AssertTrueTest {
	public boolean isEvenNumber(int number) {
		boolean result = false;
		if (number % 2 == 0) {
			result = true;
		}
		return result;
	}

	@Test
	public void evenNumberTest() {
		AssertTrueTest att = new AssertTrueTest();
		assertTrue(att.isEvenNumber(4));
	}
}
