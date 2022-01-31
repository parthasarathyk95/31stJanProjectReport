
//example 1 -> using testng initialize and check the annotations like @BeforeMethod,@BeforeClass,@AfterClass,@AfterMethosd,@Test  
package org.sampletestng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Example1 {
	@Test
	private void tc2() {
		System.out.println("Test2");
	}
	@Test
	private void tc3() {
		System.out.println("Test3");
	}
	@Test
	private void tc1() {
		System.out.println("Test1");
	}
	@BeforeMethod
	private void beforstarttime() {
		System.out.println("TC Started");
	}
	@BeforeClass
	private static void start() {
	System.out.println("start");
	}
	@AfterClass
	private static void end() {
	System.out.println("end");	
	}
	@AfterMethod
	private void endtime() {
	 System.out.println("TC ended");
	}
}
