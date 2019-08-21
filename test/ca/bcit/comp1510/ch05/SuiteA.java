package ca.bcit.comp1510.ch05;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * A demonstration of a test-suite.
 * 
 * @author blink
 * @version 1
 */
@RunWith(JUnitPlatform.class)
@SelectClasses(CaseATest.class)
public class SuiteA { }
