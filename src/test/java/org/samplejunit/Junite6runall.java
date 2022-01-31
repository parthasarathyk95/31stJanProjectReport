package org.samplejunit;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Junite6runall {
@Test
public void tc() {
 Result r = JUnitCore.runClasses(Junite5model.class, Junite5hello.class);
 System.out.println("Runcount: " +r.getRunCount());
 
 System.out.println("Failure count: " +r.getFailureCount());
 
 System.out.println("Runtime: " +r.getRunTime());
 
 System.out.println("Status: " +r.wasSuccessful());
}
}
