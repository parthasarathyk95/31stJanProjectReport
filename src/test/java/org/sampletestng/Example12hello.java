package org.sampletestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example12hello {
	@Test
	private void tc11() {
	System.out.println("Test 11");
	Assert.assertTrue(false);
	}
	@Test
	private void tc22() {
	System.out.println("Test 22");
	}
}
