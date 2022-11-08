package org.globant;

import org.testng.annotations.Test;

import java.util.logging.Logger;

/***
 * Just a test class to see if TestNG works properly
 *
 */
public class TestNGTest {
    public Logger log = Logger.getLogger(String.valueOf(TestNGTest.class));
    @Test
    public void TestTester(){
        log.info("I made it?");
    }
}
