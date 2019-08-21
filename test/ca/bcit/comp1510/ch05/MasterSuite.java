package ca.bcit.comp1510.ch05;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;


/**
 * A test-suite that calls two other test-suites.
 * 
 * @author blink
 * @version 1
 */
@RunWith(JUnitPlatform.class)
@SelectClasses({SuiteA.class, SuiteB.class})
public class MasterSuite { }
