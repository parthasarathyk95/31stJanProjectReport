package org.sampletestng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;


public class Eaxmple14annotationclass implements IAnnotationTransformer{
	public void transform(ITestAnnotation a,Class arg1 ,Constructor arg2, Method arg3) {
		IRetryAnalyzer analyser = a.getRetryAnalyzer();
		if (analyser==null) {
			a.setRetryAnalyzer(Example13Retryclass.class);
		}
	}
}
