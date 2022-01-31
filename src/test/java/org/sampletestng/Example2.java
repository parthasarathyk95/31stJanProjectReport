// example 2 -> using testng @Test with priority bases (@TEst)main class works  
package org.sampletestng;

import org.testng.annotations.Test;

public class Example2 {
	@Test(priority=-20)
	private void tc4() {
		System.out.println("Test2");
	}
	@Test
	private void tc5() {
		System.out.println("Test3");
	}
	@Test(priority=0)
	private void tc2() {
		System.out.println("Test2");
	}
	@Test(priority=-4)
	private void tc3() {
		System.out.println("Test3");
	}
	@Test(priority=2)
	private void tc1() {
		System.out.println("Test1");
	}

}
