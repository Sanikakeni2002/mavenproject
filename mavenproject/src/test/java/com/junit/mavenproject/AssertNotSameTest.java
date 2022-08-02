package com.junit.mavenproject;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class AssertNotSameTest {
	public String getPropValue(final String key) {
		
		Map<String, String> appProps = new HashMap<String, String>();
		appProps.put("Key1", "value 1");
		appProps.put("Key2", "value 2");
		appProps.put("Key3", "value 3");
		return appProps.get(key);
	}
	@Test
	public void isSameReferenceTest(){
		AssertNotSameTest anst =new AssertNotSameTest();
		assertSame (anst.getPropValue("key1"), anst.getPropValue("key2"));
	}
	
}
