// using groups->regression 
//->exclude ->if you want to ignore 300 testcase from 1000 testcases,give the group name @Test(group="smoke) 
//in the .xml 


package org.sampletestng;

import org.testng.annotations.Test;

public class Example11model {
		@Test(groups="smoke")
		public void tc1() {
		System.out.println("Test 1");
		}
		@Test(groups="regression")
		public void tc2() {
		System.out.println("Test 2");
		}
}
