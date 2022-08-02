package com.junit.mavenproject;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TestAnnotation {

	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println("Before class method");
	}
	@Before
	public  void beforeMethod() {
		System.out.println("Before method");
	}
	@AfterClass
	public  static void afterMethod() {
		System.out.println("After class");
	}
	@After
	public void AfterMethod() {
		System.out.println("After method");
	}
	@Ignore
	public  static void ignoreMethod() {
		System.out.println("Ignore Method");
	}
	@Test(timeout=300)
	public void testMethod(){
		System.out.println("Test Method ");
	}
	@Test(timeout=100)
	public  void testMethod1(){
		System.out.println("Test Method 1");
	}

}
