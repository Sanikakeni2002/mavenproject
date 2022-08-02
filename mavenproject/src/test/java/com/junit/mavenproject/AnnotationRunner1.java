package com.junit.mavenproject;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AnnotationRunner1 {

	public static void main(String[] args) {
		Result result= JUnitCore.runClasses(TestAnnotation.class);
		for(Failure failure: result.getFailures()){
			 System.out.println(failure.toString());
		 }
		 System.out.println(result.wasSuccessful());

	}

}
