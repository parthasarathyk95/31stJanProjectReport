// example10->using groups-smoke&sanity in .xml runas by Suite
package org.sampletestng;

import org.testng.annotations.Test;

public class Example10hello {
@Test(groups="smoke")
public void tc11() {
System.out.println("Test 11");
}
@Test(groups="sanity")
public void tc22() {
System.out.println("Test 22");
}
}
