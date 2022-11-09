package org.globant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/***
 * Just a test class to see if TestNG works properly
 *
 */
public class TestNGTest {
    Logger log = LoggerFactory.getLogger(TestNGTest.class);
    @Test
    public void TestTester(){
        log.info("I made it?");
    }
}
