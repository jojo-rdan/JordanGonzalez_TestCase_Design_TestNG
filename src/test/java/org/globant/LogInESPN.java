package org.globant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/***
 * Steps for logging into an ESPN account
 *
 */
public class LogInESPN extends TestStarter{
    public Logger log = LoggerFactory.getLogger(LogInESPN.class);
    @Test
    public void loginAttemptSuccessfully(){
        log.info("Click on the 'Log In' option on the user avatar");
        log.info("Enter the email or username");
        log.info("Enter the password");
        log.info("Click on 'Log In'");
        log.info("Click again on the user avatar");
        log.info("Verify that you are in your account");
    }
    @Test
    public void loginAttemptUnsuccessfully(){
        log.info("Click on the 'Log In' option on the user avatar");
        log.info("Enter the email or username");
        log.info("Enter the password");
        log.info("Click on 'Log In'");
        log.info("Verify that there are no errors in your username or password");
    }
}
