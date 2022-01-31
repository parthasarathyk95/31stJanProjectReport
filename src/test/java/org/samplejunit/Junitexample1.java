package org.samplejunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junitexample1 {
	@Test
	public void tc2() {
		System.out.println("Test2");
	}
	@Test
	public void tc3() {
		System.out.println("Test3");
	}
	@Test
	public void tc1() {
		System.out.println("Test1");
	}
	@Before
	public void before() {
		System.out.println("TC Started");
	}
	@After
	public void after() {
	 System.out.println("TC ended");
	}
	@BeforeClass
	public static void befcls() {
	System.out.println("start");
	}
	@AfterClass
	public static void aftcls() {
	System.out.println("end");	
	}
}
