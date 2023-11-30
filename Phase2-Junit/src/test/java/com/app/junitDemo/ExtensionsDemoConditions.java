package com.app.junitDemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ExtensionsDemoConditions {
	
	//condition on os
	//conditions based on jre
	//conditions base on jre range
	@Test
	@EnabledOnOs(OS.WINDOWS)
	public void conditionWindows() {
		System.out.println("Execute test cases on windows..");
	}
	@Test
	@EnabledOnOs(OS.MAC)
	public void conditionOS() {
		System.out.println("Execute test cases on mac..");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_17)
	public void conditionJRE() {
		System.out.println("Execute test cases on Java version only..");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_14)
	public void conditionJRE14() {
		System.out.println("Execute test cases on Java version only..");
	}
	@Test
	@EnabledForJreRange(min = JRE.JAVA_10, max=JRE.JAVA_20)
	public void conditionJreRange() {
		
		System.out.println("execute test cases with java version 11 to 20");
		
	}

}
