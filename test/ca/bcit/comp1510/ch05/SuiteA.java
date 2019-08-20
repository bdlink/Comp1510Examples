package ca.bcit.comp1510.ch05;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * A demonstration of a test-suite.
 * 
 * @author blink
 * @version 1
 */
@RunWith(value = Suite.class)
@SuiteClasses(value = { CaseA.class })
public class SuiteA { }
