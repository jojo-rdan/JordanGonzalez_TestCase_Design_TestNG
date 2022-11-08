package org.globant;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.util.logging.Logger;

/***
 * Steps to validate before starting the subsequent tests
 *
 */
public class TestStarter {
    public Logger log = Logger.getLogger(String.valueOf(TestStarter.class));
    @BeforeSuite
    public void AccountValidator(){
        log.info("Open the browser");
        log.info("Go to the link https://www.espnqa.com/?_adbock=true&src=com&espn=cloud");
        log.info("Click on the avatar, on the 'Log In' option");
        log.info("If an account has not been created, select 'Log In' option");
        log.info("Otherwise, click on the 'Sign Up' option to create an account, if necessary");
    }

    @AfterTest
    public void CloseBrowser(){
        log.info("Close the browser");
    }
}
