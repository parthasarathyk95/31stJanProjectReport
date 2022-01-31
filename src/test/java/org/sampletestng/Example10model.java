package org.sampletestng;

import org.testng.annotations.Test;

public class Example10model {
@Test(groups="smoke")
public void tc1() {
System.out.println("Test 1");
}
@Test(groups="sanity")
public void tc2() {
System.out.println("Test 2");
}
}
