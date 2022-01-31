package org.samplejunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.sample1.ExampleQ3;

@RunWith(Suite.class)
@SuiteClasses({Example3_pom.class,ExampleQ3.class})
public class Example3_runall {

}
