package org.globant;

import org.testng.annotations.Test;

import java.util.logging.Logger;

/***
 * Steps to deactivate an ESPN account
 *
 */
public class DeactivateUserESPN extends TestStarter{
    public Logger log = Logger.getLogger(String.valueOf(LogInESPN.class));
    @Test
    public void AccountDeactivation(){
        log.info("Click on the 'Log In' option on the user avatar");
        log.info("Enter the email or username");
        log.info("Enter the password");
        log.info("Click on 'Log In'");
        log.info("Click again on the user avatar");
        log.info("Click on 'ESPN Profile' option");
        log.info("Click on 'Delete Account' option");
        log.info("Click on 'Yes, delete this account' button");
        log.info("Click on 'OK' button");
        log.info("Click again on the user avatar");
        log.info("Verify you're out of your account");
        log.info("Click on the 'Log In' option on the user avatar");
        log.info("Enter the email or username");
        log.info("Enter the password");
        log.info("Verify that your account has been deactivated");
    }
}
