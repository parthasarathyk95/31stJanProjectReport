package org.sampletestng;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Example13Retryclass implements IRetryAnalyzer{
int min = 0;
int max = 3;
public boolean retry(ITestResult arg0) {
	if (min<max) {
		min++;
		return true;
	}
	return false;
}

}
