package com.app.junitDemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class beforeAfterEachAnnotation {
	//JavaOperation obj;
	//@BeforeEach &AfterEach are similar to TestNG : @BeforeMethod & AfterMethod
	
	
	@BeforeEach    //Execute the init() method before each test method
	public void init() {  // pre-condition method // setup method
		
		System.out.println("Start the DB Connection...");
		
		 //obj = new JavaOperation();
		
		System.out.println("Initialization Done...");
		
	}
	@AfterEach // execute teardown() after each test method
	public void tearDown() {
		System.out.println("Close DB connection... tearDown");
	}
	@Test
	public void test1() {
		System.out.println("Execution of test method-1");
	}
	@Test
	public void test2() {
		System.out.println("Execution of test method-2");
	}

}
