package ca.bcit.comp1510.ch05;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * A test-suite that calls two other test-suites.
 * 
 * @author blink
 * @version 1
 */
@RunWith(value = Suite.class)
@SuiteClasses(value = { SuiteA.class, SuiteB.class })
public class MasterSuite { }
