package com.junit.mavenproject;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdditionDemoTest {
	@Test
	public void addTest() {
		int result = AdditionDemo.add(30, 50);
		System.out.println("Addition result is: " + result);
		assertEquals(80, result);
	}

	@Test
	public void subTest() {
		int result = AdditionDemo.add(80, 50);
		System.out.println("Subtraction result is: " + result);
		assertEquals(130, result);
	}

	@Test
	public void mulTest() {
		int result = AdditionDemo.add(30, 50);
		System.out.println("Multiplication result is: " + result);
		assertEquals(1500, result);
	}
}
