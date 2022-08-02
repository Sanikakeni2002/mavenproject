package com.junit.mavenproject;

public class CheckString {
public static boolean checkString(String s){
	s =new String("INDIAN");
	String s1=new String("INDIAN");
	if(s1.contains(s)){
		return true;
	}
	return false;
}
}