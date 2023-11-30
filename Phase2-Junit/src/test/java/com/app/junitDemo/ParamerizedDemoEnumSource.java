package com.app.junitDemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ParamerizedDemoEnumSource {
	
	enum values{
		
		Selenium,
		Jmeter,
		Juint,
		TestNG
		
		
	}
	
	@ParameterizedTest(name="Enum value{arguments}")
	@EnumSource(values.class)
	public void passvaluesEnumSource(Object value) {
		
		
		System.out.println(value.toString());
	}

}
