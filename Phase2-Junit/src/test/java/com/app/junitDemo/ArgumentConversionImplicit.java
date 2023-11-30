package com.app.junitDemo;

import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ArgumentConversionImplicit {
	// junit will automatically convert the datatype of input source in to desired datatype by test method
	//Source=string
	//implicit convert to timeunit
	
	@ParameterizedTest
	@ValueSource(strings = "SECONDS")
	public void testwithImplicitArgumentsConversion(ChronoUnit chronoUnit) {
		
		System.out.println(chronoUnit.name());
		Assertions.assertNotNull(chronoUnit.name());
		
	}

}
