package com.app.junitDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Random.class)
public class DisplayNamOrderAnnotation {
	@Order(3)
	@DisplayName("3. Test signin button")
	@Test
	public void method1() {
		System.out.println("Cllick on sign in button");
	}
	@Order(1)
	@DisplayName("1. Test Username Field")
	@Test
	public void method2() {
		System.out.println("enter the username");
	}
	@Order(4)
	@DisplayName("4. Test forgot password Field")
	@Test
	public void method3() {
		System.out.println("enter the username in forgot password");
	}
	@Order(2)
	@DisplayName("2. Test password Field")
	@Test
	public void method4() {
		System.out.println("enter the username password");
	}
}
