package com.junit.mavenproject;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class AssertNotNullTest {
	public String getPropValue(final String key) {
		Map<String, String> appProps = new HashMap<String, String>();
		appProps.put("Key1", "value 1");
		appProps.put("Key2", "value 2");
		appProps.put("Key3", "value 3");
		return appProps.get(key);

	}

	@Test
	public void test() {
		AssertNotNullTest annt = new AssertNotNullTest();
		aasertNotNull(annt.getPropValue("key1"));
	}

private void aasertNotNull(String propValue) {
		
	}
}
