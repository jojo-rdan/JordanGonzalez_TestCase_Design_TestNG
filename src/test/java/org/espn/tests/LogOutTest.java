package org.espn.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.core.Is.is;

public class LogOutTest extends BaseTest{
    private final String email = "chutaen@gmail.com";
    private final String password = "Benjamin2022";

    @BeforeTest
    public void setUpPreviousLogIn(){
        home.mouseOverUser();
        home.clickOnLogInHomePage();
        home.goToIframe();
        home.typeEmail(email);
        home.typePassword(password);
        home.clickOnLogInButton();
        home.getOutIframe();
    }
    @Test
    public void LogOut(){
        home.mouseOverUser();
        watch.clickOnLogOutButton();
        checkThat("Validate session is log out from user panel", watch.isUsernameNotDisplayed(), is(true));
    }
}
