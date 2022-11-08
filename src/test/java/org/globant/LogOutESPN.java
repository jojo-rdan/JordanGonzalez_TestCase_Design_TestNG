package org.globant;

import org.testng.annotations.Test;

import java.util.logging.Logger;

public class LogOutESPN extends TestStarter{
    public Logger log = Logger.getLogger(String.valueOf(LogOutESPN.class));
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
