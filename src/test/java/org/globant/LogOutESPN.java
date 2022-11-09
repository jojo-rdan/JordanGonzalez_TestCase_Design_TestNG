package org.globant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/***
 * Steps to log out of an ESPN account
 *
 */
public class LogOutESPN extends TestStarter{
    public Logger log = LoggerFactory.getLogger(LogOutESPN.class);
    @Test
    public void LogOut(){
        log.info("Click on the log in option on the user avatar");
        log.info("Enter the email or username");
        log.info("Enter the password");
        log.info("Click on 'Log In'");
        log.info("Click on the user avatar");
        log.info("Click on 'Log Out'");
        log.info("Click again on the user avatar");
        log.info("Verify you're out of your account");
    }
}
