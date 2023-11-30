package com.app.junitDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAfterAllAnnotation {
	@BeforeAll  // it will be executed before all test methods
	public void init() {
		
		System.out.println("Start the DB");
		System.out.println("Initialization Done...");
		
	}
	
	@AfterAll  // it will be executed after all test metods execution completed
	public void tearDown() {
		
		System.out.println("Stop DB ");
	}
	
	
	@Test
	public void method1() {
		System.out.println("Executing method 1 of code class");
	}
	@Test
	public void method2() {
		System.out.println("Executing method 2 of code class");
	}

}
