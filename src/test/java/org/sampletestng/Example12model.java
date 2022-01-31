package org.sampletestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example12model {
	@Test
	private void tc1() {
	System.out.println("Test 1");
	}
	@Test
	private void tc2() {
	System.out.println("Test 2");
	Assert.assertTrue(false);
	}
}
